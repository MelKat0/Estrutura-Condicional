package lpa2;

import java.util.Scanner;

public class HaxorusREPETE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vale, soma=0;
		
		for(int i = 1; i <=10; i++) {
			
			System.out.print("Informe um número: ");
			vale = ler.nextInt ();
			
			if (vale%2 ==1) {
				System.out.println("O número é ímpar");
			}
			else {
				System.out.println("O número é par");
			}

				soma = soma + vale;
				
				System.out.println("A soma dos valores é: " + soma);
		}
		ler.close();
	}

}
