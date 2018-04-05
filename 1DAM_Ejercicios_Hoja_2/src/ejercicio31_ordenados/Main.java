package ejercicio31_ordenados;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		int seleccion;
		int cont = 0;
		int aux;
		int borrar;
		boolean borradoEncontrado;
		int borradoPosicion;

		do
		{
			//Mostramos el menú para cada vuelta del bucle
			System.out.println("1.­ Introducir número entero. "
					+ "\n2.­ Listar números. "
					+ "\n3.­ Eliminar número. "
					+ "\n4.­ Eliminar todos los números. "
					+ "\n5.­ Salir.");
			System.out.print("\nIntroduce número: ");
			seleccion = sc.nextInt();

			if(seleccion == 1)
			{
				if(cont == numeros.length)
				{
					System.out.println("ARRAY LLENO.");
				}
				else
				{
					System.out.println("Número a introducir: ");
					aux = sc.nextInt();

					// insertar de manera ordenada
					int i = 0;
					// va recorriendo el array a la derecha mientras la posición de la izquierda > derecha
					// cuando eso deja de pasar, se queda guardada la posición de la 'i'
					while(aux > numeros[i] && i < cont)
					{
						i++;
					}
					// si el número que hemos metido es igual al número que está en esa posición
					// aparece REPETIDO
					if(aux == numeros[i])
					{
						System.out.println("REPETIDO.");
					}
					// insertar en 'i'
					else
					{
						// la 'i' ya está en uso, cogemos la 'j'
						// desplazamos todos los números, hasta la posición i(incluida), a la derecha
						for(int j = cont - 1; j >= i; j--)
						{
							numeros[j+1] = numeros[j];
						}
						// una vez desplazados, almacenamos el número en la posición 'i'
						numeros[i] = aux;
						cont++;
					}
				}
			}
			else if(seleccion == 2)
			{
					// Mostramos el array
					for(int i = 0; i < cont; i++)
					{
						System.out.println(numeros[i]);
					}
			}
			else if(seleccion == 3)
			{
				System.out.print("Número a borrar: ");
				borrar = sc.nextInt();

				// el -1 es para entender mejor el proceso, pero con un 0 sería válido también
				int i = 0;

				// CAMBIADO DEL EJERCICIO ANTERIOR. en vez de buscar posición con un FOR y IF, lo hacemos con un WHILE
				// QUEDA MÁS CORTO
				// Buscamos ese número a borrar en el array que tenemos.
				// Si lo encuentra almacena su posición.
				while(borrar > numeros[i] && i < cont)
				{
					i++;
				}
				if(borrar == numeros[i])
				{
					for(int j = i; j < cont - 1; j++)
					{
							numeros[j] = numeros[j+1];
					}
					cont--;
				}
				else
				{
					System.out.println("Número NO ENCONTRADO.");
				}
			}
			else if(seleccion == 4)
			{
				// Reseteamos el cont y todos los números se irán sobrescribiendo.
				System.out.println("TODOS los números BORRADOS.");
				cont = 0;
			}
			else if(seleccion == 5)
			{
				// esta línea no hace nada, pero si no la ponemos, en el momento de pulsar 5 saldrá NO VÁLIDO.
			}
			else
			{
				System.out.println("NO VÁLIDO.");
			}
			System.out.println();

		}while(seleccion != 5);
	}
}