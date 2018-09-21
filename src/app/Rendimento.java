package app;

public class Rendimento {
	
	private String tipo = "";
	private double valor = 0.0;
	
	public String getTipo() {
		return this.tipo;
	}
	
	public double getValor() { 
		return this.valor;
	}

	Rendimento(String t, double v){
		this.tipo = t;
		this.valor = v;
	}
	
	public static Rendimento obterRendimento(String t, double v) {
		
		return new Rendimento(t, v);
		
	}
	
}
