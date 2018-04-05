package ejercicio32;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[8]; // en este array ahora mismo son todo 'null', en vez de 0 como en los int
		int seleccion = 5;
		int cont = 0;
		boolean repetido;
		String aux;
		String borrar;
		boolean borradoEncontrado;
		int borradoPosicion;

		do
		{
			// Mostramos el menú para cada vuelta del bucle
			System.out.println("1­ Introducir cadena."
					+ "\n2­ Listar cadenas."
					+ "\n3­ Eliminar cadena."
					+ "\n4­ Eliminar todas las cadenas."
					+ "\n5­ Salir.");
			
			System.out.print("\nIntroduce número: ");
			seleccion = Integer.parseInt(sc.nextLine());

			switch(seleccion)
			{

				case 1:
	
					if(cont == palabras.length)
					{
						System.out.println("ARRAY LLENO.");
					}
					else
					{
						repetido = false;
						System.out.println("Frase a introducir: ");
						aux = sc.nextLine();
	
						// Buscamos que la cadena a incluir no esté ya incluida en el array
						for(int i = 0; i < cont && !repetido; i++)
						{
							if(aux.equals(palabras[i]))
							{
								repetido = true;
							}
						}
						// Si no está repetida la almacenamos
						if(!repetido)
						{
							palabras[cont] = aux;
							cont++;
						}
						else
						{
							System.out.println("REPETIDA.");
						}
					}
					break;

				case 2:
						// Mostramos el array
						for(int i = 0; i < cont; i++)
						{
							System.out.println(palabras[i]);
						}
						break;
						
				case 3:
				
					System.out.print("Cadena a borrar: ");
					borrar = sc.nextLine();

					borradoEncontrado = false;
					// el -1 es para entender mejor el proceso, pero con un 0 será válido también
					borradoPosicion = -1;

					// Buscamos ese número a borrar en el array que tenemos.
					// Si lo encuentra almacena su posición.
					for(int i = 0; i < cont && !borradoEncontrado; i++)
					{
						if(borrar.equals(palabras[i]))
						{
							borradoEncontrado = true;
							borradoPosicion = i;
						}
					}
					if(!borradoEncontrado)
					{
						System.out.print("Cadena a borrar NO ENCONTRADA.");

					}
					else
					{
						for(int i = borradoPosicion; i < cont; i++)
						{
								palabras[i] = palabras[i+1];
						}
						cont--;
					}
					break;
					
				case 4:
				
					// Reseteamos el cont y todos los números se irán sobrescribiendo.
					System.out.println("TODAS las cadenas BORRADAS.");
					cont = 0;
					
					break;
					
				case 5:
				
					// esta línea no hace nada, pero si no la ponemos, en el momento de pulsar 5 saldrá NO VÁLIDO.
					break;
					
				default:
				
					System.out.println("NO VÁLIDO.");
					break;
			}
			System.out.println();

		}while(seleccion != 5);
	}
}
