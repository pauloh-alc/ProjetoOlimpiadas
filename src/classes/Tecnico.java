package classes;

import interfaces.OperacoesComuns;

public class Tecnico implements OperacoesComuns{
	private String nome;
	private String cargo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void adicionar() {
		
		
	}

	@Override
	public boolean remover(int indice) {
		
		return false;
	}

	public static String buscar(String nome) {
	
		return null;
	}

	@Override
	public void listarDados() {
			
	}
	
}