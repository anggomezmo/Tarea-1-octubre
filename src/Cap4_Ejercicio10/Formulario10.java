package Cap4_Ejercicio10;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.Font;

public class Formulario10 extends JFrame {

	private JPanel contentPane;
	private JTextField textResultado;
	private JTextField textNumero;
	private JTextField textNombre;
	private JTextField textPlata;
	private JTextField textEst;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario10 frame = new Formulario10();
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
	public Formulario10() {
		this.setTitle("Ejercicio 10");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 326);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número de matrícula");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(48, 85, 207, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(48, 110, 162, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Patrimonio en pesos");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(48, 129, 195, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Estrato");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(48, 160, 177, 14);
		contentPane.add(lblNewLabel_3);
		
		textResultado = new JTextField();
		textResultado.setFont(new Font("Verdana", Font.PLAIN, 14));
		textResultado.setBounds(48, 203, 485, 39);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				try {
					//Calculo de Matricula
					double numero;
					String nombre;
					double plata;
					double estrato;

					nombre = textNombre.getText();
					numero = Double.parseDouble(textNumero.getText());
					int Hola = (int)numero;
					estrato = Double.parseDouble(textEst.getText());
					int Hola2 = (int)estrato;
					plata = Double.parseDouble(textPlata.getText());
					textResultado.setText("el estudiante "+nombre+", con matricula "+Hola+", debe pagar "+metodos10.Calcular_matricula(plata,estrato));
				}
				
					
					
					catch(NumberFormatException ex) {
						//EXCEPCION VALORES NO NÚMERICOS
						JOptionPane.showMessageDialog(null, "Los parámetros ingresados no son numéricos");
						
					}
			
				}
		
		
			});
		btnNewButton.setBounds(48, 253, 89, 23);
		contentPane.add(btnNewButton);
		
		textNumero = new JTextField();
		textNumero.setBounds(281, 79, 145, 20);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(281, 104, 145, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textPlata = new JTextField();
		textPlata.setBounds(281, 129, 145, 20);
		contentPane.add(textPlata);
		textPlata.setColumns(10);
		
		textEst = new JTextField();
		textEst.setBounds(281, 154, 145, 20);
		contentPane.add(textEst);
		textEst.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CONFIGURA EL BOTON BORRAR
				textEst.setText("");
				textPlata.setText("");
				textNombre.setText("");
				textNumero.setText("");
				textResultado.setText("");
			}
		});
		btnBorrar.setBounds(147, 253, 89, 23);
		contentPane.add(btnBorrar);
		
		JTextPane txtpnEsteProgramaLe = new JTextPane();
		txtpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 16));
		txtpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		txtpnEsteProgramaLe.setText("Este programa le permitirá conocer el valor de su mátricula.");
		txtpnEsteProgramaLe.setBounds(22, 11, 537, 39);
		contentPane.add(txtpnEsteProgramaLe);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(51, 102, 51));
		separator.setBounds(22, 54, 738, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(51, 102, 51));
		separator_1.setBounds(22, 185, 738, 14);
		contentPane.add(separator_1);
	}
}