package ahorcado;

public class Ahorcado implements IAhorcado
{

	private String fraseAAdivinar;
	private char[] panel;
	private int numIntentos;
	private int numFallos;

	public Ahorcado()
	{
		super();
	}


	@Override
	public void partidaNueva(String fraseAAdivinar)
	{
		numIntentos = 0;
		numFallos = 0;

		this.fraseAAdivinar = fraseAAdivinar.toUpperCase();

		panel = new char[fraseAAdivinar.length()];
		for (int i = 0; i < panel.length; i++)
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
	public int getNumeroIntentos()
	{
		return numIntentos;
	}

	@Override
	public boolean ponerLetra(char letra)
	{
		numIntentos++;

		boolean encontrado = false;

		letra = Character.toUpperCase(letra);

		//(letra + "").toUpperCase().charAt(0);

		for (int i = 0; i < fraseAAdivinar.length(); i++)
		{
			if(fraseAAdivinar.charAt(i) == letra &&
					panel[i] == '-')
			{
				encontrado = true;
				panel[i] = letra;
			}
		}

		if(!encontrado)
		{
			numFallos++;
		}

		return encontrado;
	}

	@Override
	public int getNumeroFallos()
	{
		return numFallos;
	}

	@Override
	public boolean panelCompleto()
	{
		return false;
	}

	@Override
	public String getPanel()
	{
		return String.valueOf(panel);
	}

}
