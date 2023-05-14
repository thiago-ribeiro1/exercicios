package exercicios;

import java.util.Scanner;

public class eleitor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento: ");
		int anoNascimento = sc.nextInt();
		int anoAtual = 2023;
		int idade = anoAtual - anoNascimento;		
		System.out.println();
		if (idade >= 16)
			System.out.printf("Idade %d, você está apto a votar", idade);
		else
			System.out.printf("Você tem %d anos, você ainda não pode votar, tem menos de 16 anos", idade);
		
		sc.close();
			
	}

}
