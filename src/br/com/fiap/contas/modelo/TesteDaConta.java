package br.com.fiap.contas.modelo;

import br.com.fiap.contas.main.Conta;
import br.com.fiap.contas.main.ContaCorrente;
import br.com.fiap.contas.main.ContaPoupanca;
import br.com.fiap.contas.main.SeguroDeVida;

public class TesteDaConta {

	public static void main(String[] args) {

		try {
			comecar(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void comecar(boolean flagSaldoZero) {

		// Conta conta = new Conta();

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.setSaldo(100.00);
		cc.setAgencia("00123");
		cc.setNumero(123456);
		cc.setTitular("Teste1");
		populaEscreveSeguroDeVida(cc);

		cp.setSaldo(111.00);
		cp.setAgencia("00456");
		cp.setNumero(323987);
		cp.setTitular("Teste2");

		if (flagSaldoZero)
			cc.deposita(0);
		else
			cc.deposita(1000.0);
		cc.saca(500.00);

		if (flagSaldoZero)
			cp.deposita(0);
		else
			cp.deposita(100.0);
		cp.saca(50.00);

		escreve(cc);
		escreve(cp);

	}

	public static void escreve(Conta obj) {

		System.out.println(" ");
		System.out.println("Saldo:" + " " + obj.getSaldo());
		System.out.println(" ");
		System.out.println("Agencia:" + " " + obj.getAgencia());
		System.out.println(" ");
		System.out.println("Numero:" + " " + obj.getNumero());
		System.out.println(" ");
		System.out.println("Titular:" + " " + obj.getTitular());
		System.out.println(" ");
		System.out.println(obj.getTipo());

		try {

			ContaCorrente ccTemporaria = (ContaCorrente) obj;
			System.out.println("Valor do imposto:" + " " + ccTemporaria.getValorImposto());

		} catch (Exception e) {
			System.err.println("Conta Poupança não possui taxa");
		}

	}

	public static void populaEscreveSeguroDeVida(Conta obj) {
		SeguroDeVida sv = new SeguroDeVida();
		sv.setTitular(obj.getTitular());
		sv.setNumeroApolice(25997);
		sv.setValor(obj.getSaldo());

		System.out.println("Titular Seguro de Vida:" + " " + sv.getTitular());
		System.out.println(" ");
		System.out.println("Numero Apolice(Seguro de Vida):" + " " + sv.getNumeroApolice());
		System.out.println(" ");
		System.out.println("Valor(Seguro de Vida):" + " " + sv.getValor());
		System.out.println(" ");
		System.out.println("Valor do Imposto(Seguro de Vida):" + " " + sv.getValorImposto());
		System.out.println(" ");
		System.out.println("Tipo(Seguro de Vida):" + " " + sv.getTipo());

	}
}
