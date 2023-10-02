import br.com.Extrx.screenmatch.calculos.CalculadoraDeTempo;
import br.com.Extrx.screenmatch.calculos.FiltroRecomendacao;
import br.com.Extrx.screenmatch.modelos.Episodios;
import br.com.Extrx.screenmatch.modelos.Filme;
import br.com.Extrx.screenmatch.modelos.Serie;

public class Principal {
	public static void main(String[]args) {
		Filme meufilme = new Filme();
		meufilme.setNome("Interestelar");
		meufilme.setAnoDeLancamento(2021);
		meufilme.setDuracaoEmMinutos(100);
		System.out.println("Duracao do filme: " + meufilme.getDuracaoEmMinutos()+ " Minutos");
		
		meufilme.exibeFichaTecnica();
		meufilme.avalia(10);
		meufilme.avalia(8);
		meufilme.avalia(7);
		 System.out.println("SomaNotas:  " +  meufilme.getSomaDasAvaliacoes());
		 System.out.println("TotalNotas:  " +  meufilme.getTotalDeAvaliacoes());
		 System.out.println("MediaNotas: " + meufilme.ObterMedias());
		 //Metodo sem Get meufilme.SomaDasAvaliacoes = 10;
		 //meufilme.TotalDeAvaliacoes = 1;
		  
		 Serie minhaSerie = new Serie();
		 minhaSerie.setNome("BRKBAD");
		 minhaSerie.setAnoDeLancamento(2008);
		 minhaSerie.exibeFichaTecnica();
		 minhaSerie.setTemporadas(10);
		 minhaSerie.setEpisodiosPorTemporada(10);
		 minhaSerie.setMinutosPorEpisodio(50);
		
		 System.out.println("Duracao para maratonar BRKSBAD " + minhaSerie.getDuracaoEmMinutos()+ " Minutos");
		 
		 Filme outrofilme = new Filme();
		outrofilme.setNome("Avatar");
		outrofilme.setAnoDeLancamento(2023);
		outrofilme.setDuracaoEmMinutos(200);
			
		 CalculadoraDeTempo Calculadora = new CalculadoraDeTempo();
		 Calculadora.Inclui(meufilme);
		 Calculadora.Inclui(outrofilme);
		 Calculadora.Inclui(minhaSerie);
		 
		 
		 FiltroRecomendacao filtro = new FiltroRecomendacao();
			filtro.filtra(meufilme); 
		 
		Episodios episodio = new Episodios();
		episodio.setNome("Pilot de " + minhaSerie.getNome());
		episodio.setNumero(1);
		episodio.setSerie(minhaSerie);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
	}

}  
