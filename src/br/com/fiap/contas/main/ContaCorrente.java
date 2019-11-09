package br.com.fiap.contas.main;

import java.util.Collection;

import br.com.fiap.contas.main.Conta;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void saca(double valor) {
		if(valor < 0)
			throw new IllegalArgumentException(
					"Valor negativo é ilegal");
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
