package tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import app.Usuario;

@RunWith(Parameterized.class)
public class CadastroUsuarioTeste {
	
	private String nome;
	private String cpf;
	
	public CadastroUsuarioTeste(String n, String c) {
		this.nome = n;
		this.cpf = c;
	}
	
	
	@SuppressWarnings("rawtypes")
	@Parameterized.Parameters
	public static Collection testData(){
				
		String nome1 = "chico", nome2 = "jabulane", nome3 = "chibulane";
		String cpf1 = "111.222.333-44", cpf2 = "555.666.777-88", cpf3 = "111.666.333-88";
	
		return Arrays.asList(new Object[][]{
								{nome1, cpf1},
								{nome2, cpf2},
								{nome3, cpf3}
								});
	}

	
	
	@Test
	public void testCadastroUsuario() {
		
		Usuario user = Usuario.obterUsuario(nome, cpf);
		
		assertNotNull(user);
		assertEquals(nome, user.nome);
		assertEquals(cpf, user.cpf);
		
	}
	
}
