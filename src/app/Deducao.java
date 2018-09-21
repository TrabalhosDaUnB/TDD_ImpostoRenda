package app;

public class Deducao {

	private String tipo;
	private double valor;
	
	
	Deducao(String tipo, double valor){
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public static Deducao obterDeducao(String t, double v) {
		
		return new Deducao(t, v);
	
	}
	
	public String getTipo() {
		return this.tipo;
	}

	public double getValor() {
		return this.valor;
	}
	
}
