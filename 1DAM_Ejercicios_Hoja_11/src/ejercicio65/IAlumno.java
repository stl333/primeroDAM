package ejercicio65;

public interface IAlumno {

	/** * @return Devuelve el nombre del alumno */
	public String getNombre();


	/** Añade una nota al alumno
	* @param nota
	* @return true si se puede añadir una nota más, false en caso contrario, ya sea
	* porque
	* no caben más notas o porque la nota no es válida (nota >=0 y <=10). */
	public boolean anadeNota(int nota);


	/** @return array con las notas existentes del alumno */
	public int[] getNotas();


	/** @return número de notas que tiene el alumno */
	public int numNotas();


	/** @return nota media de las notas que tiene. Si no hay notas devuelve -1.*/
	public float getNotaMedia();


	/** @return número de notas >= 5 */
	public int getNumeroAprobados();


	/** Elimina las notas del alumno */
	public void borrarNotas();
}
