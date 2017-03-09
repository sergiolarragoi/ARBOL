import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DATOS extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public DATOS(javax.swing.JFrame parent, boolean modal) {
		
		super(parent,modal);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(262, 64, 121, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(262, 109, 162, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(262, 153, 121, 20);
		contentPanel.add(textField_2);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(59, 67, 96, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblZona = new JLabel("ZONA:");
		lblZona.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblZona.setBounds(59, 112, 96, 14);
		contentPanel.add(lblZona);
		
		JLabel lblAlturaMedia = new JLabel("ALTURA MEDIA:");
		lblAlturaMedia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlturaMedia.setBounds(59, 156, 132, 14);
		contentPanel.add(lblAlturaMedia);
		
		JButton btnInsertarArbol = new JButton("INSERTAR ARBOL");
		btnInsertarArbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accion();
			}
		});
		btnInsertarArbol.setBounds(165, 207, 147, 23);
		contentPanel.add(btnInsertarArbol);
		
		JLabel lblIntroduccionDeDatos = new JLabel("INTRODUCCION DE DATOS");
		lblIntroduccionDeDatos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIntroduccionDeDatos.setBounds(106, 23, 235, 14);
		contentPanel.add(lblIntroduccionDeDatos);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(null);
			{
				JButton okButton = new JButton("OK");
				okButton.setBounds(312, 5, 47, 23);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBounds(364, 5, 65, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void accion() {
		// TODO Apéndice de método generado automáticamente
		ARBOL arbol=new ARBOL(nombre.getText(),zona.getText(),Double.parseDouble(altura.getText()));
		
		
		((PRINCIPAL)this.getParent()).aniadir(arbol);
		this.dispose();
	}
}
