package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Rendimento;
import app.Usuario;

public class CadastroRendimentoTeste {

	@Test
	public void testCadastroRendimento() {
		Usuario user = Usuario.obterUsuario("joaquim", "232.233.111-33");
		
		Rendimento rend1 = Rendimento.obterRendimento("salario", 2500.00);
		assertNotNull(rend1);
		
		boolean resposta = user.addRendimento(rend1);
		assertTrue(resposta);
		assertEquals(user.getRendimentoTotal(), 2500.00,0.01);
		
	}
	
	@Test
	public void testCadastroRendimento2() {
		
		Usuario user = Usuario.obterUsuario("joaquim", "222.333.444-33");
		
		Rendimento rend2 = Rendimento.obterRendimento("aluguel", 1500.00);
		assertNotNull(rend2);
		
		boolean resposta = user.addRendimento(rend1);
		assertTrue(resposta);
		assertEquals(user.getRendimentoTotal(), 2500.00, 0.01);
		
	}

}
