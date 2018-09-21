package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import app.Rendimento;
import app.Usuario;

@RunWith(Parameterized.class)
public class CadastroRendimentoTeste {
	
	//Atributos objeto de teste
	private String nomeUsuario;
	private String cpfUsuario;
	private ArrayList<ParametrosRendimentosTeste> conjuntoRendimentos = new ArrayList();
	private double totalRendimentos;
	
	public CadastroRendimentoTeste(String n, String c, ArrayList<ParametrosRendimentosTeste> pRend, double vTotal) {
		
		this.nomeUsuario = n; 
		this.cpfUsuario = c;
		this.conjuntoRendimentos = pRend;
		this.totalRendimentos = vTotal;
		
	}
	
	@Parameterized.Parameters  
	public static Collection testData(){
		
		//Somente 1 Rendimento
		ArrayList<ParametrosRendimentosTeste> rend1 = new ArrayList();
		rend1.add(new ParametrosRendimentosTeste("salario", 5000.00));
		
		Object[] parametro1 = new Object[] {"Joaquim","111.222.333-44", rend1, 5000.00};

		//Dois rendimentos
		ArrayList<ParametrosRendimentosTeste> rend2 = new ArrayList();
		rend2.add(new ParametrosRendimentosTeste("salario", 6000.00));
		rend2.add(new ParametrosRendimentosTeste("aluguel", 4000.00));
		
		Object[] parametro2 = new Object[] {"Janaina", "222.333.444-55", rend2, 10000.00};
		
		//Tres rendimentos
		ArrayList<ParametrosRendimentosTeste> rend3 = new ArrayList();
		rend3.add(new ParametrosRendimentosTeste("salario", 6000.00));
		rend3.add(new ParametrosRendimentosTeste("aluguel", 4000.00));
		rend3.add(new ParametrosRendimentosTeste("freelancing", 555.55));
		
		Object[] parametro3 = new Object[] {"Janaquim", "222.222.444-44", rend3, 10555.55};
		
		return (Collection) Arrays.asList(new Object[][] {
			parametro1,
			parametro2,
			parametro3
		});
		
	}
	
	@Test
	public void testCadastroRendimento() {
		
		Usuario user = Usuario.obterUsuario(this.nomeUsuario, this.cpfUsuario);
		Rendimento rend;
		boolean resposta;
		
		for( ParametrosRendimentosTeste p : conjuntoRendimentos) {
			
			rend = Rendimento.obterRendimento(p.tipo, p.valor);
			assertNotNull(rend);
			resposta = user.addRendimento(rend);
			assertTrue(resposta);
		}
		
		assertEquals(user.getRendimentoTotal(), this.totalRendimentos, 0.001);
		
	}

}
