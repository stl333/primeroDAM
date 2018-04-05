package ejercicio48;

public class Main {

	public static void main(String[] args) {
		
		// Hay que introducir los datos en RUN > RUN CONGIFURATIONS > ARGUMENTS > PROGRAM ARGUMENTS
		System.out.println("Has introducido " + args.length + " argumentos.");
		System.out.println("Argumentos: ");
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
		
		float suma = 0; // si pusiésemos Float, habría que hacer = 0f; MIRAR DIFERENCIA
		
		for(int i = 0; i < args.length; i++)
		{
			suma += Float.parseFloat(args[i]);
		}
		System.out.println("La suma es " + suma);
	}
}
