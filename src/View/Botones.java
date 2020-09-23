package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import Logic.MainLogic;

import Controller.MainController;

public class Botones {

	private JFrame frame;
	private String turno = "X";
	public JButton[][] listaBotones;
	private MainLogic logic; 
	

	public Botones(JFrame frame, int nivel) {
		this.frame = frame;
		this.listaBotones = new JButton[nivel][nivel];
	}

	public void llenarListaBotones() {
		for (int i = 0; i < listaBotones.length; i++) {
			for (int j = 0; j < listaBotones[0].length; j++) {
				JButton boton = new JButton();
				boton.setFont(new Font("Tahoma",90,20));
				boton.setText("");
				agregarEventoBoton(boton);
				this.frame.getContentPane().add(boton);
				listaBotones[i][j] = boton;
			}
		}
	}
	
	private void changeTurno() {
		if(this.turno == "X") {
			this.turno = "O";
			MainController.turno = "O";
		}
		else {
			this.turno = "X";
			MainController.turno = "X";
		}
	}
	
	private void agregarEventoBoton(JButton boton) {
		boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				boton.setText(turno);
				boton.setEnabled(false);
				changeTurno();
				
				MainLogic.setMatriz(listaBotones);
				if(MainLogic.validarPartida()) {
					//Pantallita de ganador
					System.out.println("El ganador es: " + turno);
				}
			}
		});
	}
}
