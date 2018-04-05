package ejercicio60;

public class Main {

	public static void main(String[] args)
	{
		
		System.out.println(Calcula.mayor(5, 7, 14, 56));
		
		int a = 567;
		int b = 547;
		
		System.out.println(Calcula.mayor(a, b));
		
		int[] num = {56, 35, 75};
		
		System.out.println(Calcula.mayor(num));
		
		System.out.println(Calcula.mayor(new int[] {2, 45, 57, 89, 3}));
		
		System.out.println(Calcula.mayor("a", "ab", "abc"));
		
		System.out.println(Calcula.menor("ADIOS", "ESRTERNOCLEIDO", "HOLA", "ORDENADOR"));
	}
}
