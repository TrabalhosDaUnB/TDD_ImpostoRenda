package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Deducao;
import app.Usuario;

public class CadastroDeducaoTeste {

	@Test
	public void testCadastroDeducaoPrevidencia() {
		
		boolean resposta;
		
		
		Usuario user = Usuario.obterUsuario("Fulano", "111.222.333-44");
		assertNotNull(user);
		
		Deducao ded = Deducao.obterDeducao("previdencia", 500.00);
		assertNotNull(ded);
		
		resposta = user.addDeducao(ded);
		assertTrue(resposta);
		assertEquals(user.getNumeroDeducoes(), 1);
		assertEquals(user.getTotalDeducoes(), 500.00, 0.01);
		
	}
	
	@Test
	public void testCadastroDeducaoPA() {
		
		boolean resposta;
		
		//Aceitando como deducao ser 180 por PA
		
		Usuario user = Usuario.obterUsuario("Fulano", "111.222.333-44");
		assertNotNull(user);
		
		Deducao ded = Deducao.obterDeducao("PA", 2);
		assertNotNull(ded);
		
		resposta = user.addDeducao(ded);
		assertTrue(resposta);
		assertEquals(user.getNumeroDeducoes(), 1);
		assertEquals(user.getTotalDeducoes(), 360.00,0.01);
		
		
	}
	
	
	@Test
	public void testCadastroPrevidenciaMaisPA() {
		boolean resposta;
		
		Usuario user = Usuario.obterUsuario("Fulano", "111.222.333-44");
		assertNotNull(user);
		
		Deducao ded = Deducao.obterDeducao("PA", 2);
		assertNotNull(ded);
		resposta = user.addDeducao(ded);
		assertTrue(resposta);
		assertEquals(user.getNumeroDeducoes(),1);
		assertEquals(user.getTotalDeducoes(),2,0.01);
		
		Deducao ded2 = Deducao.obterDeducao("previdencia", 555.55);
		assertNotNull(ded2);
		resposta = user.addDeducao(ded2);
		assertTrue(resposta);
		assertEquals(user.getNumeroDeducoes(),2);
		assertEquals(user.getTotalDeducoes(),557.55,0.01);
		
	}

}
