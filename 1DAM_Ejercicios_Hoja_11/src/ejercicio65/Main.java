package ejercicio65;

import java.util.Scanner;

public class Main {

	private final static int NUM_ALUMNOS = 3;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Alumno[] alumnos = new Alumno[NUM_ALUMNOS];
		String[] notas;

		for(int i = 0; i < NUM_ALUMNOS; i++)
		{
			System.out.println("Nombre del Alumno " + (i+1) + ":");
			alumnos[i] = new Alumno(sc.nextLine());

			System.out.println("Introduce notas separadas por espacio: ");
			notas = sc.nextLine().split(" ");

			for(int j = 0; j < notas.length; j++)
			{
				/*
				 * esto siempre se cumple puesto que aunque no metas nada en las notas
				 * el split creará un array de longitud 1
				 * HACERLO COMO EJERCICIO PROFESOR
				 */
				if(notas.length > 0)
				{
					if(!alumnos[i].anadeNota(Integer.parseInt(notas[j])))
					{
						System.out.println("La nota " + notas[j] + " no se pudo añadir.");
					}
				}
			}
		}
		sc.close();

		System.out.println();
		System.out.println("Listado de alumnos.\n--------------");
		System.out.println("Nombre\tNúmero\tAprobados\tMedia");

		for(int i = 0; i < NUM_ALUMNOS; i++)
		{
			System.out.println(alumnos[i].getNombre() + "\t" +
							alumnos[i].numNotas() + "\t" +
							alumnos[i].getNumeroAprobados() + "\t\t" +
							alumnos[i].getNotaMedia());
		}

	}

}
