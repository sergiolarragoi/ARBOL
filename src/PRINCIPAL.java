import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PRINCIPAL extends JFrame {

	private JPanel contentPane;
	private Choice lista;
	private JButton insertar;
	private JButton borrar;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL frame = new PRINCIPAL();
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
	public PRINCIPAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		setJMenuBar(menuBar);
		
		JMenu mnGestion = new JMenu("GESTION");
		menuBar.add(mnGestion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDeArboles = new JLabel("LISTA DE ARBOLES");
		lblListaDeArboles.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblListaDeArboles.setBounds(125, 38, 171, 14);
		contentPane.add(lblListaDeArboles);
		
		Choice choice = new Choice();
		choice.setBounds(135, 93, 161, 20);
		contentPane.add(choice);
		
		insertar = new JButton("INSERTAR ARBOL");
		insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				accion();
			}
		});
		insertar.setBounds(135, 153, 123, 23);
		contentPane.add(insertar);
		
		borrar = new JButton("BORRAR ARBOL SELECCIONADO");
		borrar.setBounds(135, 187, 191, 23);
		contentPane.add(borrar);
		
	}

	public void accion() {
		// TODO Apéndice de método generado automáticamente
		DATOS hija=new DATOS(this,true);
		hija.setVisible(true);
	}
	public void aniadir(ARBOL arbol){
		lista.addItem(arbol.nombre + " "+arbol.zona+" "+arbol.altura);
	}
}
