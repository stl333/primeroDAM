package ejercicio6;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num;
		int suma = 0;
		
		do
		{
			System.out.println("Numero: ");
			num = sc.nextInt();
			suma += num;
			
		}while(suma < 30);
		sc.close();
	}
}
