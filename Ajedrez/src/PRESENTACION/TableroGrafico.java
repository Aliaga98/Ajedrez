package PRESENTACION;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

import NEGOCIO.Ajedrez;
import NEGOCIO.Tablero;

public class TableroGrafico extends JPanel 
{

	public Image imgTablero;
	public Tablero tb;
	
	public TableroGrafico(Tablero tablero) 
	{
		this.tb= tablero;
	}
	
	@Override
	public void paint(Graphics g) 
	{
		super.paint(g);
		Graphics2D g2= (Graphics2D)g;
		
		//PINTA EL TABLERO
		imgTablero= Toolkit.getDefaultToolkit().getImage("Tablero.jpeg");
		g2.drawImage(imgTablero, 0, 0, 600, 600, this);
		
	
		//PINTA LA FICHAS
		int py=9;
		for (int f = 0; f < tb.MZ.filas; f++) 
		{
			int px=9;
			for (int c = 0; c < tb.MZ.columnas; c++) 
			{
				if(tb.MZ.obtenerEle(f, c)!=Ajedrez.CASILLA_BLANCO && tb.MZ.obtenerEle(f, c)!=Ajedrez.CASILLA_NEGRO)
				{
					int nro=tb.MZ.obtenerEle(f, c);
					Image img= Toolkit.getDefaultToolkit().getImage(nro+".png");
					g2.drawImage(img, px, py, 50, 50, this);
				}
				
				px= px + 75;
			}
			py= py + 75;
		}

	}

}
