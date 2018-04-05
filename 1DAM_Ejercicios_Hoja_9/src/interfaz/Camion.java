package interfaz;

public class Camion implements IVehiculo {

	private String matricula;
	private double velocidad;
	private int marcha;

	public Camion(String matricula)
	{
		this.matricula = matricula;
	}
	
	@Override
	public void arrancar() {
		marcha = 1;
		velocidad = 20;
	}

	@Override
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public double getVelocidad() {
		return velocidad;
	}

	@Override
	public void cambiarMarcha(int marcha) {
		this.marcha = marcha;
	}

	@Override
	public int getMarcha() {
		return marcha;
	}
	
	public String getMatricula()
	{
		return matricula;
	}


}
