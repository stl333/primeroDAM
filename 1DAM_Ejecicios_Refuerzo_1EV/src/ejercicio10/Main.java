package ejercicio10;

public class Main {

	public static void main(String[] args) {
		
		int num = 100;
		int cont = 0;
		
		while(cont < 100)
		{
			if(num % 2 != 0)
			{
				System.out.println(num + " es el impar nº " + (cont+1));
				cont++;
			}
			num++;
		}
	}
}
