package ejercicio71;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int NUM = 5;

		Alumno[] alumnos = new Alumno[NUM];

		String nombre;
		int edad;
		double nota;
		int cont = 0;

		while(cont < NUM)
		{
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Edad: ");

			try
			{
				edad = Integer.parseInt(sc.nextLine());
				System.out.println("Nota: ");
				nota = Double.parseDouble(sc.nextLine());
				alumnos[cont] = new Alumno(nombre, edad);
				alumnos[cont].setNota(nota);
				cont++;
			}
			catch(NumberFormatException e)
			{
				System.out.println("No es un número.");
			}
			catch(EdadNoValidaException e)
			{
				System.out.println(e.getMessage());
			}
			catch(NotaNoValidaException e)
			{
				System.out.println(e.getMessage());
			}

		}

		sc.close();

		for(Alumno a : alumnos)
		{
			System.out.println(a.getNombre() + " " + a.getEdad() +
					"" + a.getNota());
		}

	}

}
