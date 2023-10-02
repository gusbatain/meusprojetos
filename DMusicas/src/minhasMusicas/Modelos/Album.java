package minhasMusicas.Modelos;

public class Album extends Audio {
	private String Album;
	private String Banda;
	private String genero;
	private int AnoDeLancamento;
	private int QuantiaDeMusicas;

	public String getAlbum() {
		return Album;
	}

	public void setAlbum(String album) {
		Album = album;
	}

	public String getBanda() {
		return Banda;
	}

	public void setBanda(String banda) {
		Banda = banda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		AnoDeLancamento = anoDeLancamento;
	}

	public int getAnoDeLancamento() {
		return AnoDeLancamento;
	}

	public void setQuantiaDeMusicas(int quantiaDeMusicas) {
		QuantiaDeMusicas = quantiaDeMusicas;
	}

	public void FichaTecnica() {
		System.out.println("Nome do Album: " + Album);
		System.out.println("Nome da Banda: " + Banda);
		System.out.println("Genero : " + genero);
		System.out.println("Ano de lançamento: " + AnoDeLancamento);
		System.out.println("Quantia de Musicas: " + QuantiaDeMusicas);
	}

}