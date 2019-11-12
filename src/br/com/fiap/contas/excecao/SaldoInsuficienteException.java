package br.com.fiap.contas.excecao;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends RuntimeException {

	public SaldoInsuficienteException(String mensagem, double valor) {
		super(mensagem + valor);
	}
}
