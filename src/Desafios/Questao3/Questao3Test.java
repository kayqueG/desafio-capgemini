package Desafios.Questao3;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class Questao3Test extends TestCase {

	@Test
	public void testGerarAnagramas() {
		
		ArrayList<String> anagramas = new ArrayList<String>();
		anagramas.add("vo");
		anagramas.add("o");
		
		ArrayList<String> anagramas2 = new ArrayList<String>();
		anagramas2.add("fai");
		anagramas2.add("i");
		anagramas2.add("q");
		
		assertEquals(anagramas,Questao3.gerarAnagramas("ovo"));
		assertEquals(anagramas2,Questao3.gerarAnagramas("ifailuhkqq"));
	}
	
	@Test
	public void testContarAnagramas() {
		

		ArrayList<String> anagramas = Questao3.gerarAnagramas("ovo");
		ArrayList<String> anagramas2 = Questao3.gerarAnagramas("ifailuhkqq");
		
		assertEquals(2,Questao3.contarAnagramas(anagramas));
		assertEquals(3,Questao3.contarAnagramas(anagramas2));
		
	}
	
	
	
}
