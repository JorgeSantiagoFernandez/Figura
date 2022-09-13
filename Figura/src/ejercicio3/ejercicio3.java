package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.print("Menu" +"\n\n");
			System.out.print("1.Circulo\n2.Rectangulo\n3.Cuadrado\nIndica tu seleccion: ");
			Scanner input = new Scanner(System.in);
			opcion = input.nextInt();
			
			if(opcion < 1 || opcion > 3)
				System.out.println("Introduzca una opcion valida, por favor.");
		}
		while(opcion < 1 || opcion > 3);
		
		switch(opcion) {
		case 1:
			System.out.print("Indica el radio: ");
			Scanner inputR = new Scanner(System.in);
			double radio = inputR.nextDouble();
			
			Circulo circulo = new Circulo(radio);
			circulo.setArea();
			circulo.setPerimetro();
			
			break;
		case 2:
			System.out.print("Indica la longitud: ");
			Scanner inputL = new Scanner(System.in);
			double longitud = inputL.nextDouble();
			System.out.print("Indica el ancho: ");
			Scanner inputA = new Scanner(System.in);
			double ancho = inputA.nextDouble();
			
			Rectangulo rectangulo = new Rectangulo(longitud, ancho);
			rectangulo.setArea();
			rectangulo.setPerimetro();
			
			break;
		case 3:
			System.out.print("Indica el lado: ");
			Scanner inputLado = new Scanner(System.in);
			double lado = inputLado.nextDouble();
			
			Cuadrado cuadrado = new Cuadrado(lado);
			cuadrado.setArea();
			cuadrado.setPerimetro();
			
			break;
		}
		
	}

}
