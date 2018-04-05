package ejercicio33;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int[] contador = new int[6];
		
		int num;
		int cont = 0;
		
		while(cont < 200)
		{
			System.out.print("Número: ");
			num = sc.nextInt();
			
			if(num >= 0 && num < contador.length)
			{	
				contador[num]++;
				cont++;
			}
			else
			{
				System.out.println("Número NO VÁLIDO.");
			}	
		}
		sc.close();
		
		System.out.println("Frecuencias");
		for(int i = 0; i < contador.length; i++)
		{
			System.out.println(i + ":" + contador[i] + " veces.");
		}
	}

}
