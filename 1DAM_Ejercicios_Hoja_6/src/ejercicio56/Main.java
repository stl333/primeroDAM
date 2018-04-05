package ejercicio56;

public class Main {

	public static void main(String[] args) {

		System.out.println(MiString.alReves("APUNTADOR"));

		System.out.println(MiString.limpiaCaracteres("Me llamo Carlos", "ar"));
		
		System.out.println(MiString.limpiaBloque("Holacaba", "lac"));
		
		System.out.println(MiString.sustituye("holababababa", 'a', 'd'));
		
		if(MiString.todosIguales("aaAaaaaAaa"))
		{
			System.out.println("Son todos iguales.");
		}
		else
		{
			System.out.println("No son todos iguales.");
		}
		
		if(MiString.todosIguales("aaaaaaaba"))
		{
			System.out.println("Son todos iguales.");
		}
		else
		{
			System.out.println("No son todos iguales.");
		}
		
		System.out.println(MiString.quitaEspacios("Hola me llamo Juan."));
		
		if(MiString.esNumeroEntero("56789"))
		{
			System.out.println("Todo son numeros.");
		}
		else
		{
			System.out.println("No son todo numeros.");
		}
		
		if(MiString.esNumeroEntero("56abc89"))
		{
			System.out.println("Todo son numeros.");
		}
		else
		{
			System.out.println("No son todo numeros.");
		}
		
		if(MiString.esNumeroEntero2("56789"))
		{
			System.out.println("Todo son numeros.");
		}
		else
		{
			System.out.println("No son todo numeros.");
		}
		
		if(MiString.esNumeroEntero2("  5672345"))
		{
			System.out.println("Todo son numeros.");
		}
		else
		{
			System.out.println("No son todo numeros.");
		}
	}

}
