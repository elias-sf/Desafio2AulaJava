package br.com.fiap.contas.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Banco {

	private String nome;
	private int numero;
	private Conta[] contas;
	private List<Conta> contas2 = new ArrayList<>();

	
	public Conta buscaPorTitular(String nome) {
		Conta naoAchado = new ContaCorrente();
		naoAchado.setTitular("Não achado o titular");

		return this.contas2.stream().filter(conta -> conta.getTitular().equals(nome)).findAny().orElse(naoAchado);
		
	}
	
	public  Conta pega(int x) {
		return this.contas2.get(x);
	}
	
	public int pegaQuantidadeDeContas() {
		
		return this.contas2.size();
	}
	
	public void mostraConta() {
		
		List<Conta> listaContas = Arrays.asList(this.contas);
		
		listaContas.stream().forEach(System.out::println);
		
	}
	
	public void adiciona(Conta conta, boolean flagUltimoElemento) {
		
		this.contas2.add(conta);
		if(flagUltimoElemento) {
		this.contas = contas2.stream().toArray(Conta[]::new);
		}
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
