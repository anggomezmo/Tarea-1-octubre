package Cap_Ejercicio22;

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
import java.awt.Font;
import java.awt.Color;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;

public class Formulario22 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textSalario;
	private JTextField textHoras;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario22 frame = new Formulario22();
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
	public Formulario22() {
		this.setTitle("Ejercicio 22");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 332);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese nombre");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 114, 170, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSalarioPorHora = new JLabel("Ingrese salario por hora");
		lblSalarioPorHora.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblSalarioPorHora.setBounds(41, 139, 207, 14);
		contentPane.add(lblSalarioPorHora);
		
		JLabel lblCantidadHorasTrabajadas = new JLabel("Ingrese cantidad horas trabajadas al mes");
		lblCantidadHorasTrabajadas.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblCantidadHorasTrabajadas.setBounds(40, 164, 330, 14);
		contentPane.add(lblCantidadHorasTrabajadas);
		
		textNombre = new JTextField();
		textNombre.setBounds(390, 101, 162, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textSalario = new JTextField();
		textSalario.setColumns(10);
		textSalario.setBounds(390, 132, 162, 20);
		contentPane.add(textSalario);
		
		textHoras = new JTextField();
		textHoras.setColumns(10);
		textHoras.setBounds(390, 163, 162, 20);
		contentPane.add(textHoras);
		
		textField = new JTextField();
		textField.setBounds(29, 223, 365, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				//CALCULO DEL SALARIO
				try {
					double salario;
					String nombre;
					double horas;

					nombre = textNombre.getText();
					salario = Double.parseDouble(textSalario.getText());
					horas = Double.parseDouble(textHoras.getText());
					
					if (Metodos22.Calcular_salario(salario,horas)== 100) {
						textField.setText(nombre);
					}
					else {
						textField.setText(nombre+" su salario es "+Metodos22.Calcular_salario(salario,horas));;
					}
					}
					catch(NumberFormatException ex) {
						//EXCEPCION VALORES NO NÚMERICOS
						JOptionPane.showMessageDialog(null, "Los parámetros ingresados no son numéricos");
						
					}
			
				}
		
		
			});
		btnCalcular.setBounds(69, 189, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CONFIGURA EL BOTON BORRAR
				textField.setText("");
				textSalario.setText("");
				textNombre.setText("");
				textHoras.setText("");
			}
		});
		btnBorrar.setBounds(196, 189, 89, 23);
		contentPane.add(btnBorrar);
		
		JEditorPane dtrpnEsteProgramaLe = new JEditorPane();
		dtrpnEsteProgramaLe.setText("Este programa le permitirá calcular el salario de un empleado siempre y cuando sea mayor a 450.000");
		dtrpnEsteProgramaLe.setForeground(Color.BLACK);
		dtrpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 14));
		dtrpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		dtrpnEsteProgramaLe.setBounds(19, 11, 533, 42);
		contentPane.add(dtrpnEsteProgramaLe);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(51, 102, 51));
		separator.setBounds(848, 64, -818, -21);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(51, 102, 51));
		separator_1.setBounds(29, 63, 533, 14);
		contentPane.add(separator_1);
	}
}
