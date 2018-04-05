package ejercicio52;

public class Main {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo(4, 160, 0, 1000);
		Vehiculo vehiculo2 = new Vehiculo(4, 180, 0, 1000);

		/*
		if(vehiculo1.getNumeroRuedas() == vehiculo2.getNumeroRuedas() &&
				vehiculo1.getVelocidadMaxima() == vehiculo2.getVelocidadMaxima() &&
				vehiculo1.getVelocidadActual() == vehiculo2.getVelocidadActual() &&
				vehiculo1.getPeso() == vehiculo2.getPeso())
		{

		} ES IGUAL A LA CONDICIÓN DE ABAJO, PUESTO QUE YA LO HEMOS PROGRAMADO EN LA CLASE VEHICULO*/

		if(vehiculo1.esIgual(vehiculo2)) // se comprueba como los Strings
		{
			System.out.println("Son iguales.");
		}
		else
		{
			System.out.println("No son iguales.");
		}

		vehiculo1.copia(vehiculo2);

		if(vehiculo1.esIgual(vehiculo2))
		{
			System.out.println("Son iguales.");
		}
		else
		{
			System.out.println("No son iguales.");
		}
	}

}
