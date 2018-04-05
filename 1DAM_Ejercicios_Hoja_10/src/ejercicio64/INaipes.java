package ejercicio64;

public interface INaipes {

	/**
	* Traduce el número de la carta por su nombre:
	* Ej.:
	* 1 = As de oros
	* 2 = Dos de oros
	* ...
	* 20 = Rey de copas
	* ...
	* @param numCarta (del 1 al 40)
	* @return El nombre de la carta, o "" si numCarta no es válido. */
	public String traducir(int numCarta);


	/**
	* Baraja las cartas que haya mazo de manera aleatoria
	*/
	public void barajar();


	/**
	* Extrae una carta al azar de las que haya en el mazo
	* y disminuye el número de cartas
	* @return devuelve el valor de la carta (del 1 al 40)
	*/
	public int extraerCartaAlAzar();


	/**
	* Extrae la carta superior del mazo y disminuye el número de cartas
	* @return devuelve el valor de la carta (del 1 al 40)
	*/
	public int extraerCartaArriba();


	/**
	* @param posicion (las posiciones comienzan desde la 1, hasta el número
	* de cartas que tenga el mazo en cada momento)
	* @return -1 si no encuentra la posicion
	*/
	public int extraerCarta(int posicion);


	/**
	* Añade la carta indicada por parámetro sobre el mazo
	* @param numCarta (las cartas válidas van del 1 al 40)
	* @return false si la carta ya existe, true si se añade correctamente
	*/
	public boolean ponerCarta(int numCarta);


	/**
	* Devuelve el número de cartas existentes.
	* @return Número de cartas actuales en el mazo.
	*/
	public int getNumCartas();


	/**
	* Ordena las cartas existentes en el mazo por palo (oros, copas, espadas y
	* bastos) y dentro de cada palo por puntos.
	*/
	public void ordenar();
}
