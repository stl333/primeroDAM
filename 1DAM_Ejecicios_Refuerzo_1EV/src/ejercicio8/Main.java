package ejercicio8;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		
		int num;
		int cont = 0;
		
		do
		{
			num = aleatorio.nextInt(200);
			cont++;
		}while(num != 100);

		System.out.println("Ha dado " + cont + " vueltas.");
	}

}
