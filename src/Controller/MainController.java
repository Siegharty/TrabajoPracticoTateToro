package Controller;

import Logic.MainLogic;
import View.MainView;
import View.Botones;

public class MainController {

	private MainLogic logic;
	private MainView view;
	private Botones matriz;
	public static String turno;
	public String ganador;

	public MainController(MainView view) {
		this.matriz = view.botones;
		this.view = view;
		this.turno = "X";
	}
	
	public void InicializarPantalla() {
		view.inicializar();
	}
}
