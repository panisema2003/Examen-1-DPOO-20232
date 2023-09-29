package Model;

public abstract class Pieza {
	protected String nombre;
	protected int coordenadaFila;
	protected int coordenadaColumna;
	protected Tablero tablero;
	
	public Pieza(String nombre, int coordenadaFila, int coordenadaColumna) {
		this.nombre = nombre;
		this.coordenadaFila = coordenadaFila;
		this.coordenadaColumna = coordenadaColumna;
		this.tablero = new Tablero();
	}
	
	public abstract int getCantidadCasillas();
	
	
}
