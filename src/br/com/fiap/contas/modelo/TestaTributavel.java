package br.com.fiap.contas.modelo;

import br.com.fiap.contas.main.ContaCorrente;
import br.com.fiap.contas.main.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getValorImposto());
		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
	}

}
