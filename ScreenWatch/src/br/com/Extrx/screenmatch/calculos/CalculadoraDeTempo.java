package br.com.Extrx.screenmatch.calculos;
import br.com.Extrx.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	
	private int tempoTotal = 0;
	
	public int getTempoTotal() {
		return this.tempoTotal;
	}
	
//	public void Inclui(Filme f ) {
//		this.tempoTotal += f.getDuracaoEmMinutos();
//	}
//	
//	public void Inclui(Serie s) {
//		this.tempoTotal += s.getDuracaoEmMinutos();
//	}

	public void Inclui(Titulo titulo) {
		//System.out.println("Adicionando Duracao em minutos de " + titulo);
		this.tempoTotal +=titulo.getDuracaoEmMinutos();
	}

}

