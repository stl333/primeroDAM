package ejemplo_objetos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Empleado empleado = new Empleado("Pepe", 30000, "programador");
		// Empleado, es una clase
		// empleado, es un objeto
		
		System.out.println(empleado.getSueldo());
		*/
		
		Scanner sc = new Scanner(System.in);
		
		Empleado[] empleados = new Empleado[5]; // esto aquí mismo solo tiene 5 nulls
		
		String nombre;
		float sueldo;
		String categoria;
		
		for (int i = 0; i < empleados.length; i++)
		{
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			
			System.out.println("Sueldo: ");
			sueldo = Float.parseFloat(sc.nextLine());
			
			System.out.println("Categoria: ");
			categoria = sc.nextLine();
			
			empleados[i] = new Empleado(nombre, sueldo, categoria);
			empleados[i].subirSueldo(1);
		}
		sc.close();
		
		float sumaSueldos = 0;
		
		for (int i = 0; i < empleados.length; i++) {
			sumaSueldos += empleados[i].getSueldo();
		}
		
		System.out.println("La suma de todos los sueldos es " + sumaSueldos);

	}

}
