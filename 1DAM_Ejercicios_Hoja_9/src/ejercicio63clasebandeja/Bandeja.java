package ejercicio63clasebandeja;

public class Bandeja {

	private double tipoMoneda;
	private int cantidad;

	public Bandeja(double tipoMoneda)
	{
		this.tipoMoneda = tipoMoneda;
		cantidad = 0;
	}

	public double getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(double tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


}
