package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import app.Deducao;
import app.Usuario;
import exceptions.ValorInvalidoException;

@RunWith(Parameterized.class)
public class CadastroDeducaoTeste {

	
	//Atributos objeto de teste
	private String uNome; 
	private String uCpf;
	private ArrayList<DeducaoParam> dParam = new ArrayList();
	private int dQtd;
	private double total;
	
	
	//Construtor modificado
	public CadastroDeducaoTeste(String nome, String CPF, ArrayList<DeducaoParam> dedu, int qtd, double t) {
		
		this.uNome = nome;
		this.uCpf = CPF;
		this.dParam = dedu;
		this.dQtd = qtd;
		this.total = t;
		
	}
	
	@Parameterized.Parameters
	public static Collection testData() {
		
		
		//Param 1
		ArrayList<DeducaoParam> deds1 = new ArrayList();
		deds1.add(new DeducaoParam("previdencia", 100.00));
	
		Object[] param1 = {"Nome", "111.222.333-44", deds1, 1, 100.00};
	
		
		//Param 2
		ArrayList<DeducaoParam> deds2 = new ArrayList();
		deds2.add(new DeducaoParam("PA", 1));
	
		Object[] param2 = {"Nomes", "111.222.333-44", deds2, 1, 180.00};
		
		
		//Param 3
		ArrayList<DeducaoParam> deds3 = new ArrayList();
		deds3.add(new DeducaoParam("PA", 2));
	
		Object[] param3 = {"Nome1", "111.222.333-44", deds3, 1, 360.00};
		
	
		//Param 4 
		ArrayList<DeducaoParam> deds4 = new ArrayList();
		deds4.add(new DeducaoParam("PA", 2));
		deds4.add(new DeducaoParam("previdencia", 100.50));
	
		Object[] param4 = {"Nome3", "111.222.333-44", deds4, 2, 460.50};
	
		return Arrays.asList(new Object[][] {
			param1,
			param2,
			param3,
			param4
		});
	
	}
	
	@Category({TesteDeCadastro.class, TesteDeValor.class})
	@Test
	public void testCadastroDeducao() throws ValorInvalidoException {
		
		boolean resposta;
		
		Usuario user = Usuario.obterUsuario(this.uNome, this.uCpf);
		assertNotNull(user);
		
		for(DeducaoParam d : this.dParam) {
			Deducao ded = Deducao.obterDeducao(d.tipo, d.valor);
			assertNotNull(ded);
			resposta = user.addDeducao(ded);
		}
		
		assertEquals(user.getNumeroDeducoes(), this.dQtd);
		assertEquals(user.getTotalDeducoes(), this.total, 0.001);
		
	}

}
