package Model;

public class Rey extends Pieza{

	public Rey(String nombre, int coordenadaFila, int coordenadaColumna) {
		super(nombre,coordenadaFila, coordenadaColumna);
	}

	@Override
	public int getCantidadCasillas() {
		
		if (esquina()) {
			return 3;
		}
		else if (arista()) {
			return 5;
		}
		
		else {
			return 8;
		}
		
	}
	
	
	public boolean esquina() {
		if (this.coordenadaColumna == this.coordenadaFila && (this.coordenadaColumna == 1 || this.coordenadaColumna == 8)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean arista() {
		if (this.coordenadaColumna == 1 || this.coordenadaColumna == 8 || this.coordenadaFila == 1 || this.coordenadaFila == 8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	

}
