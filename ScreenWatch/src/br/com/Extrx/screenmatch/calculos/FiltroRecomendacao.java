package br.com.Extrx.screenmatch.calculos;

public class FiltroRecomendacao {
	
	public void filtra(Classificacao classificacao ) {
		if(classificacao.getClassificacao() >= 4) {
			System.out.println(classificacao.getNome() + " Esta ente os preferidos do momento");
		}else if(classificacao.getClassificacao() >= 2){
			System.out.println("Muito bem avaliado no momento!");
		}else {
			System.out.println("Coloque na sua lista para assistir depois");
		}
		
	}
}
