package minhasMusicas.Modelos;

public class Musica extends Audio {
	private double DuracaoMusica;
	private double Reproducoes;
	private double Curtidas;

	public double getCurtidas() {
		return Curtidas;
	}

	public void setCurtidas(double curtidas) {
		Curtidas = curtidas;
	}

	public double getDuracaoMusica() {
		return DuracaoMusica;
	}

	public void setDuracaoMusica(double duracaoMusica) {
		DuracaoMusica = duracaoMusica;
	}

	public double getReproducoes() {
		return Reproducoes;
	}

	public void setReproducoes(double reproducoes) {
		Reproducoes = reproducoes;
	}

	@Override
	public int getClassificacao() {
		if (this.getTotalReproduçoes() > 1500) {
			return 10;
		} else if (this.getTotalReproduçoes() > 500) {
			return 7;
		} else {
			return 6;
		}

	}

}
