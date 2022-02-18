package Desafios.Questao3;
import java.util.ArrayList;
import java.util.Scanner;


/**
* @author Kayque Gonçalves
* @version 1.0
*/
public class Questao3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma palavra");
		String palavra = scan.nextLine();

		ArrayList<String> anagramas = gerarAnagramas(palavra);
		contarAnagramas(anagramas);

	}
	

	/**
	* Gera anagramas 
	* @param palavra para geração de anagramas
	* 
	* @return Lista de anagramas da palavra
	*/
	public static ArrayList<String> gerarAnagramas(String palavra) {

		ArrayList<String> anagramas = new ArrayList<String>();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String anagramaC = palavra.substring(i, i + 1);
						anagramas.add(anagramaC);
					} else {
						String anagramaA = palavra.substring(i + 1, j + 1);
						String anagramaB = palavra.substring(i, i + 1);
						anagramas.add(anagramaA);
						anagramas.add(anagramaB);
					}
				}
			}
		}

		return anagramas;

	}

	
	/**
	* Conta quantos anagramas tem na lista
	* @param anagramas Lista de anagramas
	* 
	* @return quantidade de anagramas da lista
	*/
	public static int contarAnagramas(ArrayList<String> anagramas) {

		
		System.out.println(anagramas.size());
		
		return anagramas.size();
	}

}
