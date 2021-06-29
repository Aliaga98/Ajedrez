package PRESENTACION;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import NEGOCIO.Ajedrez;
import NEGOCIO.Tablero;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Point;

public class FormPrincipal extends JFrame {
	public Ajedrez ajedrez;
	public Tablero tablero;
	public int fp;
	public int cp;

	private TableroGrafico tbGrafico;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPrincipal frame = new FormPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormPrincipal() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent me) {
				System.out.println(me.getX()+"-"+me.getY());
				
				int xe=me.getX();
				int ye=me.getY();
				
				System.out.println("PRESIONADO:"+xe+"---"+ye);
				
				int px=180;
				int py=30;
				
				for (int f = 0; f < tablero.MZ.filas; f++) 
				{
					px=180;
					for (int c = 0; c < tablero.MZ.columnas; c++) 
					{
						Rectangle rec= new Rectangle(px, py, 75, 75);
						if(rec.contains(xe, ye))
						{
							fp= f;
							cp= c;
						}
						px+=75;
					}
					py+=75;
				}
				
			}
			@Override
			public void mouseReleased(MouseEvent me) {
				System.out.println(me.getX()+"-"+me.getY());
				
				int xe=me.getX();
				int ye=me.getY();
				
				System.out.println("LEVANTADO:"+xe+"---"+ye);
				
				int px=180;
				int py=30;
				for (int f = 0; f < tablero.MZ.filas; f++) 
				{
					px=180;
					for (int c = 0; c < tablero.MZ.columnas; c++) 
					{
						Rectangle rec= new Rectangle(px, py, 75, 75);
						if(rec.contains(xe, ye))
						{
							if(Ajedrez.movPermitido(fp, cp, f, c, tablero.MZ))
							{
								tablero.MZ.asignarEle(Ajedrez.CASILLA_BLANCO, fp, cp);
								tablero.MZ.asignarEle(Ajedrez.PEON_BLANCO, f, c);
								
								//ajedrez.cambiarTurno();
								tbGrafico.repaint();
							}
							/*if(Reglas.comidaPermitida(fp, cp, f, c, jgDamas.tb.mtz))
							{
								 
							}*/
						}
						px+=75;
					}
					py+=75;
				}
			}
		});
		
		tablero= new Tablero();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1848, 1044);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(60000, 60000));
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tbGrafico = new TableroGrafico(tablero);
		tbGrafico.setBackground(Color.LIGHT_GRAY);
		tbGrafico.setBounds(180, 30, 600, 600);
		contentPane.add(tbGrafico);
		
		tbGrafico.repaint();
		
		this.setExtendedState(MAXIMIZED_BOTH);
	}
}
