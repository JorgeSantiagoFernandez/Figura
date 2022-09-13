package ejercicio3;

public class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado(double l) {
		super("Cuadrado");
		this.lado = l;
	}
	
	public void setArea() {
		this.area = lado * lado;
		System.out.println("El area del cuadrado es: " +area);
	}
	
	public void setPerimetro() {
		this.perimetro = lado * 4;
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	}
}