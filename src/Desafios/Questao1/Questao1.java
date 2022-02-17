package Desafios.Questao1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String result = "";
		
		int n=0;
		
		// monitorando o input do usuário
		try {
			System.out.println("Digite um numero inteiro para n:");

			 n = scan.nextInt();

			// tratando exceção do input
		} catch (InputMismatchException e) {

			System.out.println("Você precisa digitar um numero inteiro!");
		}

		gerarDegraus(n);

	}

	public static String gerarDegraus(int n) {

		String result = "";

		int numEspacos = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j < numEspacos - 1) {
					result += " ";
				} else {
					result += "*";
				}
			}
			result += "\n";
			numEspacos--;
		}

		System.out.println(result);
		return result;

	}

}
