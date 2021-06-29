package PRESENTACION;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import NEGOCIO.Tablero;

import java.awt.SystemColor;
import java.awt.Color;

public class FormPrincipal extends JFrame {

	private JPanel contentPane;
	
	public Tablero tablero;

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
		
		tablero= new Tablero();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TableroGrafico tbGrafico = new TableroGrafico(tablero);
		tbGrafico.setBackground(Color.YELLOW);
		tbGrafico.setBounds(50, 11, 600, 600);
		contentPane.add(tbGrafico);
		
		tbGrafico.repaint();
		
		this.setExtendedState(MAXIMIZED_BOTH);
	}
}
