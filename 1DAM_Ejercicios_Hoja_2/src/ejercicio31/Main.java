package ejercicio31;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		int seleccion;
		int cont = 0;
		boolean repetido;
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
					repetido = false;
					System.out.println("Número a introducir: ");
					aux = sc.nextInt();
					
					// Buscamos que el número a introducir no esté ya incluido en el array
					for(int i = 0; i < cont && !repetido; i++)
					{
						if(aux == numeros[i])
						{
							repetido = true;
						}
					}
					// Si no está repetido lo almacenamos
					if(!repetido)
					{
						numeros[cont] = aux;
						cont++;
					}
					else
					{
						System.out.println("REPETIDO.");
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
				
				borradoEncontrado = false;
				// el -1 es para entender mejor el proceso, pero con un 0 sería válido también
				borradoPosicion = -1;
				
				// Buscamos ese número a borrar en el array que tenemos.
				// Si lo encuentra almacena su posición.
				for(int i = 0; i < cont && !borradoEncontrado; i++)
				{
					if(borrar == numeros[i])
					{
						borradoEncontrado = true;
						borradoPosicion = i;
					}
				}
				if(!borradoEncontrado)
				{
					System.out.print("Número a borrar NO ENCONTRADO.");
				
				}
				else
				{
					// Empezamos el for en la posición del número a borrar, para desplazarlo a la derecha
					// (los números de antes no queremos moverlos)
					// el cont - 1 es para cuando el array ya tiene todos sus valores almacenados (en este caso 10 números)
					// no se salga del array con el movimiento numeros[i+1]
					// NOTA: si pusiésemos un cont en vez de cont - 1, no daría error salvo si el array está lleno.
					// Pero cambiaríamos el último número con un 0 (de las posiciones vacías) y al quitarle 1 al contador
					// tampoco saldría, pero ya estamos ejecutando un movimiento innecesario.
					for(int i = borradoPosicion; i < cont; i++)
					{
							numeros[i] = numeros[i+1];					
					}
					// Restamos 1 al contador y ese número desplazado a la derecha "desaparece".
					// Porque esa posición ya no la leemos al listar.
					// La siguiente vez que introduzcamos número se sobrescribe con el nuevo que metemos.
					cont--;
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
