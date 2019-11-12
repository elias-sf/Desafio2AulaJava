package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TesteBanco {

	public static void main(String[] args) {

		Banco banco = new Banco("CaelumBank", 999);

		for (int i = 0; i < 5; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Titular " + i);
			conta.setNumero(i);
			conta.setAgencia("Agencia " + i);
			conta.deposita(i * 1000);
			banco.adiciona(conta);
			banco.mostraConta();
		}

	}

}
