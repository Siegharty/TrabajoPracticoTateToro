package Model;

public class Coordenada {

	private int X;
	private int Y;
	private char Valor; 
	
	public Coordenada(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	public Coordenada(int x, int y, char valor) {
		this.X = x;
		this.Y = y;
		this.Valor = valor;
	}
	
	//Getters
	public int getX() {
		return this.X;
	}
	
	public int getY() {
		return this.Y;
	}
	
	public char getValor() {
		return this.Valor;
	}
	
	//Setters
	public void setX(int x) {
		this.X = x;
	}
	
	public void setY(int y) {
		this.Y = y;
	}
	
	public void setValor(char valor) {
		this.Valor = valor;
	}
	
}
