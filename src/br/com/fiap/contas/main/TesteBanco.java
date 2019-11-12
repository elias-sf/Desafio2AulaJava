package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.Conta;
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
			if(i == 4)
			banco.adiciona(conta, true);
			else
			banco.adiciona(conta, false);
		}
		banco.mostraConta();
		Conta contaPesquisa = new ContaCorrente();
		//contaPesquisa.setTitular("Titular " + 0);
		contaPesquisa.setTitular("Titular A");
			
		System.out.println(banco.buscaPorTitular(contaPesquisa.getTitular()).getTitular());

	}

}
