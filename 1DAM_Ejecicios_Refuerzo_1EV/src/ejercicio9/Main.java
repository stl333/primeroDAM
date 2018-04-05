package ejercicio9;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String[] letra = new String[20];
		String aux;
		int cont = 0;
		boolean repetido = false;
		
		while(cont < letra.length && !repetido)
		{
			System.out.println("Letra: ");
			aux = sc.nextLine();
			
			if(aux.length() == 1)
			{
				letra[cont] = aux;
				
				for(int i = 0; i < cont; i++)
				{
					if(letra[i].equals(letra[cont]))
					{
						repetido = true;
					}
				}
				cont++;
			}
			else
			{
				System.out.println("Has introducido más de un caracter.");
			}
		}
		sc.close();
		
		if(repetido)
		{
			System.out.println("Hay repetidas.");
		}
		else
		{
			System.out.println("NO hay repetidas.");
		}
	}

}
