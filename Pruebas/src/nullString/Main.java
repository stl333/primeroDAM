package nullString;

public class Main {

	public static void main(String[] args) {
		
		String[] cadena = new String[10];
			
		// no hay nada almacenado por lo que devuelve null
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}
		
		cadena[0] = "";
		cadena[6] = "fdjgkdjggdkgjd";
		
		for (int i = 0; i < cadena.length; i++) {
			// Para comprobar si una posición es null se hace con '==' en vez de equals.()
			if(cadena[i] == null)
			{
				System.out.println("Encontrado en la posición " + i);
			}
			else
			{
				// cuidado con el cadena[i].length
				System.out.println("Hay una cadena en la posición " + i + " de " + cadena[i].length() + " caracteres");
			}
		}
		
		for (int i = 0; i < cadena.length; i++) {
			// está comparando "" con null, da ERROR
			if(cadena[i].equals(""))
			{
				System.out.println("No encontrado.");
			}
		}
	}

}
