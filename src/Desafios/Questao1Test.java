package Desafios;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class Questao1Test extends TestCase{

	@Test
	public void testGerarDegraus() {
		
	assertEquals("     *\n    **\n   ***\n  ****\n *****\n******\n",Questao1.gerarDegraus(6));
		
	}
}
