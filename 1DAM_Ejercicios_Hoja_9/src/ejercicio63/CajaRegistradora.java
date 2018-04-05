package ejercicio63;

public class CajaRegistradora implements ICajaRegistradora {

	private String nombre;

	private double[] tipoMonedas;

	private int[] contMonedas; // cuando el array es int se inicia todo a 0, si es String a null

	public CajaRegistradora(String nombre, double[] tipoMonedas)
	{
		this.nombre = nombre;
		this.tipoMonedas = tipoMonedas;
		contMonedas = new int[tipoMonedas.length];
	}

	@Override
	public String getNombre() {

		return nombre;

	}

	@Override
	public int getNumTipoMonedas() {

		return tipoMonedas.length;

	}

	@Override
	public int getUnidadesTipoMoneda(double tipo) {

		for(int i = 0; i < tipoMonedas.length; i++)
		{
			if(tipo == tipoMonedas[i])
			{
				return contMonedas[i];
			}
		}
		return -1;

	}

	@Override
	public boolean meterMonedas(double tipo, int unidades) {

		if(monedaValida(tipo))
		{
			contMonedas[conocerPosicion(tipo)] += unidades;
			return true;
		}
		return false;
	}

	@Override
	public boolean monedaValida(double tipo) {

		if(conocerPosicion(tipo) == -1)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean sacarMonedas(double tipo, int unidades) {

		if(monedaValida(tipo))
		{
			contMonedas[conocerPosicion(tipo)] -= unidades;
			return true;
		}
		return false;
	}

	@Override
	public void vaciarCajaRegistradora() {

		for(int i = 0; i < tipoMonedas.length; i++)
		{
			contMonedas[i] = 0;
		}
	}

	@Override
	public double[] getTiposDeMonedas() {

		return tipoMonedas;
	}

	@Override
	public double getSaldo() {

		double saldo = 0;

		for(int i = 0; i < tipoMonedas.length; i++)
		{
			saldo += (tipoMonedas[i] * contMonedas[i]);
		}
		return saldo;
	}

	private int conocerPosicion(double tipo) // para ahorrarnos lineas de codigo en otros metodos
	{
		for(int i = 0; i < tipoMonedas.length; i++)
		{
			if(tipo == tipoMonedas[i])
			{
				return i;
			}
		}
		return -1;
	}
}
