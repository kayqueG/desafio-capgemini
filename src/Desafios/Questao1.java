package Desafios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		// instanciando a classe Scanner para obter dados do teclado
		Scanner scan = new Scanner(System.in);

		int n = 0;

		// monitorando o input do usu�rio
		try {
			System.out.println("Digite um numero inteiro para n:");

			n = scan.nextInt();

			// tratando exce��o do input
		} catch (InputMismatchException e) {

			System.out.println("Voc� precisa digitar um numero inteiro!");
		}

		// vari�vel para o numero m�ximo de espa�os por degrau
		int numEspacos = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j < numEspacos - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
			numEspacos--;
		}

	}

}
