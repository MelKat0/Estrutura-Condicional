package lpa2;

import java.util.Scanner;

public class GlalieREPETE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		for (int i = 1; i<=5; i++) {
	
			System.out.print("Informe um número: ");
			num = ler.nextInt();
		
			soma = soma + num;
		
		
			System.out.println("A soma dos valores é " + soma);
		
		}
		double media = soma/5;
		System.out.println("A média dos valores é " + media);
		ler.close();
	}

}
