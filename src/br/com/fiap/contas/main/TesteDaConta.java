package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.SeguroDeVida;

public class TesteDaConta {

	public static void main(String[] args) {

		try {
			comecar(false);
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
			cc.deposita(5600.0);
		cc.saca(500.00);

		if (flagSaldoZero)
			cp.deposita(0);
		else
			cp.deposita(500.0);
		cp.saca(50.00);

		escreve(cc);
		escreve(cp);

	}

	public static void escreve(Conta obj) {

		System.out.println("------------------------------------------");
		System.out.println(obj.toString());
		System.out.println("Saldo:" + " " + obj.getSaldo());
		System.out.println(" ");
		System.out.println("Agencia:" + " " + obj.getAgencia());
		System.out.println(" ");
		System.out.println("Numero:" + " " + obj.getNumero());
		System.out.println(" ");
		System.out.println("Titular:" + " " + obj.getTitular());
		System.out.println(" ");
		System.out.println(obj.getTipo());
		System.out.println(" ");
		System.out.println("Equals:" + " " + obj.equals(obj));
		System.out.println(" ");
		System.out.println("------------------------------------------");

		try {

			ContaCorrente ccTemporaria = (ContaCorrente) obj;
			System.out.println("Valor do imposto:" + " " + ccTemporaria.getValorImposto());

		} catch (Exception e) {
			return;
		}

	}

	public static void populaEscreveSeguroDeVida(Conta obj) {
		SeguroDeVida sv = new SeguroDeVida();
		sv.setTitular(obj.getTitular());
		sv.setNumeroApolice(25997);
		sv.setValor(obj.getSaldo());

		System.out.println("------------------------------------------");
		System.out.println("Titular Seguro de Vida(Seguro de Vida):" + " " + sv.getTitular());
		System.out.println(" ");
		System.out.println("Numero Apolice(Seguro de Vida):" + " " + sv.getNumeroApolice());
		System.out.println(" ");
		System.out.println("Valor(Seguro de Vida):" + " " + sv.getValor());
		System.out.println(" ");
		System.out.println("Valor do Imposto(Seguro de Vida):" + " " + sv.getValorImposto());
		System.out.println(" ");
		System.out.println("Tipo(Seguro de Vida):" + " " + sv.getTipo());
		System.out.println("------------------------------------------");

	}
}
