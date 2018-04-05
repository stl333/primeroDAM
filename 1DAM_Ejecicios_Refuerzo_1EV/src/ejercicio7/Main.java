package ejercicio7;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean primo;
		
		do
		{
			primo = true;
			
			System.out.println("Numero: ");
			num = sc.nextInt();
			
			for(int i = 2; i <= num / 2; i++)
			{
				if(num % i == 0)
				{
					primo = false;
				}
			}
			
		}while(!primo);
		sc.close();

	}

}
