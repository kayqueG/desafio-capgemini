package Desafios.Questao2;

import org.junit.Test;

import junit.framework.TestCase;

public class Questao2Test extends TestCase {

	@Test
	public void testMenu() {
		assertEquals("Digite sua senha contendo no minimo : \n" + "6 caracteres\n" + "1 digito\n"
				+ "1 letra em minúsculo\n" + "1 letra em maiúsculo\n" + "1 caractere especial !@#$%^&*()-+\n",
				Questao2.menu());
	}

	
	@Test
	public void testValidarSenha() {

		assertEquals(false, Questao2.validarSenha("Ya3"));

		assertEquals(true, Questao2.validarSenha("Ya3&ab"));

	}
	
	@Test
	public void testVerificarMinCaracteres() {
		assertEquals(true,Questao2.verificarMinCaracteres("Ya3&ab"));
		assertEquals(false,Questao2.verificarMinCaracteres("Ya3b"));
		assertEquals(true,Questao2.verificarMinCaracteres("nadlsakndakldowej"));
	}
	
	
	
	@Test
	public void  testVerificarMinDigitos() {
		assertEquals(true,Questao2.verificarMinDigitos("ab2cd"));
		assertEquals(false,Questao2.verificarMinDigitos("abcedd"));
		assertEquals(true,Questao2.verificarMinDigitos("abcdefg4"));
		
	}
	
	@Test
	public void testVerificarMinMinusculo() {
		assertEquals(false,Questao2.verificarMinMinusculo("ABCDEFG"));
		assertEquals(true,Questao2.verificarMinMinusculo("ABCDEfG"));
		assertEquals(true,Questao2.verificarMinMinusculo("AbcdeFG"));
		
	}
	
	
	@Test
	public void testVerificarMinMaiusculo() {
		assertEquals(true,Questao2.verificarMinMaiusculo("ABCDEFG"));
		assertEquals(true,Questao2.verificarMinMaiusculo("ABcdef"));
		assertEquals(false,Questao2.verificarMinMaiusculo("abcde"));
		
	}
	
	@Test
	public void testVerificarEspeciais() {
		assertEquals(false,Questao2.verificarEspeciais("Ya3"));
		assertEquals(true,Questao2.verificarEspeciais("Ya3&ab"));
	}


}
