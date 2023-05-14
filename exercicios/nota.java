package exercicios;

import java.util.Scanner;

public class nota {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota: ");
		double nota = sc.nextInt();
		
		if (nota >= 7)
			System.out.printf("Nota %.1f passou direto", nota);
		else if (nota >= 5 && nota < 7)
			System.out.printf("Nota %.1f tem direito a fazer uma prova de recuperação", nota);
		else 
			System.out.printf("Nota %.1f reprovado direto", nota);
		
		sc.close();
	
	}
	
}
