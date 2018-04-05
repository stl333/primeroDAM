package ejercicio62;

import ejercicio55.Empleado;

public class Conductor extends Empleado{

	private double totalKilometros;
	private String ciudadesRecorridas;

	public Conductor(String nombre, String telefono)
	{
		super(nombre, telefono);
		totalKilometros = 0;
		ciudadesRecorridas = "";
	}

	public void sumarKilometros(double kilometros)
	{
		totalKilometros += kilometros;
	}

	public double getTotalKilometros()
	{
		return totalKilometros;
	}

	public void pasaPorCiudad(String ciudad)
	{
		if(ciudadesRecorridas.length() == 0)
		{
			ciudadesRecorridas = ciudad;
		}
		else
		{
			ciudadesRecorridas += ", " + ciudad;
		}
	}

	public String[] getCiudadesRecorridas()
	{
		return ciudadesRecorridas.split(", ");
	}
}
