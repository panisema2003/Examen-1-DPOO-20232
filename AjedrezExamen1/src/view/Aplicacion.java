package view;

import java.util.Scanner;

import Model.Peon;
import Model.Pieza;
import Model.Rey;
import Model.Torre;

public class Aplicacion {
	
	private Pieza pieza;
	private int coordenadaFila;
	private int coordenadaColumna;	
	
	
	public int parametros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("Por favor ingrese su pieza: ");
		darPiezas();
		int numeroPieza = sc.nextInt();
		if (numeroPieza == 0) {
			sc.close();
			return 0;
		}
		
		else {
			
			
			System.out.println("Por favor ingrese la fila en la que se encuentre su pieza [1-8]: ");
			this.coordenadaFila = sc.nextInt();
			
			System.out.println("Por favor ingrese la columna en la que se encuentre su pieza [1-8]: ");
			this.coordenadaColumna = sc.nextInt();
			
			sc.close();
			return numeroPieza;
		}
		
		}
		
	
	
	public void ejecutar(int numeroPieza){
		if (numeroPieza == 0) {
			System.out.println("Gracias por usar la aplicación");
		}
		
		if (numeroPieza == 1) {
			pieza = new Peon("Peón", coordenadaFila, coordenadaColumna);
			System.out.println("La pieza se puede mover: " + Integer.toString(pieza.getCantidadCasillas()) + " casillas.");
		}
		
		else if (numeroPieza == 2) {
			pieza = new Torre("Torre",  coordenadaFila, coordenadaColumna);
			System.out.println("La pieza se puede mover: " + Integer.toString(pieza.getCantidadCasillas()) + " casillas.");

		}
		
		else if (numeroPieza == 3) {
			pieza = new Rey("Rey", coordenadaFila, coordenadaColumna);
			System.out.println("La pieza se puede mover: " + Integer.toString(pieza.getCantidadCasillas()) + " casillas.");

		}
		
		else {
			System.out.println("El número de pieza ingresado no es valido");

		}
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("Bienvenido, la apliación se desarrollo con el objetivo de calcular la *cantidad* de casillas que se puede mover una ficha.");
		Aplicacion aplicacion = new Aplicacion();
		int pieza = aplicacion.parametros();
		aplicacion.ejecutar(pieza);
		
		
		

	}
	
	public void darPiezas() {
		System.out.println("1: Peon");
		System.out.println("2: Torre");
		System.out.println("3: Rey");
	}

}
