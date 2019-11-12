package br.com.fiap.contas.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;

	
	public void mostraConta() {
		
		List<Conta> listaContas = Arrays.asList(this.contas);
		
		listaContas.stream().forEach(System.out::println);
		
	}
	
	public void adiciona(Conta conta) {
		
		List<Conta> listaContas = new ArrayList<>();
		listaContas.add(conta);
		this.contas = listaContas.stream().toArray(Conta[]::new);
	}
	
	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}


	public Conta[] getContas() {
		return contas;
	}

}
