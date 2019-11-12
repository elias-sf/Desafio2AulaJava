package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TesteLista {

	public static void main(String[] args) {
		
	
	List<ContaCorrente> contas = new ArrayList<>();
	//List<Conta> contas = new LinkedList<>();
	Random gerador = new Random();

		for (int i = 0; i < 5; i++) {			
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular("Titular " + gerador.nextInt(8));
			conta.setNumero(gerador.nextInt(11));
			conta.setAgencia("Agencia " + (i + 1));
			conta.deposita(gerador.nextInt(50) * 2.0);
			contas.add(conta);
		}
		
		Collections.sort(contas);
		
		//contas.stream().forEach(conta -> System.out.println("Posição que ficou" + " " + conta.getTitular()));
		
		System.out.println(contas);
		
	}


}
