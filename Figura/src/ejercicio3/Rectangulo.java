package ejercicio3;


public class Rectangulo extends Figura {
	private double longitud;
	private double ancho;
	
	public Rectangulo(double l, double a) {
		super("Rectangulo");
		this.longitud = l;
		this.ancho = a;
	}
	
	public void setArea() {
		this.area = longitud * ancho;
		System.out.println("El area del cuadrado es: " +area);
	}
	
	public void setPerimetro() {
		this.perimetro = (longitud *2) + (ancho*2);
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	}

}