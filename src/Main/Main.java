package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Controller.MainController;
import View.MainView;

public class Main {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			 //Create our view
			JFrame frame = new JFrame();
	        MainView view = new MainView(frame);

	        //Create our controller
	        MainController controller = new MainController(view);

			public void run() {
				try {
					controller.InicializarPantalla();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
