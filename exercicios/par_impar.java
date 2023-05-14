package exercicios;

import java.util.Scanner;

public class par_impar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		if (num % 2 == 0 && num > 0)
			System.out.printf("O número %d é par", num);
		else 
			System.out.printf("O número %d é ímpar", num);
		
		sc.close();
}
}