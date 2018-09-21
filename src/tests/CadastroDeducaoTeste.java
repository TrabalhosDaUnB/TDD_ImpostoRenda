package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Usuario;

public class CadastroDeducaoTeste {

	@Test
	public void testCadastroDeducao() {
		
		boolean resposta;
		
		
		Usuario user = Usuario.obterUsuario("Fulano", "111.222.333-44");
		assertNotNull(user);
		
		Deducao ded = Deducao.obterDeducao("previdencia", 500.00);
		assertNotNull(ded);
		
		resposta = user.addDeducao(ded);
		assertTrue(resposta);
		assertEquals(user.getNumeroDeducoes(), 1);
		assertEquals(user.getTotalDeducoes(), 500.00);
		
	}

}
