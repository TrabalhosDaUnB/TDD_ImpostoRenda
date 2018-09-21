package app;

import java.util.ArrayList;

public class Usuario {

	//Atributos de Usuario
	public String nome;
	public String cpf;
	public ArrayList<Rendimento> rendimentos = new ArrayList();
	public ArrayList<Deducao> deducoes = new ArrayList();
	public double rendimentoTotal = 0.0;
	public double totalDeducoes = 0.0;
	
	
	private Usuario(String n, String cpf){
		this.nome = n;
		this.cpf = cpf;
	}
	
	
	public static Usuario obterUsuario(String n, String cpf) {
		return new Usuario(n,cpf);
	}


	public boolean addRendimento(Rendimento rend1) {
		if(rendimentos.add(rend1)) { 
			return true; 
		}else{
			return false;
		}
	}
	
	public double getRendimentoTotal() {
		
		rendimentoTotal = 0;
		
		for(Rendimento r : rendimentos) {
			rendimentoTotal = rendimentoTotal + r.getValor();
		}
		
		return this.rendimentoTotal;
	}


	public boolean addDeducao(Deducao ded) {
		
		if(deducoes.add(ded)) {
			return true;
		} else {
			return false;
		}
		
	}


	public Object getNumeroDeducoes() {
		return deducoes.size();
	}


	public double getTotalDeducoes() {
		
		totalDeducoes = 0.0;
		
		for(Deducao d : deducoes) {
			totalDeducoes += d.getValor();
		}
		
		return totalDeducoes;
		
	}
}
