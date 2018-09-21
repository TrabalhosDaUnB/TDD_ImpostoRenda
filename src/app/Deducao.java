package app;

import exceptions.ValorInvalidoException;

public class Deducao {

	private String tipo;
	private double valor;
	
	
	Deducao(String tipo, double valor) throws ValorInvalidoException{ 
		this.tipo = tipo; 
		this.valor = valor; 
		
		if(valor < 0) {
			throw new ValorInvalidoException();
		}
		
		if(this.tipo.equals("PA")) {
			
			this.valor = valor * 180;
			
		} else {
			this.valor = valor;
		}
		
		
	}

	public static Deducao obterDeducao(String t, double v) throws ValorInvalidoException {
		
		return new Deducao(t, v);
	
	}
	
	public String getTipo() {
		return this.tipo;
	}

	public double getValor() {
		return this.valor;
	}
	
}
