
package minhasMusicas.Modelos;

public class Audio {
	private String titulo;
	private int totalReproduçoes;
	private int totalCurtidas;
	private int classificacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotalReproduçoes() {
		return totalReproduçoes;
	}

	public int getTotalCurtidas() {
		return totalCurtidas;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void like() {
		this.totalCurtidas++;
	}

	public void reproduz() {
		this.totalReproduçoes++;
	}
}
