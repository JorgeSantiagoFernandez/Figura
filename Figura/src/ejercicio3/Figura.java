package ejercicio3;


public abstract class Figura {
	protected String nombre;
	protected double area;
	protected double perimetro;
	
	public Figura(String n) {
		this.nombre = n;
	}
	
	public double area() {
		return area;
	}
	
	public double perimetro() {
		return perimetro;
	}

}
