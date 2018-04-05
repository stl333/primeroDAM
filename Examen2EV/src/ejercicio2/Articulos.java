package ejercicio2;

public class Articulos {

	private Articulo[] articulos;
	private int cont;

	public Articulos(int numMaximo)
	{
		articulos = new Articulo[numMaximo];
		cont = 0;
	}

	public int getNumeroArticulos()
	{
		return cont;
	}

	public int getNumeroMaximoArticulos()
	{
		return articulos.length;
	}

	public boolean anadirArticulo(Articulo articulo)
	{
		if(cont == articulos.length)
		{
			return false;
		}

		for(int i = 0; i < cont; i++)
		{
			if(articulo.getNombre().equals(articulos[i].getNombre()))
			{
				return false;
			}
		}

		articulos[cont] = articulo;
		cont++;
		return true;
	}

	public boolean anadirUnidades(String nombreArticulo, int unidades)
	{
		for (int i = 0; i < cont; i++)
		{
			if(articulos[i].getNombre().equals(nombreArticulo))
			{
				// le sumamos las unidades a las que ya tenía
				articulos[i].setUnidades(articulos[i].getUnidades() + unidades);
				return true;
			}
		}
		return false;
	}

	public int totalUnidadesCategoria(char categoria)
	{
		int unidades = 0;

		for(int i = 0; i < cont; i++)
		{
			if(articulos[i].getCategoria() == categoria) // == porque es CHAR
			{
				unidades += articulos[i].getUnidades();
			}
		}

		return unidades;
	}

	public String[] getArticulosCategoria(char categoria)
	{
		int tamanio = 0;

		for(int i = 0; i < cont; i++)
		{
			if(articulos[i].getCategoria() == categoria) // == porque es CHAR
			{
				tamanio++;
			}
		}

		String[] articulosCategoria = new String[tamanio];
		/*
		 * Se podría resetear el tamanio a 0, ya que no hemos acabado con el propósito inicial
		 * de ponerle el tamaño al array.
		 * Esto se haría para darle eficacia al programa, pero en este caso
		 * es una tontería ahorrarse un simple INT, y queda más claro
		 * crear otra variable en vez de "resetearla".
		 */
		int j = 0;

		for(int i = 0; i < cont; i++)
		{
			if(articulos[i].getCategoria() == categoria) // == porque es CHAR
			{
				articulosCategoria[j] = articulos[i].getNombre();
				j++;
			}
		}

		return articulosCategoria;

	}
}
