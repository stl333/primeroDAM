package ejercicio59;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	private static GrupoAlumnos grupoAlumnos;

	public static void main(String[] args)
	{
		grupoAlumnos = new GrupoAlumnos(30);

		Scanner sc = new Scanner(System.in);
		String seleccion = "";

		Alumno[] alumno = new Alumno[5];
		int cont = 0;

		do
		{
			System.out.println("MENU:"
					+ "\n1. Listar alumnos."
					+ "\n2. Aniadir alumno."
					+ "\n3. Poner nota."
					+ "\n4. Borrar nota."
					+ "\n5. Borrar alumno."
					+ "\n6. Salir.\n");

			System.out.println("¿Que quieres hacer?: ");
			seleccion = sc.nextLine();

			switch(seleccion)
			{
				case "1":

					listarAlumnos();
					break;

				case "2":

					if(cont == alumno.length)
					{
						System.out.println("BASE DE DATOS LLENA.");
					}
					else
					{
						boolean repetido = false;

						for(int i = 0; i < cont; i++)
						{

						}
						System.out.println("Nombre nuevo alumno: ");
						alumno[cont] = new Alumno(sc.nextLine());
						cont++;
					}

					break;

				case "3":

					if(cont == 0)
					{
						System.out.println("No hay alumnos en la base de datos.");
					}
					else
					{
						System.out.println("Nombre alumno al que quieres poner nota: ");
						String nombreAnadir = sc.nextLine();

						boolean encontradoAnadir = false;
						int posAnadir = -1;
						for(int i = 0; i < cont && !encontradoAnadir; i++)
						{
							if(alumno[i].getNombre().equals(nombreAnadir))
							{
								encontradoAnadir = true;
								posAnadir = i;
							}
						}
						if(!encontradoAnadir)
						{
							System.out.println("Ese alumno no se encuentra en la base de datos.");
						}
						else
						{
							System.out.println("Evaluacion a anadir: ");
							int evaluacionAnadir = Integer.parseInt(sc.nextLine());
							System.out.println("Nota a anadir: ");
							double notaAnadir = Double.parseDouble(sc.nextLine());

							alumno[posAnadir].ponerNota(evaluacionAnadir, notaAnadir);
						}
					}
					break;

				case "4":

					if(cont == 0)
					{
						System.out.println("No hay alumnos en la base de datos.");
					}
					else
					{
						System.out.println("Nombre alumno del que quieres borrar nota: ");
						String nombreEliminar = sc.nextLine();

						boolean encontradoEliminar = false;
						int posEliminar = -1;
						for(int i = 0; i < cont && !encontradoEliminar; i++)
						{
							if(alumno[i].getNombre().equals(nombreEliminar))
							{
								encontradoEliminar  = true;
								posEliminar = i;
							}
						}
						if(!encontradoEliminar)
						{
							System.out.println("Ese alumno no se encuentra en la base de datos.");
						}
						else
						{
							System.out.println("Evaluacion a borrar");
							int evaluacionEliminar = Integer.parseInt(sc.nextLine());

							alumno[posEliminar].borrarNota(evaluacionEliminar);
						}
					}
					break;

				case "5":

					if(cont == 0)
					{
						System.out.println("No hay alumnos en la base de datos.");
					}
					else
					{
						System.out.println("Alumno a eliminar: ");
						String alumnoEliminar = sc.nextLine();

						boolean encontradoAlumno = false;
						int posAlumno = -1;
						for(int i = 0; i < cont && !encontradoAlumno; i++)
						{
							if(alumno[i].getNombre().equals(alumnoEliminar))
							{
								encontradoAlumno  = true;
								posAlumno = i;
							}
						}
						if(!encontradoAlumno)
						{
							System.out.println("Ese alumno no se encuentra en la base de datos.");
						}
						else
						{
							for(int i = posAlumno; i < cont - 1; i++)
							{
								alumno[i] = alumno[i+1];
							}
							cont--;
						}
					}

				case "6":
					break;

				default:
					System.out.println("Opcion no valida.");
					break;
			}
			System.out.println();
		}while(!seleccion.equals("6"));
	}

	private static void listarAlumnos()
	{
		Alumno[] alumnos = grupoAlumnos.getAlumnos();
		
		System.out.println("Nombre\t1ev\t2ev\t3ev\tMax Nota");
		System.out.println("-----------------------------");

		for(int i = 0; i < alumnos.length; i++)
		{
			System.out.print(alumnos[i].getNombre());

			if(alumnos[i].tieneNota(1))
			{
				System.out.print("\t" + alumnos[i].getNota(1));
			}
			else
			{
				System.out.print("\tX");
			}

			if(alumnos[i].tieneNota(2))
			{
				System.out.print("\t" + alumnos[i].getNota(2));
			}
			else
			{
				System.out.print("\tX");
			}

			if(alumnos[i].tieneNota(3))
			{
				System.out.println("\t" + alumnos[i].getNota(3));
			}
			else
			{
				System.out.println("\tX");
				// estos son ln porque queremos que con la ultima nota cambie de linea
			}
		}
	}

	private static void anadirAlumno(String alumno)
	{
		if(grupoAlumnos.estaLleno())
		{
			System.out.println("BASE DE DATOS LLENA.");
		}
		else
		{
			System.out.println("Nombre: ");
			Alumno alumno = new Alumno(sc.nextLine());

			if(!grupoAlumnos.anadirAlumno(alumno))
			{
				System.out.println("Ya existe.");
			}
		}
	}

	private static void introducirNota()
	{
		System.out.println("Nombre alumno: ");
		String nombre = sc.nextLine();

		if(grupoAlumnos.existeAlumno(nombre))
		{
			int evaluacion;
			System.out.println("Evaluacion (1 / 2 / 3): ");
			evaluacion = Integer.parseInt(sc.nextLine());

			if(evaluacion >= 1 && evaluacion <= 3)
			{
				System.out.println("Nota: ");
				double nota = Double.parseDouble(sc.nextLine());

				if(nota >= 0 && nota <= 10)
				{
					grupoAlumnos.ponerNota(nombre, evaluacion, nota);
				}
				else
				{
					System.out.println("Nota no valida.");
				}
			}
			else
			{
				System.out.println("Evaluacion incorrecta.");
			}
		}
	}

	private static void borrarNota()
	{
		System.out.println("Nombre alumno: ");
		String nombre = sc.nextLine();

		if(grupoAlumnos.existeAlumno(nombre))
		{
			System.out.println("Evaluacion: ");
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
		System.out.println("Alumno a borrar: ");

		String nombre = sc.nextLine();

		if(grupoAlumnos.borrarAlumno(nombre))
		{
			System.out.println("Alumno borrado.");;
		}
		else
		{
			System.out.println("El alumno no existe.");
		}
	}
}
