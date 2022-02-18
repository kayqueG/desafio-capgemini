package Desafios.Questao1;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
* @author Kayque Gon�alves
* @version 1.0
*/
public class Questao1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		/**
		* String que armazena os degraus
		*/
		String result = "";
		
		int n=0;
		
		// monitorando o input do usu�rio
		try {
			System.out.println("Digite um numero inteiro para n:");

			 n = scan.nextInt();

			// tratando exce��o do input
		} catch (InputMismatchException e) {

			System.out.println("Voc� precisa digitar um numero inteiro!");
		}

		gerarDegraus(n);

	}
	
	

	/**
	* Retorna a escada
	* @param n valor da base e a altura da escada
	* 
	* @return A escada
	*/

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
