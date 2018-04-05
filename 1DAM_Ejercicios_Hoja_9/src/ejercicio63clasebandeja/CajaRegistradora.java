package ejercicio63clasebandeja;

public class CajaRegistradora implements ICajaRegistradora {

	private String nombre;

	private double[] tipoMonedas;

	private Bandeja[] bandeja;

	public CajaRegistradora(String nombre, double[] tipoMonedas)
	{
		this.nombre = nombre;

		for(int i = 0; i < tipoMonedas.length; i++)
		{
			bandeja[i] = new Bandeja(tipoMonedas[i]);
		}
	}

	@Override
	public String getNombre() {

		return nombre;

	}

	@Override
	public int getNumTipoMonedas() {

		return bandeja.length;

	}

	@Override
	public int getUnidadesTipoMoneda(double tipo) {

		for(int i = 0; i < bandeja.length; i++)
		{
			if(tipo == bandeja[i].getTipoMoneda())
			{
				return bandeja[i].getCantidad();
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

		for(int i = 0; i < bandeja.length; i++)
		{
			contMonedas[i] = 0;
		}
	}

	@Override
	public double[] getTiposDeMonedas() {

		return bandeja;
	}

	@Override
	public double getSaldo() {

		double saldo = 0;

		for(int i = 0; i < bandeja.length; i++)
		{
			saldo += (bandeja[i] * contMonedas[i]);
		}
		return saldo;
	}

	private int conocerPosicion(double tipo) // para ahorrarnos lineas de codigo en otros metodos
	{
		for(int i = 0; i < bandeja.length; i++)
		{
			if(tipo == bandeja[i].getTipoMoneda())
			{
				return i;
			}
		}
		return -1;
	}
}
