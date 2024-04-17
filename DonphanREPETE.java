package lpa2;

import java.util.Scanner;

public class DonphanREPETE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		
		for (int i = 0; i<=5; i++) {
			System.out.print("Informe um nome: ");
			nome = ler.next();
			System.out.println("O nome é: " +nome);
		}
		ler.close();
	}

}
