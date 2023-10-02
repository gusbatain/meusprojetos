package br.com.Extrx.screenmatch.modelos;

public class Titulo {
	 private String nome;
	 private int AnoDeLancamento;
	 private boolean IncluidoNoPlano;
	 private double SomaDasAvaliacoes;
	 private int TotalDeAvaliacoes;
	 private int DuracaoEmMinutos;
	
	public boolean isIncluidoNoPlano(){
		return IncluidoNoPlano;
	}
	 public double getSomaDasAvaliacoes() {
		return SomaDasAvaliacoes;
	}
	public int getTotalDeAvaliacoes() {
		return TotalDeAvaliacoes;
	}
	public int getAnoDeLancamento() {
		return AnoDeLancamento;
	}
	public int getDuracaoEmMinutos () {
		return DuracaoEmMinutos;
	}
	public String getNome() {
		return nome;
	}	
	
	public void setNome(String nome) {

		this.nome = nome;
	}
	public void setAnoDeLancamento(int anoDeLancamento) {
		AnoDeLancamento = anoDeLancamento;
	}
	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		IncluidoNoPlano = incluidoNoPlano;
	}
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		DuracaoEmMinutos = duracaoEmMinutos;
	}
	
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lancamento: " + AnoDeLancamento);
		
	}
	public void avalia(double nota) {
		SomaDasAvaliacoes += nota;
		TotalDeAvaliacoes++;
		
	}

	public double ObterMedias() {
		return SomaDasAvaliacoes / TotalDeAvaliacoes;
		
		
	}
	
}	

