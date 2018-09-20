package app;

public class Usuario {

	//Atributos de Usuario
	public String nome;
	public String cpf;
	
	
	private Usuario(String n, String cpf){
		this.nome = n;
		this.cpf = cpf;
	}
	
	
	public static Usuario obterUsuario(String n, String cpf) {
		return new Usuario(n,cpf);
	}
}
