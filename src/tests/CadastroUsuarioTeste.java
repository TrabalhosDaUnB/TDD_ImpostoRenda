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

	@Test
	public void testCadastroUsuario2() {
		Usuario user2 = Usuario.obterUsuario("Chicó", "333.222.111-11");
		assertNotNull(user2);
		assertEquals("Chicó", user2.nome);
		assertEquals("333.222.111-11", user2.cpf);
	}

}
