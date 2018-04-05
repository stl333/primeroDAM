package ejercicio52;

public class Vehiculo {

	// Atributos de clase

	private int numeroRuedas;
	private int velocidadMaxima;
	private int velocidadActual;
	private int peso;

	// Constructor

	public Vehiculo(int numeroRuedas, int velocidadMaxima, int velocidadActual, int peso)
	{
		this.numeroRuedas = numeroRuedas;
		this.velocidadMaxima = velocidadMaxima;
		this.velocidadActual = velocidadActual;
		this.peso = peso;
	}

	// Metodos

	public int getNumeroRuedas()
	{
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas)
	{
		this.numeroRuedas = numeroRuedas;
	}

	public int getVelocidadMaxima()
	{
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima)
	{
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getVelocidadActual()
	{
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual)
	{
		this.velocidadActual = velocidadActual;
	}

	public int getPeso()
	{
		return peso;
	}

	public void setPeso(int peso) 	// void significa que no devuelve nada
									// ni true, false, un valor,...
									// hace la operación y ya
	{
		this.peso = peso;
	}

	public boolean esIgual(Vehiculo vehiculo)
	{
		if(vehiculo.getNumeroRuedas() == numeroRuedas &&
				vehiculo.getVelocidadMaxima() == velocidadMaxima &&
				vehiculo.getVelocidadActual() == velocidadActual &&
				vehiculo.getPeso() == peso)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void copia(Vehiculo vehiculo)
	{
		numeroRuedas = vehiculo.getNumeroRuedas();
		velocidadMaxima = vehiculo.getVelocidadMaxima();
		velocidadActual = vehiculo.getVelocidadActual();
		peso = vehiculo.getPeso();
	}
}
