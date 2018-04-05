package ejercicio2;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		/*
		int num;
		
		for(int i = 0; i < 15; i++)
		{
			num = aleatorio.nextInt(100) + 1;
			
			if(num <= 50)
			{
				System.out.println((i+1) + " - 1");
			}
			else if(num <= 70)
			{
				System.out.println((i+1) + " - X");
			}
			else
			{
				System.out.println((i+1) + " - 2");
			}
		}*/
		
		double num;
		
		for(int i = 0; i < 15; i++)
		{
			num = aleatorio.nextDouble();
			
			
			if(num <= 0.5)
			{
				System.out.println((i+1) + " - 1");
			}
			else if(num <= 0.7)
			{
				System.out.println((i+1) + " - X");
			}
			else
			{
				System.out.println((i+1) + " - 2");
			}
		}
	}

}
