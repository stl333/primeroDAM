package excepciones;

public class Main
{

	public static void main(String[] args)
	{
		int[] nums = {1,2,3};

		String nombre = null;

		try
		{
			nums[0] = 1;
			System.out.println("Hola mundo.");
			System.out.println(nombre.length());
		}
		catch(NullPointerException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Puntero nulo o índice no válido.");
		}
		catch(Exception e)
		{
			System.out.println("Excepción en general");
		}


	}

}
