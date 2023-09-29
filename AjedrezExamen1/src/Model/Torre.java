package Model;

public class Torre extends Pieza{

	public Torre(String nombre,  int coordenadaFila, int coordenadaColumna) {
		super(nombre, coordenadaFila, coordenadaColumna);
	}

	@Override
	public int getCantidadCasillas() {
		//La torre siempre podra recorrer 7 filas y 7 
		//columnas y si es la única ficha en el tablero
		return 14;
	}

}
