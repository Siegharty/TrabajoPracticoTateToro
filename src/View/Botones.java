package View;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Botones {
	
	private JButton[][] listaBotones;
	
	public Botones(JFrame frame,int nivel) 
	{
		listaBotones = new JButton[nivel][nivel];
	}
	
	public void llenarListaBotones(JFrame frame) 
	{
		for(int i =0 ; i< listaBotones.length ; i++) {
			for(int j= 0 ; j< listaBotones[0].length; j++) {
				JButton boton = new JButton();
				frame.getContentPane().add(boton);
				listaBotones[i][j] = boton;	
			}
		}
	}
	
	public void actualizarBoton(JButton boton,int coordX,int coordY) {
		
	}
	
	

}
