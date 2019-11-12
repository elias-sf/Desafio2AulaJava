package br.com.fiap.contas.modelo;

import java.io.Serializable;

public abstract class Conta implements Serializable {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	@Override
	public String toString() {
		StringBuffer construtor = new StringBuffer();

		return construtor.append("Titular:" + " ").append(this.titular).append(", número:" + " ").append(this.numero)
				.append(", agencia:" + " ").append(this.agencia).toString();

	}

	public void deposita(double valor) {
		if (valor < 0)
			throw new IllegalArgumentException("Valor usado para depósito é negativo");
		else
			this.saldo += valor;
	}

	public void saca(double valor) {
		this.setSaldo(this.getSaldo() - valor);

	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
