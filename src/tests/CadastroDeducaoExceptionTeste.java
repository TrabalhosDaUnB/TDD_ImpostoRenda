package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Deducao;
import app.Usuario;
import exceptions.ValorInvalidoException;

public class CadastroDeducaoExceptionTeste {

	@Test(expected = ValorInvalidoException.class)
	public void testException() throws ValorInvalidoException {
		Usuario user = Usuario.obterUsuario("Joaquim", "111.222.333-44");
		Deducao ded = Deducao.obterDeducao("previdencia", -100);

	}

}
