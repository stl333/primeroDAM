package ejercicio73;

public interface ICarton
{
	/**
	* Busca el número en el cartón y lo tacha si existe
	* @param numero es el número que hay que comprobar en el cartón y tacharlo en caso de
	* que esté
	* @return true si se ha tachado el número, false si no
	*/
	public boolean tacharNumero(int numero);

	/**
	* Comprueba si hay alguna línea hecha en el cartón
	* @return true si hay alguna línea, false en caso contrario
	*/
	public boolean hayLinea();

	/**
	* Comprueba si el cartón tiene un bingo
	* @return true si hay bingo, false si no
	*/
	public boolean hayBingo();
}
