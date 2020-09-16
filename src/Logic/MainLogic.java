package Logic;

import Model.Coordenada;

public class MainLogic {

	private char ganador = ' ';
	private Coordenada[][] coordenadas;

	public MainLogic(Coordenada[][] coordenadas) {
		this.coordenadas = coordenadas;
	}

	public char getGanador() {
		return this.ganador;
	}

	private Coordenada buscarCoordenada(int i, int j) {
		return this.coordenadas[i][j];
	}

	// Validacion de partida
	public boolean validarPartida() {

		if (recorrerPorFilas()) {
			return true;
		}

		if (recorrerPorColumnas()) {
			return true;
		}

		if (recorrerPorDiagonalIzq()) {
			return true;
		}

		if (recorrerPorDiagonalDer()) {
			return true;
		}

		return false;
	}

	private boolean recorrerPorFilas() {
		int cont;

		// Recorrer Por Filas
		for (cont = 0; cont < 3; ++cont) {
			if (buscarCoordenada(cont, 0).getValor() == buscarCoordenada(cont, 1).getValor()
					&& buscarCoordenada(cont, 1).getValor() == buscarCoordenada(cont, 2).getValor()
					&& buscarCoordenada(cont, 2).getValor() != ' ') {
				this.ganador = buscarCoordenada(cont, 0).getValor();
				return true;
			}
		}

		return false;
	}

	private boolean recorrerPorColumnas() {
		int cont;

		// Recorrer Por Columnas
		for (cont = 0; cont < 3; ++cont) {
			if (buscarCoordenada(0, cont) == buscarCoordenada(1, cont)
					&& buscarCoordenada(1, cont).getValor() == buscarCoordenada(2, cont).getValor()
					&& buscarCoordenada(2, cont).getValor() != ' ') {
				this.ganador = buscarCoordenada(0, cont).getValor();
				return true;
			}
		}

		return false;
	}

	private boolean recorrerPorDiagonalIzq() {
		// Recorrer por diagonal 0,0 hasta 2,2
		if (buscarCoordenada(0, 0).getValor() == buscarCoordenada(1, 1).getValor()
				&& buscarCoordenada(1, 1).getValor() == buscarCoordenada(2, 2).getValor()
				&& buscarCoordenada(2, 2).getValor() != ' ') {
			this.ganador = buscarCoordenada(0, 0).getValor();
			return true;
		}

		return false;
	}

	private boolean recorrerPorDiagonalDer() {
		// Recorrer por diagonal 0,2, hasta 2,0
		if (buscarCoordenada(0, 2).getValor() == buscarCoordenada(1, 1).getValor()
				&& buscarCoordenada(1, 1).getValor() == buscarCoordenada(2, 0).getValor()
				&& buscarCoordenada(2, 0).getValor() != ' ') {
			this.ganador = buscarCoordenada(0, 2).getValor();
			return true;
		}

		return false;
	}

}
