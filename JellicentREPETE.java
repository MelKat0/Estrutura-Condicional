package lpa2;

import java.util.Scanner;

public class JellicentREPETE {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double fun, sal, media, soma=0;
		
		System.out.println("Por favor, informe o total de funcionários: ");
		fun = ler.nextDouble();
		
		for (int i=1; i <=fun; i++) {
			
			System.out.println("Insira o valor de cada um dos funcionários: ");
			sal = ler.nextDouble();
			
			soma = soma + sal;
		}
		media = soma/fun;
		System.out.println("O salário médio da empresa é: R$" + media);
	}

}
