package br.com.fiap.contas.modelo;

import br.com.fiap.contas.modelo.Conta;

public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		
		return "Conta" + "Poupanca";
		
	}
}
