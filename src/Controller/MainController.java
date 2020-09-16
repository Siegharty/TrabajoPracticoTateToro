package Controller;

import Model.Coordenada;
import Logic.MainLogic;
import View.MainView;

public class MainController {

	private MainLogic logic;
	private MainView view;
	private Coordenada[][] coordenadas;
	private char turno;
	private char ganador;

	public MainController(MainView view) {
		this.coordenadas = new Coordenada[3][3];
		this.logic = new MainLogic(this.coordenadas);
		this.view = view;
		this.turno = 'X';
	}

	private void llenarCoordenadas() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Coordenada coordenada = new Coordenada(i, j, ' ');
				coordenadas[i][j] = coordenada;
			}
		}
	}

	public void InicializarPantalla() {
		view.inicializar();
	}
}
