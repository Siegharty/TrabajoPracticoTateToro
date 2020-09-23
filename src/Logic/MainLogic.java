package Logic;

import javax.swing.JButton;
import View.Botones;


public class MainLogic {

	private static String ganador = " ";
	private static JButton[][] _matriz;

	public static String getGanador() {
		return ganador;
	}
	
	public static void setMatriz(JButton[][] matriz) {
		_matriz = matriz;
	}

	private static JButton buscarCoordenada(int i, int j) {
		return _matriz[i][j];
	}

	// Validacion de partida
	public static boolean validarPartida() {

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

	private static boolean recorrerPorColumnas() {
		int cont;

		// Recorrer Por Filas
		for (cont = 0; cont < 3; ++cont) {
			if (buscarCoordenada(cont, 0).getText() == buscarCoordenada(cont, 1).getText()
					&& buscarCoordenada(cont, 1).getText() == buscarCoordenada(cont, 2).getText()
					&& buscarCoordenada(cont, 2).getText() != "") {
				ganador = buscarCoordenada(cont, 0).getText();
				return true;
			}
		}

		return false;
	}

	private static boolean recorrerPorFilas() {
		int cont;

		// Recorrer Por Columnas
		for (cont = 0; cont < 3; ++cont) {
			if (buscarCoordenada(0, cont) == buscarCoordenada(1, cont)
					&& buscarCoordenada(1, cont).getText() == buscarCoordenada(2, cont).getText()
					&& buscarCoordenada(2, cont).getText() != "") {
				ganador = buscarCoordenada(0, cont).getText();
				return true;
			}
		}

		return false;
	}

	private static boolean recorrerPorDiagonalIzq() {
		// Recorrer por diagonal 0,0 hasta 2,2
		if (buscarCoordenada(0, 0).getText() == buscarCoordenada(1, 1).getText()
				&& buscarCoordenada(1, 1).getText() == buscarCoordenada(2, 2).getText()
				&& buscarCoordenada(2, 2).getText() != "") {
			ganador = buscarCoordenada(0, 0).getText();
			return true;
		}

		return false;
	}

	private static boolean recorrerPorDiagonalDer() {
		// Recorrer por diagonal 0,2, hasta 2,0
		if (buscarCoordenada(0, 2).getText() == buscarCoordenada(1, 1).getText()
				&& buscarCoordenada(1, 1).getText() == buscarCoordenada(2, 0).getText()
				&& buscarCoordenada(2, 0).getText() != "") {
			ganador = buscarCoordenada(0, 2).getText();
			return true;
		}

		return false;
	}

}
