package ejercicio2;

public class Articulo {


	private String nombre;
	private char categoria;
	private int unidades;

	public Articulo(String nombre, char categoria)
	{
		this.nombre = nombre;
		this.categoria = categoria;
		unidades = 0;
	}

	public int getUnidades()
	{
		return unidades;
	}

	public String getNombre() {
		return nombre;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
}
