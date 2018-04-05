package ejercicio1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántos números quieres mostrar?: ");
		int n = sc.nextInt();
		sc.close();
		
		int num = 0;
		
		for(int i = 0; i < n; i++, num+=2)
		{
			System.out.print(num + " ");
		}
	}

}
