package br.com.Extrx.screenmatch.modelos;
import br.com.Extrx.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
	private String diretor;
	
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public int getClassificacao() {
		return (int) ObterMedias() / 2;
	}

}
