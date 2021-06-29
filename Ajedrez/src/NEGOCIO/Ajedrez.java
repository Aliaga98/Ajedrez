package NEGOCIO;

public class Ajedrez {

	public static int COLOR_BLANCO=1;
	public static int COLOR_NEGRO=2;
	
	public static int CASILLA_BLANCO=0;
	public static int CASILLA_NEGRO=1;
	public static int PEON_BLANCO=2;
	public static int PEON_NEGRO=3;
	public static int TORRE_BLANCO=4;
	public static int TORRE_NEGRO=5;
	public static int CABALLO_BLANCO=6;
	public static int CABALLO_NEGRO=7;
	public static int ARFIL_BLANCO=8;
	public static int ARFIL_NEGRO=9;
	public static int REINA_BLANCO=10;
	public static int REINA_NEGRO=11;
	public static int REY_BLANCO=12;
	public static int REY_NEGRO=13;
	
	
	public Tablero TB;
	public Jugador JG1;
	public Jugador JG2;

	public Ajedrez(String alias1, String alias2) 
	{
		TB= new Tablero();
		JG1= new Jugador(COLOR_BLANCO, alias1);
		JG2= new Jugador(COLOR_NEGRO, alias2);
	}
	
	public static boolean movPermitido(int fp, int cp, int f, int c, Matriz mZ)
	{
		return true;
	}
	
	public static boolean esComidaPeon()
	{
		return true;
	}

	public void cambiarTurno() {
		
		
	}

}
