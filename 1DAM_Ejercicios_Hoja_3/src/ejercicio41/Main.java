package ejercicio41;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero de filas: ");
		int fila = sc.nextInt();
		
		System.out.print("N�mero de columnas: ");
		int columna = sc.nextInt();

		int[][] tabla = new int[fila][columna];
		int num;
		
		// pedimos n�mero inicial
		do
		{
			System.out.print("Elige entre 0 o 1: ");
			num = sc.nextInt();
			
		}while(num != 0 && num != 1);
		
		sc.close();
		
		int cont = 0;
		int filaLlenado = 0;
		int columnaLlenado = 0;
		
		// el WHILE se ejecuta hasta que contador supere el �rea de la tabla
		
		
		while(cont < tabla.length * tabla[0].length)
		{
			tabla[filaLlenado][columnaLlenado] = num;
			
			// si la fila es par
			if(filaLlenado % 2 == 0)
			{
				// si la columna es menor que la �ltima posici�n (es decir la pen�ltima)
				if(columnaLlenado < tabla[0].length - 1)
				{
					// aumentamos 1 la columna (por lo que si es la pen�ltima llegamos hasta la �ltima)
					// si en el IF anterior pusiesemos <= tabla[0].length - 1, a la hora de sumar
					// 1 columna, se saldr�a del array
					columnaLlenado++;
					cont++;
				}
				// si la columna est� en la �ltima posici�n
				else
				{
					// bajamos una fila
					filaLlenado++;
					cont++;
				}
			}
			// si la fila es impar, hacemos los movimientos contrarios (derecha a izquierda)
			else
			{	
				// aqu� tampoco ponemos >= 0, por que al restar una columna despu�s se saldr�a tambi�n
				// del array
				if(columnaLlenado > 0)
				{
					columnaLlenado--;
					cont++;
				}
				else
				{
					filaLlenado++;
					cont++;
				}	
			}
			if(num == 0)
			{
				num++;
			}
			else
			{
				num--;
			}
		}
		
		// mostramos array
		for(int i = 0; i < tabla.length; i++)
		{
			for(int j = 0; j < tabla[0].length; j++)
			{
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
