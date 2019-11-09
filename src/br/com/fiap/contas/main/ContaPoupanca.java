package br.com.fiap.contas.main;

import br.com.fiap.contas.main.Conta;

public class ContaPoupanca extends Conta {

	@Override
	public String getTipo() {
		
		return "Conta" + "Poupanca";
		
	}
}
