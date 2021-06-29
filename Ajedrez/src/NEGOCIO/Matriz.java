package NEGOCIO;

public class Matriz {

	public int filas;
	public int columnas;
	public int M[][];
	
	public Matriz(int filas, int columnas) 
	{
		this.M= new int[filas][columnas];
		this.filas= filas;
		this.columnas= columnas;
	}
	
	public void asignarEle(int ele, int f, int c)
	{
		M[f][c]= ele;
	}
	
	public int obtenerEle(int f, int c)
	{
		return M[f][c];
	}
}
