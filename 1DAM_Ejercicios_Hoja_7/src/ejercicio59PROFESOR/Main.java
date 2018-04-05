package ejercicio59PROFESOR;

import java.util.Scanner;

public class Main
{


	private static Scanner sc = new Scanner(System.in);

	private static GrupoAlumnos grupoAlumnos;

	public static void main(String[] args)
	{

		grupoAlumnos = new GrupoAlumnos(30);


		String opcion = "0";

		while(!opcion.equals("6"))
		{
			mostrarMenu();
			opcion = sc.nextLine();
			switch(opcion)
			{
				case "1":
					listarAlumnos();
					break;
				case "2":
					introducirAlumno();
					break;
				case "3":
					introducirNota();
					break;
				case "4":
					borrarNota();
					break;
				case "5":
					borrarAlumno();
					break;
				case "6":
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
		}

	}

	private static void mostrarMenu()
	{
		System.out.println( "1.-Listar alumnos.\n" +
							"2.-Introducir alumno.\n" +
							"3.-Introducir nota.\n" +
							"4.-Borrar nota.\n" +
							"5.-Borrar alumno.\n" +
							"6.-Salir.");
	}

	private static void listarAlumnos()
	{
		System.out.println("Nombre\t1ev\t2ev\t3ev\tMax.");
		Alumno[] alumnos = grupoAlumnos.getAlumnos();
		for (int i = 0; i < alumnos.length; i++)
		{
			System.out.println(alumnos[i].getNombre() + "\t" +
					(alumnos[i].getNota(1) == -1 ? "-" : alumnos[i].getNota(1)) + "\t" +
					(alumnos[i].getNota(2) == -1 ? "-" : alumnos[i].getNota(2)) + "\t" +
					(alumnos[i].getNota(3) == -1 ? "-" : alumnos[i].getNota(3)) + "\t" +
					(alumnos[i].notaMaxima() == -1 ? "-" : alumnos[i].notaMaxima()));
		}
	}

	private static void introducirAlumno()
	{
		if(grupoAlumnos.estaLleno())
		{
			System.out.println("Grupo lleno.");
		}
		else
		{
			System.out.print("Nombre: ");
			String nombreAlumno = sc.nextLine();
			if(!grupoAlumnos.anadirAlumno(nombreAlumno))
			{
				System.out.println("Ya existe el alumno.");
			}
			else
			{
				System.out.println("Se añadió el alumno.");
			}
		}
	}


	private static void introducirNota()
	{
		System.out.print("Nombre alumno: ");
		String nombre = sc.nextLine();

		if(grupoAlumnos.existeAlumno(nombre))
		{
			int evaluacion;
			System.out.print("Evaluación (1,2,3): ");
			evaluacion = Integer.parseInt(sc.nextLine());
			if(evaluacion >= 1 && evaluacion <= 3)
			{
				System.out.print("Nota: ");
				double nota = Double.parseDouble(sc.nextLine());
				if(nota >= 0 && nota <= 10)
				{
					grupoAlumnos.ponerNota(nombre, evaluacion, nota);
				}
				else
				{
					System.out.println("Nota no válida.");
				}
			}
			else
			{
				System.out.println("Número de evaluacion incorrecta.");
			}
		}


	}
	private static void borrarNota()
	{
		System.out.print("Nombre alumno: ");
		String nombre = sc.nextLine();
		if(grupoAlumnos.existeAlumno(nombre))
		{
			System.out.print("Evaluación: ");
			int evaluacion = Integer.parseInt(sc.nextLine());
			if(evaluacion >= 1 && evaluacion <= 3)
			{
				grupoAlumnos.borrarNota(nombre, evaluacion);
			}
		}
		else
		{
			System.out.println("El alumno no existe.");
		}
	}
	private static void borrarAlumno()
	{
		System.out.print("Alumno a borrar: ");
		String nombre = sc.nextLine();

		if(grupoAlumnos.borrarAlumno(nombre))
		{
			System.out.println("Alumno borrado.");
		}
		else
		{
			System.out.println("El alumno no existe.");
		}
	}

}
