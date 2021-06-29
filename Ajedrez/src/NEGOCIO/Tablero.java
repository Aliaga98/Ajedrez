package NEGOCIO;

public class Tablero {

	public Matriz MZ;
	
	public Tablero() 
	{
		MZ= new Matriz(8, 8);
		
		for (int c = 0; c < MZ.columnas; c++) 
		{
			MZ.asignarEle(Ajedrez.PEON_BLANCO, 1, c);
			MZ.asignarEle(Ajedrez.PEON_NEGRO, 6, c);
		}
		
		MZ.asignarEle(Ajedrez.TORRE_BLANCO, 0, 0);
		MZ.asignarEle(Ajedrez.TORRE_BLANCO, 0, 7);
	
		MZ.asignarEle(Ajedrez.TORRE_NEGRO, 7, 0);
		MZ.asignarEle(Ajedrez.TORRE_NEGRO, 7, 7);

		MZ.asignarEle(Ajedrez.CABALLO_BLANCO, 0, 1);
		MZ.asignarEle(Ajedrez.CABALLO_BLANCO, 0, 6);

		MZ.asignarEle(Ajedrez.CABALLO_NEGRO, 7, 1);
		MZ.asignarEle(Ajedrez.CABALLO_NEGRO, 7, 6);

		MZ.asignarEle(Ajedrez.ARFIL_BLANCO, 0, 2);
		MZ.asignarEle(Ajedrez.ARFIL_BLANCO, 0, 5);

		MZ.asignarEle(Ajedrez.ARFIL_NEGRO, 7, 2);
		MZ.asignarEle(Ajedrez.ARFIL_NEGRO, 7, 5);
		
		MZ.asignarEle(Ajedrez.REINA_BLANCO, 0, 3);
		MZ.asignarEle(Ajedrez.REINA_NEGRO, 7, 4);

		MZ.asignarEle(Ajedrez.REY_BLANCO, 0, 4);
		MZ.asignarEle(Ajedrez.REY_NEGRO, 7, 3);
	}

	
}
