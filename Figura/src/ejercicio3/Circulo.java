package ejercicio3;

public class Circulo extends Figura {
	private final double pi = 3.14;
	private double radio;
	
	public Circulo(double r) {
		super("Circulo");
		this.radio = r;
	}
	
	public void setArea() {
		this.area = pi * Math.pow(radio, 2);
		System.out.println("El area del circulo es: " + area);
	}
	
	public void setPerimetro() {
		this.perimetro = 2 * pi * radio;
		System.out.println("El perimetro del circulo es: " + perimetro);
	}

}