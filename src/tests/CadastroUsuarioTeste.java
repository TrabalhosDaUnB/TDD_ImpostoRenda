package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Usuario;

public class CadastroUsuarioTeste {

	@Test
	public void testCadastroUsuario() {
		boolean resposta;
		Usuario user;
		resposta = Usuario.obterUsuario("Jabulane", "555.777.888-11");
		assertTrue(resposta);
	}

}
