package exercicios;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha: ");
		int senha = sc.nextInt();
		
		if (senha == 1234)
			System.out.println("ACESSO PERMITIDO");
		else
			System.out.println("ACESSO NEGADO");
		
		sc.close();
	}

}
