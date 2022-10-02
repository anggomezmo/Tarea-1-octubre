package Cap4_Ejercicio7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JSeparator;

public class Formulario7 extends JFrame {

	private JPanel contentPane;
	private JTextField textA;
	private JTextField textB;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario7 frame = new Formulario7();
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
	public Formulario7() {
		this.setTitle("Ejercicio 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese valor de A");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(40, 96, 170, 14);
		contentPane.add(lblNewLabel_1);
		
		textA = new JTextField();
		textA.setBounds(201, 95, 86, 20);
		contentPane.add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setText("");
		textB.setBounds(201, 128, 86, 20);
		contentPane.add(textB);
		textB.setColumns(10);
		
		JButton btnComparar = new JButton("Comparar");
		
		btnComparar.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
			
				
				try {
					
					//Calculo del numero mayor
					double A; 
					double B;
					A = Double.parseDouble(textA.getText());
					B = Double.parseDouble(textB.getText());
					
					if (metodos7.Calcular_mayor_numero(A,B) == A) {
						textResultado.setText("A es mayor que B");
					}
					else if (metodos7.Calcular_mayor_numero(A,B) == B) {
						textResultado.setText("B es mayor que A");
							
						}
					else {
						textResultado.setText("A es igual a B");;
					}
					}
					catch(NumberFormatException ex) {
						//EXCEPCION VALORES NO NÚMERICOS
						JOptionPane.showMessageDialog(null, "Los parámetros ingresados no son numéricos");
						
					}
			
				}
		
		
			});
		btnComparar.setBounds(229, 190, 89, 23);
		contentPane.add(btnComparar);
		
		textResultado = new JTextField();
		textResultado.setBounds(29, 217, 170, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CONFIGURA EL BOTON BORRAR
				textResultado.setText("");
				textA.setText("");
				textB.setText("");
			}
		});
		btnBorrar.setBounds(229, 224, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblNewLabel_10 = new JLabel("RESULTADO");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(63, 192, 156, 14);
		contentPane.add(lblNewLabel_10);
		
		JEditorPane dtrpnEsteProgramaLe = new JEditorPane();
		dtrpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		dtrpnEsteProgramaLe.setForeground(new Color(0, 0, 0));
		dtrpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 14));
		dtrpnEsteProgramaLe.setText("Este programa le permitirá saber cual de dos numeros\r\n es el mayor.");
		dtrpnEsteProgramaLe.setBounds(27, 11, 364, 42);
		contentPane.add(dtrpnEsteProgramaLe);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese valor de B\r\n");
		lblNewLabel_1_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(40, 129, 170, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(51, 102, 51));
		separator.setBounds(10, 62, 441, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(51, 102, 51));
		separator_1.setBounds(10, 267, 441, 14);
		contentPane.add(separator_1);
	}
}	
