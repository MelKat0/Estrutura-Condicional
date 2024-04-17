package lpa2;

import java.util.Scanner;

public class IgglybuffREPETE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num,soma=1, fato=1, nota;
		
		System.out.print("Informe um número inteiro: ");
		num = ler.nextInt();
		
		System.out.println("O fatorial de " + num + " é:");
		System.out.print("1");
		
		for (int i = 2; i<=num; i++) {
			
		fato = fato*i;
		
		System.out.print("." + i);
		
		}
		System.out.print(" = " + fato);
		ler.close();
	}

}
