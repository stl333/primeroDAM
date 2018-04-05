package ejercicio58;

public class Rectangulo {

	private float base;
	private float altura;
	private float x;
	private float y;

	public Rectangulo() // los valores de los atributos inicializarlos mejor en el constructor
	{
		base = 1f;
		altura = 1f;
		x = 0f;
		y = 0f;
	}

	public Rectangulo(float base) // aunque no lo pone el enunciado, si no ponemos altura
									// en el constructor, supondremos que altura = base
	{
		this.base = base;
		altura = base;
		x = 0f;
		y = 0f;
	}

	public Rectangulo(float base, float altura)
	{
		this.base = base;
		this.altura = altura;
		x = 0f;
		y = 0f;
	}

	public Rectangulo(float base, float altura, float x, float y) /* se le llama 'sobrecargado' porque
	hay distintas maneras de invocarlo
	*/
	{
		this.base = base;
		this.altura = altura;
		this.x = x;
		this.y = y;
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

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getArea()
	{
		return base * altura;
	}

	public float getPerimetro()
	{
		return (base + altura) * 2; /*en vez de crear una variable llamada
		perimetro, ponerlo directamente en el return*/
	}

	public void agranda(float aumentaBase, float aumentaAltura)
	{
		base += aumentaBase;
		altura += aumentaAltura;
	}

	public void agranda(float valor)
	{
		base += valor;
		altura += valor;
	}

	public void agranda()
	{
		base++;
		altura++;
	}
}
