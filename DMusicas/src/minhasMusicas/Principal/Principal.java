package minhasMusicas.Principal;

import minhasMusicas.Modelos.Album;
import minhasMusicas.Modelos.Musica;
import minhasMusicas.Modelos.Favoritas;


public class Principal {
	public static void main(String[] args) {
		Album meuAlbum = new Album();
		meuAlbum.setAlbum("Ciano");
		meuAlbum.setBanda("Fresno");
		meuAlbum.setAnoDeLancamento(2006);
		meuAlbum.setGenero("Rock");
		meuAlbum.setQuantiaDeMusicas(14);

		Musica QuebraAsCorrentes = new Musica();
		QuebraAsCorrentes.setTitulo("Quebra As Correntes");
		QuebraAsCorrentes.setReproducoes(4470);
		QuebraAsCorrentes.setCurtidas(1788);
		QuebraAsCorrentes.setDuracaoMusica(3.46);

		for (int i = 0; i < QuebraAsCorrentes.getReproducoes(); i++) {
			QuebraAsCorrentes.reproduz();

		}

		for (int i = 0; i < QuebraAsCorrentes.getCurtidas(); i++) {
			QuebraAsCorrentes.like();
		}
		Musica AbsolutamenteNada = new Musica();
		AbsolutamenteNada.setTitulo("AbsolutamenteNada");
		AbsolutamenteNada.setReproducoes(1023);
		AbsolutamenteNada.setDuracaoMusica(3.50);
		AbsolutamenteNada.setCurtidas(409);

		for (int j = 0; j < AbsolutamenteNada.getReproducoes(); j++) {
			AbsolutamenteNada.reproduz();

		}

		for (int j = 0; j < AbsolutamenteNada.getCurtidas(); j++) {
			AbsolutamenteNada.like();
		}
		Musica SonetoParaPetrCech = new Musica();
		SonetoParaPetrCech.setTitulo("SonetoParaPetrCech");
		SonetoParaPetrCech.setReproducoes(405);
		SonetoParaPetrCech.setDuracaoMusica(3.31);
		SonetoParaPetrCech.setCurtidas(162);

		for (int ii = 0; ii < SonetoParaPetrCech.getReproducoes(); ii++) {
			SonetoParaPetrCech.reproduz();

		}

		for (int ii = 0; ii < SonetoParaPetrCech.getCurtidas(); ii++) {
			SonetoParaPetrCech.like();
		}
		Musica OPesoDoMundo = new Musica();
		OPesoDoMundo.setTitulo("OPesoDoMundo");
		OPesoDoMundo.setReproducoes(441);
		OPesoDoMundo.setDuracaoMusica(3.48);
		OPesoDoMundo.setCurtidas(176);

		for (int iii = 0; iii < OPesoDoMundo.getReproducoes(); iii++) {
			OPesoDoMundo.reproduz();

		}

		for (int iii = 0; iii < OPesoDoMundo.getCurtidas(); iii++) {
			OPesoDoMundo.like();
		}
		Musica Stonehenge = new Musica();
		Stonehenge.setTitulo("Stonehenge");
		Stonehenge.setReproducoes(827);
		Stonehenge.setDuracaoMusica(4.12);
		Stonehenge.setCurtidas(330);

		for (int iiii = 0; iiii < Stonehenge.getReproducoes(); iiii++) {
			Stonehenge.reproduz();

		}

		for (int iiii = 0; iiii < Stonehenge.getCurtidas(); iiii++) {
			Stonehenge.like();

		}

		meuAlbum.FichaTecnica();
		Favoritas favoritas = new Favoritas();
		favoritas.inclui(QuebraAsCorrentes);
		favoritas.inclui(AbsolutamenteNada);
		favoritas.inclui(Stonehenge);
		favoritas.inclui(OPesoDoMundo);
		favoritas.inclui(SonetoParaPetrCech);

	}

}
