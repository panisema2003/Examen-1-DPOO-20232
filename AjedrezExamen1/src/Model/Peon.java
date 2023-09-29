package Model;

public class Peon extends Pieza{

	public Peon(String nombre,  int coordenadaFila, int coordenadaColumna) {
		super(nombre, coordenadaFila, coordenadaColumna);
	}
	
	


	@Override
	public int getCantidadCasillas() {
				
		if (this.coordenadaFila == 2) {
			return 2;
		}
		
		else if (this.coordenadaFila == 8) {
			return 0;
		}
		
		else {
			return 1;
		}
	}

	
}
