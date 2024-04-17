package lpa2;

import java.util.Scanner;

public class FarfetchdREPETE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int impra;
		
		System.out.println("Informe um número: ");
		impra = ler.nextInt();
		
		for (int i=0; i <= impra; i++) {
		if (i%2 ==1) {
			System.out.println(i + " é ímpar");			
		}
		else {
			
		}
		ler.close();
		}
		
	}
}
