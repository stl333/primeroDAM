package ejercicio64;
import java.util.Random;

public class Baraja implements INaipes {

	private int[] cartas;
	private int cont;

	private Random aleatorio;

	private static final String[] NUM = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
	private static final String[] PALO = {"Oros", "Copas", "Espadas", "Bastos"};

	public Baraja()
	{
		cartas = new int[40];

		for(int i = 0; i < cartas.length; i++)
		{
			cartas[i] = i+1;
		}
		cont = 40;
		aleatorio = new Random();
	}

	@Override
	public String traducir(int numCarta) {

		numCarta--;
		return NUM[numCarta % 10] + " de " + PALO[numCarta / 10];
	}

	@Override
	public void barajar() {

		/*
		 * Esto de si el contador = 0 no haga nada, es mejor hacerlo dentro de cada método
		 * pero si lo hacemos en el Main con un if(getNum() == 0) System.out.print("ERROR")
		 * también estaría bien
		 */
		if(cont == 0)
		{
			return;
		}

		int numAleatorio;
		int aux;

		for(int i = 0; i < cont; i++)
		{
			numAleatorio = aleatorio.nextInt(cont); // el rango NUNCA puede ser 0

			aux = cartas[i];
			cartas[i] = cartas[numAleatorio];
			cartas[numAleatorio] = aux;
		}
	}

	@Override
	public int extraerCartaAlAzar() {

		if(cont == 0)
		{
			return -1;
		}

		int numAleatorio = aleatorio.nextInt(cont) + 1;

		int cartaExtraida = cartas[cont - numAleatorio];

		for(int i = cont - numAleatorio; i < cont - 1; i++)
		{
			cartas[i] = cartas[i+1];
		}

		cont--;

		return cartaExtraida;
	}

	@Override
	public int extraerCartaArriba() {

		if(cont == 0)
		{
			return -1;
		}

		cont--;

		return cartas[cont];
		/*
		 * Ej; si la baraja está llena, el contador será de 40, pero no podemos
		 * devolver la posición 40, puesto que llega de 0-39
		 * Por lo que restamos uno al contador, este valdrá 39, con lo que
		 * sacaremos la carta de la posición 39 del array, que es la última.
		 */
	}

	@Override
	public int extraerCarta(int posicion) {

		if(cont == 0  || posicion < 1 || posicion > cont)
		{
			return -1;
		}

		int cartaExtraida = cartas[cont - posicion];

		for(int i = cont - posicion; i < cont - 1; i++)
		{
			cartas[i] = cartas[i+1];
		}

		cont--;

		return cartaExtraida;
	}

	@Override
	public boolean ponerCarta(int numCarta) {

		if(cont == 40 || numCarta < 1 || numCarta > 40)
		{
			return false;
		}

		for(int i = 0; i < cont; i++)
		{
			if(cartas[i] == numCarta)
			{
				return false;
			}
		}

		cartas[cont] = numCarta;
		cont++;
		return true;
	}

	@Override
	public int getNumCartas() {
		return cont;
	}

	@Override
	public void ordenar() {

		if(cont == 0)
		{
			return;
		}

		int aux;

		for(int i = 0; i < cont - 1; i++)
		{
			for(int j = 0; j < cont - 1 - i; j++)
			{
				if(cartas[j] > cartas[j+1])
				{
					aux = cartas[j];
					cartas[j] = cartas[j+1];
					cartas[j+1] = aux;
				}
			}
		}
	}

	public int[] getCartas()
	{
		int[] array = new int[cont];

		for(int i = 0; i < cont; i++)
		{
			array[i] = cartas[i];
		}
		return array;
	}

}
