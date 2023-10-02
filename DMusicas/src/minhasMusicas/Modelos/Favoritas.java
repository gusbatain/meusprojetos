package minhasMusicas.Modelos;

public class Favoritas {
	public void inclui(Audio audio) {
		if (audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" + " e tem o total de "
					+ audio.getTotalCurtidas() + " Curtidas");
		} else if (audio.getClassificacao() >= 7) {
			System.out.println(audio.getTitulo() + " é um dos maiores sucesso da banda" + "e tem o total de "
					+ audio.getTotalCurtidas() + " Curtidas");
		}

		else {
			System.out.println(audio.getTitulo() + " outro sucessos da banda " + "e tem o total de "
					+ audio.getTotalCurtidas() + " Curtidas");
		}
	}
}