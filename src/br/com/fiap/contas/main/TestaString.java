package br.com.fiap.contas.main;

public class TestaString {

	public static void main(String[] args) {

		
		String s = "fj11";
		StringBuffer sb = new StringBuffer(s.replaceAll("1", "2"));
		System.out.println(sb.toString());

	}

}
