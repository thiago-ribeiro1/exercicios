
package exercicios;

import java.util.Scanner;

public class numero_maior_menor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Número 1: ");
		int num1 = sc.nextInt();
		System.out.println("Número 2: ");
		int num2 = sc.nextInt();
		System.out.println("Número 3: ");
		int num3 = sc.nextInt();
		

		if (num1 > num2 && num1 > num3)
			System.out.printf("O maior é o número %d %n", num1);
		else if (num1 < num2 && num1 < num3)
			System.out.printf("O menor é o número %d %n", num1);
		if (num2 > num1 && num2 > num3)
			System.out.printf("O maior é o número %d %n", num2);
		else if (num2 < num1 && num2 < num3)
			System.out.printf("O menor é o número %d %n", num2);
		if (num3 > num1 && num3 > num2)
			System.out.printf("O maior é o número %d %n", num3);
		else if (num3 < num1 && num3 < num2)
			System.out.printf("O menor é o número %d %n", num3);
		
		sc.close();

	}
}
