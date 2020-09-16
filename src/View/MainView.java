package View;

import java.awt.GridLayout;
import javax.swing.JFrame;

public class MainView {

	private Botones botones;
	private JFrame frame;

	public MainView(JFrame frame) {
		this.frame = frame;
	}

	public void inicializar() {
		this.frame.setBounds(100, 100, 450, 300);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setResizable(false);
		this.frame.setLocationRelativeTo(null);
		this.frame.getContentPane().setLayout(new GridLayout(3, 3, 0, 0));
		this.frame.setVisible(true);
		
		botones = new Botones(frame,3);
		botones.llenarListaBotones(frame);
		
	}

}
