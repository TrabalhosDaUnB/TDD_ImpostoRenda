package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Usuario;

public class CadastroUsuarioTeste {

	@Test
	public void testCadastroUsuario() {
		Usuario user = Usuario.obterUsuario("Jabulane", "555.777.888-11");
		assertNotNull(user);
		assertEquals("Jabulane", user.nome);
		assertEquals("555.777.888-11", user.cpf);
	}


}
