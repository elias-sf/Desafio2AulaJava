package br.com.fiap.contas.modelo;

import java.util.Collection;

import br.com.fiap.contas.excecao.SaldoInsuficienteException;
import br.com.fiap.contas.modelo.Conta;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void saca(double valor) {
		if(valor < 0)
			throw new IllegalArgumentException(
					"Valor usado para sacar é negativo");
		
		else if(this.saldo < valor)
			throw new SaldoInsuficienteException("Não possui valor em conta para saque", valor);
		else
		this.saldo -= (valor + 0.10);
	}

	@Override
	public String getTipo() {
		
		return "Conta" + "Corrente";
		
	}

	@Override
	public double getValorImposto() {
		
		return this.getSaldo() * 0.01;
	}
	

}
