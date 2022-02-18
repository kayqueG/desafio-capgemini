package Desafios.Questao2;
import java.util.Scanner;


/**
* @author Kayque Gonçalves
* @version 1.0
*/
public class Questao2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean senhaFraca = true;

		do {
			
			menu();
			
			String senha = scan.nextLine();

			if (validarSenha(senha)) {
				
				System.out.println("Senha segura!!");
				senhaFraca = false;
			}

		} while (senhaFraca);
	}
	
	
	/**
	* Retorna o menu
	* 
	* @return Menu para interação do usuário
	*/
	public static String menu() {
		
		System.out.println(
			"Digite sua senha contendo no minimo : \n"
				+ "6 caracteres\n"
				+ "1 digito\n"
				+ "1 letra em minúsculo\n"
				+ "1 letra em maiúsculo\n"
				+ "1 caractere especial !@#$%^&*()-+\n");
		
		
		return "Digite sua senha contendo no minimo : \n"
		+ "6 caracteres\n"
		+ "1 digito\n"
		+ "1 letra em minúsculo\n"
		+ "1 letra em maiúsculo\n"
		+ "1 caractere especial !@#$%^&*()-+\n";
	}
	
	

	/**
	* Valida se a senha do usuario for forte
	* @param senha senha do usuário
	* 
	* @return true se a senha for forte
	*/
	public static boolean validarSenha( String senha) {
		
		if (verificarMinCaracteres(senha) && 
			verificarMinDigitos(senha) &&
			verificarMinMinusculo(senha)&&
			verificarMinMaiusculo(senha)&& 
			verificarEspeciais(senha)) {
			
			return true;
		}
		
		return false;
			
	}

	
	/**
	* Verifica se a senha tem pelo menos 6 caracteres
	* @param senha senha do usuario
	* 
	* @return true se a senha tem pelo menos 6 caracteres
	*/
	public static boolean verificarMinCaracteres(String senha) {

		if (senha.length() >= 6) {
			return true;
		}

		System.out.println(
				"Você precisa adicionar mais " + (6 - senha.length()) + " caracteres para ter no minimo 6 caracteres!");

		return false;

	}

	
	/**
	* Verifica se a senha tem pelo menos 1 digito
	* @param senha senha do usuario
	* 
	* @return true se a senha tem pelo menos 1 digito
	*/
	public static boolean verificarMinDigitos(String senha) {

		char[] senhaArray = senha.toCharArray();

		for (int i = 0; i < senhaArray.length; i++) {
			if (Character.isDigit(senhaArray[i]))
				return true;
		}

		System.out.println("Sua senha precisa ter no minimo 1 digito!");

		return false;

	}

	
	/**
	* Verifica se a senha tem pelo menos 1 letra minuscula
	* @param senha senha do usuario
	* 
	* @return true se a senha tem pelo menos 1 letra minuscula
	*/
	public static boolean verificarMinMinusculo(String senha) {

		char[] senhaArray = senha.toCharArray();

		for (int i = 0; i < senhaArray.length; i++) {
			if (Character.isLowerCase(senhaArray[i]))
				return true;
		}

		System.out.println("Sua senha precisa ter no minimo 1 caractere minusculo!");

		return false;

	}

	
	/**
	* Verifica se a senha tem pelo menos 1 letra maiuscula
	* @param senha senha do usuario
	* 
	* @return true se a senha tem pelo menos 1 letra maiuscula
	*/
	public static boolean verificarMinMaiusculo(String senha) {

		char[] senhaArray = senha.toCharArray();

		for (int i = 0; i < senhaArray.length; i++) {
			if (Character.isUpperCase(senhaArray[i]))
				return true;
		}

		System.out.println("Sua senha precisa ter no minimo 1 caractere maiusculo!");

		return false;

	}

	/**
	* Verifica se a senha tem pelo menos 1 caractere especial
	* @param senha senha do usuario
	* 
	* @return true se a senha tem pelo menos 1 caractere especial
	*/
	public static boolean verificarEspeciais(String senha) {

		char[] senhaArray = senha.toCharArray();

		for (int i = 0; i < senhaArray.length; i++) {
			if (!Character.isDigit(senhaArray[i]) && !(Character.isLetter(senhaArray[i])))
				return true;
		}

		System.out.println("Sua senha precisa ter no minimo 1 caractere especial ( !@#$%^&*()-+\r\n" + ") !");

		return false;

	}

}
