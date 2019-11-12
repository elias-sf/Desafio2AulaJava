package br.com.fiap.contas.main;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {

		Conta[] contas = new Conta[10];
		
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;
			
		}
		
		List<Conta> listaContas = Arrays.asList(contas);
		
		double media = listaContas.stream().mapToDouble(conta -> conta.getSaldo()).average().orElse(0.0);
		
		System.out.println(media);

	}

}
