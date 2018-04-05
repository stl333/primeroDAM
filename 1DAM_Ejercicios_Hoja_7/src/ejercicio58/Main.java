package ejercicio58;

public class Main {

	public static void main(String[] args) {

		Rectangulo rectangulo1 = new Rectangulo(5.5f, 10.5f);
		
		System.out.println("La base es " + rectangulo1.getBase() + " y la altura es " + rectangulo1.getAltura());

		rectangulo1.agranda(2.5f);
		
		System.out.println("La base es " + rectangulo1.getBase() + " y la altura es " + rectangulo1.getAltura());
		
		System.out.println("Area: " + rectangulo1.getArea() + " Perimetro: " + rectangulo1.getPerimetro());
		
		rectangulo1.agranda();
		
		System.out.println("La base es " + rectangulo1.getBase() + " y la altura es " + rectangulo1.getAltura());
		
		System.out.println("Area: " + rectangulo1.getArea() + " Perimetro: " + rectangulo1.getPerimetro());
	}

}
