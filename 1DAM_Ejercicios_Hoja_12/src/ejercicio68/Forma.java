package ejercicio68;

public abstract class Forma {

	private String nombre;
	private float base;
	private float altura;
	private float posicionX;
	private float posicionY;
	private String color;

	public Forma(float base, float altura)
	{
		this.base = base;
		this.altura = altura;
	}

	
	/*
	 * esto actúa como una interfaz, este método no está hecho, pero habrá
	 * que completarlo en cada clase que herede de Forma
	 */
	public abstract float calcularArea();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(float posicionX) {
		this.posicionX = posicionX;
	}
	public float getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(float posicionY) {
		this.posicionY = posicionY;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
