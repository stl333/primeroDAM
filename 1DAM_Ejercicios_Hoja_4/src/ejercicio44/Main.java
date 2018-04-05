package ejercicio44;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.close();

		boolean par = false;
		if(num % 2 == 0)
		{
			par = true;
		}

		boolean capicua = true;
		String stringNum = String.valueOf(num); // también vale = num + "";
		for(int i = 0; i < stringNum.length() / 2 && capicua; i++)
		{
			if(stringNum.charAt(i) != stringNum.charAt(stringNum.length() - 1 -i))
			{
				capicua = false;
			}
		}

		System.out.println("El número es " + (par ? "par" : "impar") + " y " + (capicua ? "capicua" : "no capicua"));
	}
}
