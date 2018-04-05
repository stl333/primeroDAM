package ejercicio29;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int orden;

		// Pido por teclado el número de orden. Solo sigue adelante si el orden es impar.
		do
		{
			System.out.print("Orden del cuadrado: ");
			orden = sc.nextInt();
			
		}while(orden % 2 == 0);
		
		sc.close();
		
		// El cuadrado mágico empieza con un 1 en la fila 0 y columna de la mitad
		// orden / 2 dará un decimal pero al ser int se queda solo con la parte entera (ej; de 2,5 se queda con el 2)
		// Recordar que columnas/filas empiezan por 0
		
		int fila = 0;
		int columna = orden / 2;
		int[][] cuadrado = new int[orden][orden];

		// Hacemos un for que de tantas vueltas como el orden al cuadrado (orden * orden), ya que hay que completar el área del cuadrado
		for(int num = 1; num <= (orden * orden); num++)
		{
			// Iniciamos con el número 1
			cuadrado[fila][columna] = num;
			
			// Las operaciones las hacemos siempre con el número anterior.
			// Con esto quiero decir que para colocar el 6, el número que "hace las operaciones es el 5"
			// De ahí que cuando quiera colocar el 6, NO pase por el primer if(num % orden == 0) y baje una fila, al ser el número guardado el 5
			// ESTE EJEMPLO TENIENDO EN CUENTA QUE EL ORDEN ES 5.
			if(num % orden != 0)
			{
				// Las filas van de manera ascendente (--) por lo que si la fila es 0, la siguiente será la última de abajo
				if(fila == 0)
				{
					fila = orden - 1;
				}
				else
				{
					fila--;
				}
				// Igual que las filas pero en orden descendente (++)
				if(columna == orden - 1)
				{
					columna = 0;
				}
				else
				{
					columna++;
				}		
			}
			// Si el número es múltiplo del orden, baja una fila simplemente
			else
			{
				fila++;
			}		
		}
		
		// Leemos el array
		for(int num_fila = 0; num_fila < cuadrado.length; num_fila++) 
		{
			for(int num_columna = 0; num_columna < cuadrado[0].length; num_columna++)
			{
				System.out.print(cuadrado[num_fila][num_columna] + "\t");
			}
			System.out.println("\n");
		}
	}

}
