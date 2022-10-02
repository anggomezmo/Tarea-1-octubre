package Cap3_Ejercicio19;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;

public class Formulario_19 extends JFrame {

	private JPanel contentPane;
	private JTextField txtLado;
	private JTextField txtPerimetro;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_19 frame = new Formulario_19();
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
	public Formulario_19() {
		this.setTitle("Ejercicio 19");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 352);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor del lado");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(37, 102, 138, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Perimetro");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(37, 140, 104, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(37, 174, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Area");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(37, 212, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtLado = new JTextField();
		txtLado.setBounds(220, 100, 168, 20);
		contentPane.add(txtLado);
		txtLado.setColumns(10);
		
		txtPerimetro = new JTextField();
		txtPerimetro.setColumns(10);
		txtPerimetro.setBounds(220, 137, 168, 20);
		contentPane.add(txtPerimetro);
		
		JTextField txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(220, 172, 168, 20);
		contentPane.add(txtAltura);
		
		txtArea = new JTextField();
		txtArea.setColumns(10);
		txtArea.setBounds(220, 209, 168, 20);
		contentPane.add(txtArea);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Programacion del codigo de boton Calcular
				
				double lado;
				
				try {
					//Calculo de las propiedades del triangulo.
				lado = Double.parseDouble(txtLado.getText());
				txtPerimetro.setText(String.valueOf(Métodos.calcular_perimetro(lado)));
				txtAltura.setText(String.valueOf(Métodos.calcular_altura(lado)));
				txtArea.setText(String.valueOf(Métodos.calcular_area(lado)));
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene el campo 'Valor del lado' o utilice un formato valido");
					
				}
				}
				
				
		});
		btnCalcular.setBounds(37, 262, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Codigo del boton Borrar, el cual limpia campos.
				txtPerimetro.setText("");
				txtAltura.setText("");
				txtArea.setText("");
				txtLado.setText("");
				
				
			}
		});
		btnBorrar.setBounds(178, 262, 89, 23);
		contentPane.add(btnBorrar);
		
		JEditorPane dtrpnEsteProgramaLe = new JEditorPane();
		dtrpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		dtrpnEsteProgramaLe.setText("Este programa le permitirá calcular el perimetro, la altura, y el area\r\nde un triángulo equilatero .\r\nIngrese el valor de un lado del triángulo y pulse  ''Calcular''");
		dtrpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 11));
		dtrpnEsteProgramaLe.setBounds(37, 11, 402, 48);
		contentPane.add(dtrpnEsteProgramaLe);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 64));
		separator.setBounds(10, 70, 459, 21);
		contentPane.add(separator);
	}

}
