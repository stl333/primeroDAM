package ejercicio72;

public class Ahorcado implements IAhorcado {

	private char[] panel;
	private String fraseAAdivinar;
	private int intentos;
	private int fallos;

	@Override
	public void partidaNueva(String fraseAAdivinar)
	{
		intentos = 0;
		fallos = 0;

		this.fraseAAdivinar = fraseAAdivinar.toUpperCase();

		panel = new char[fraseAAdivinar.length()];

		for(int i = 0; i < fraseAAdivinar.length(); i++)
		{
			if(fraseAAdivinar.charAt(i) == ' ')
			{
				panel[i] = ' ';
			}
			else
			{
				panel[i] = '-';
			}
		}
	}

	@Override
	public int getNumeroIntentos() {
		return intentos;
	}

	@Override
	public boolean ponerLetra(char letra) {

		intentos++;

		letra = Character.toUpperCase(letra);

		// es lo mismo
		//letra = (letra + "").toUpperCase().charAt(0);

		boolean encontrada = false;

		for(int i = 0; i < panel.length; i++)
		{
			if(letra == fraseAAdivinar.charAt(i) && panel[i] == '-')
			{
				encontrada = true;
				panel[i] = letra;
			}
		}

		if(encontrada)
		{
			return true;
		}
		else
		{
			fallos++;
			return false;
		}
	}

	@Override
	public int getNumeroFallos() {
		return fallos;
	}

	@Override
	public boolean panelCompleto() {

		for(int i = 0; i < panel.length; i++)
		{
			if(panel[i] == '-')
			{
				return false;
			}
		}
		return true;
	}

	@Override
	public String getPanel() {
		return String.valueOf(panel);
	}

}
