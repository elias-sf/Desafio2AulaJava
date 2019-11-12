package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class ExemploDeInterfaceEspecifica {
	
	public static void main(String[] args) {
				
		
		List<ContaCorrente> contas = new ArrayList<>();
		//Collection<ContaCorrente> contas = new ArrayList<>();
		Random gerador = new Random();

			for (int i = 0; i < 5; i++) {			
				ContaCorrente conta = new ContaCorrente();
				conta.setTitular("Titular " + i);
				conta.setNumero(gerador.nextInt(11));
				conta.setAgencia("Agencia " + (i + 1));
				conta.deposita(gerador.nextInt(50) * 2.0);
				contas.add(conta);
				
			}
		
			
		// Exemplo de quando queremos usar uma interface mais especifica é para acessa um item especifico.
		// Se mudarmos para collection perdemos o metodo get, descomentando o item instanciado por collection dará erro no compilador. 
			
		System.out.println(contas.get(0).getTitular());
		
		
	}

}
