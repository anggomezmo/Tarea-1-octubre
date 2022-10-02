package Cap4_Ejercicio40;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.FormatterClosedException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class formulario_40 extends JFrame {
	private JPanel contentPane;
	private JTextField textN3;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textN4;
	private JTextField textN5;
	private JTextField textN6;
	private JTextField textN7;
	private JSeparator separator;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textR1;
	private JTextField textCua1;
	private JTextField textCu1;
	private JTextField textR2;
	private JTextField textCua2;
	private JTextField textCu2;
	private JTextField textR3;
	private JTextField textCua3;
	private JTextField textCu3;
	private JTextField textR4;
	private JTextField textCua4;
	private JTextField textCu4;
	private JTextField textR5;
	private JTextField textCua5;
	private JTextField textCu5;
	private JTextField textR6;
	private JTextField textCua6;
	private JTextField textCu6;
	private JTextField textR7;
	private JTextField textCua7;
	private JTextField textCu7;
	private JTextPane txtpnEscribaLosNmeros;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JSeparator separator_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario_40 frame = new formulario_40();
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
	public formulario_40() {
		this.setTitle("Ejercicio 40 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1044, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Introduzca ");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(925, 65, 83, 14);
		contentPane.add(lblNewLabel_6);
		
		JTextPane txtpnEsteProgramaLe = new JTextPane();
		txtpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		txtpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		txtpnEsteProgramaLe.setText("Este programa le permitirá calcular la raíz cuadrada, la potencia cuadrada y la potencia al cubo de un grupo de 7 números enteros positivos.");
		txtpnEsteProgramaLe.setBounds(96, 11, 828, 20);
		contentPane.add(txtpnEsteProgramaLe);
		
		textN3 = new JTextField();
		textN3.setColumns(10);
		textN3.setBounds(417, 90, 86, 20);
		contentPane.add(textN3);
		
		JLabel lblNewLabel = new JLabel("Introduzca ");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(146, 65, 106, 14);
		contentPane.add(lblNewLabel);
		
		textN1 = new JTextField();
		textN1.setColumns(10);
		textN1.setBounds(146, 90, 86, 20);
		contentPane.add(textN1);
		
		textN2 = new JTextField();
		textN2.setColumns(10);
		textN2.setBounds(276, 90, 86, 20);
		contentPane.add(textN2);
		
		textN4 = new JTextField();
		textN4.setColumns(10);
		textN4.setBounds(547, 90, 86, 20);
		contentPane.add(textN4);
		
		textN5 = new JTextField();
		textN5.setColumns(10);
		textN5.setBounds(679, 90, 86, 20);
		contentPane.add(textN5);
		
		textN6 = new JTextField();
		textN6.setColumns(10);
		textN6.setBounds(800, 90, 86, 20);
		contentPane.add(textN6);
		
		textN7 = new JTextField();
		textN7.setColumns(10);
		textN7.setBounds(922, 90, 86, 20);
		contentPane.add(textN7);
		
		separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 64));
		separator.setBounds(10, 133, 1010, 2);
		contentPane.add(separator);
		
		lblNewLabel_7 = new JLabel("Raíz cuadrada");
		lblNewLabel_7.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(10, 183, 126, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Potencia cuadrada");
		lblNewLabel_8.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(10, 247, 146, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Potencia cúbica");
		lblNewLabel_9.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(10, 310, 106, 14);
		contentPane.add(lblNewLabel_9);
		
		textR1 = new JTextField();
		textR1.setColumns(10);
		textR1.setBounds(146, 181, 86, 20);
		contentPane.add(textR1);
		
		textCua1 = new JTextField();
		textCua1.setColumns(10);
		textCua1.setBounds(146, 245, 86, 20);
		contentPane.add(textCua1);
		
		textCu1 = new JTextField();
		textCu1.setColumns(10);
		textCu1.setBounds(146, 308, 86, 20);
		contentPane.add(textCu1);
		
		textR2 = new JTextField();
		textR2.setColumns(10);
		textR2.setBounds(276, 180, 86, 20);
		contentPane.add(textR2);
		
		textCua2 = new JTextField();
		textCua2.setColumns(10);
		textCua2.setBounds(276, 244, 86, 20);
		contentPane.add(textCua2);
		
		textCu2 = new JTextField();
		textCu2.setColumns(10);
		textCu2.setBounds(276, 307, 86, 20);
		contentPane.add(textCu2);
		
		textR3 = new JTextField();
		textR3.setColumns(10);
		textR3.setBounds(417, 180, 86, 20);
		contentPane.add(textR3);
		
		textCua3 = new JTextField();
		textCua3.setColumns(10);
		textCua3.setBounds(417, 244, 86, 20);
		contentPane.add(textCua3);
		
		textCu3 = new JTextField();
		textCu3.setColumns(10);
		textCu3.setBounds(417, 307, 86, 20);
		contentPane.add(textCu3);
		
		textR4 = new JTextField();
		textR4.setColumns(10);
		textR4.setBounds(547, 180, 86, 20);
		contentPane.add(textR4);
		
		textCua4 = new JTextField();
		textCua4.setColumns(10);
		textCua4.setBounds(547, 244, 86, 20);
		contentPane.add(textCua4);
		
		textCu4 = new JTextField();
		textCu4.setColumns(10);
		textCu4.setBounds(547, 307, 86, 20);
		contentPane.add(textCu4);
		
		textR5 = new JTextField();
		textR5.setColumns(10);
		textR5.setBounds(679, 180, 86, 20);
		contentPane.add(textR5);
		
		textCua5 = new JTextField();
		textCua5.setColumns(10);
		textCua5.setBounds(679, 244, 86, 20);
		contentPane.add(textCua5);
		
		textCu5 = new JTextField();
		textCu5.setColumns(10);
		textCu5.setBounds(679, 307, 86, 20);
		contentPane.add(textCu5);
		
		textR6 = new JTextField();
		textR6.setColumns(10);
		textR6.setBounds(800, 180, 86, 20);
		contentPane.add(textR6);
		
		textCua6 = new JTextField();
		textCua6.setColumns(10);
		textCua6.setBounds(800, 244, 86, 20);
		contentPane.add(textCua6);
		
		textCu6 = new JTextField();
		textCu6.setColumns(10);
		textCu6.setBounds(800, 307, 86, 20);
		contentPane.add(textCu6);
		
		textR7 = new JTextField();
		textR7.setColumns(10);
		textR7.setBounds(922, 180, 86, 20);
		contentPane.add(textR7);
		
		textCua7 = new JTextField();
		textCua7.setColumns(10);
		textCua7.setBounds(922, 244, 86, 20);
		contentPane.add(textCua7);
		
		textCu7 = new JTextField();
		textCu7.setColumns(10);
		textCu7.setBounds(922, 307, 86, 20);
		contentPane.add(textCu7);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CALCULO DE RAICES, CUADRADOS Y CUBOS.
				try {
				
				double numero;
				
				if(textN1.getText()!="") {
					
					numero=Double.parseDouble(textN1.getText());
					textR1.setText(String.valueOf(Métodos.Calcular_raices(numero)));
					textCua1.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
					textCu1.setText(String.valueOf(Métodos.Calcular_cubo(numero)));	
				}
				
				
			
				
				if(textN2.getText()!="") {
					numero=Double.parseDouble(textN2.getText());	
				textR2.setText(String.valueOf(Métodos.Calcular_raices(numero)));
				textCua2.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
				textCu2.setText(String.valueOf(Métodos.Calcular_cubo(numero)));
				}
	
				if(textN3.getText()!="") {
				numero=Double.parseDouble(textN3.getText());
				textR3.setText(String.valueOf(Métodos.Calcular_raices(numero)));
				textCua3.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
				textCu3.setText(String.valueOf(Métodos.Calcular_cubo(numero)));
				}
				
				if(textN4.getText()!="") {
					numero=Double.parseDouble(textN4.getText());
				textR4.setText(String.valueOf(Métodos.Calcular_raices(numero)));
				textCua4.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
				textCu4.setText(String.valueOf(Métodos.Calcular_cubo(numero)));
				}
			
				if(textN5.getText()!="") {
					numero=Double.parseDouble(textN5.getText());
				textR5.setText(String.valueOf(Métodos.Calcular_raices(numero)));
				textCua5.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
				textCu5.setText(String.valueOf(Métodos.Calcular_cubo(numero)));
				}
				
				if(textN6.getText()!="") {
					numero=Double.parseDouble(textN6.getText());
				textR6.setText(String.valueOf(Métodos.Calcular_raices(numero)));
				textCua6.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
				textCu6.setText(String.valueOf(Métodos.Calcular_cubo(numero)));
				}
			
				if(textN7.getText()!="") {
					numero=Double.parseDouble(textN7.getText());
				textR7.setText(String.valueOf(Métodos.Calcular_raices(numero)));
				textCua7.setText(String.valueOf(Métodos.Calcular_cuadrado(numero)));
				textCu7.setText(String.valueOf(Métodos.Calcular_cubo(numero)));
				}
			}catch(NumberFormatException ex) {
				//EXCEPCION VALORES NO NÚMERICOS
				JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
				
			}
			}
		});
		btnNewButton.setBounds(368, 376, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CONFIGURA EL BOTON BORRAR
				textR1.setText("");
				textCua1.setText("");
				textCu1.setText("");
				
				textR2.setText("");
				textCua2.setText("");
				textCu2.setText("");
				
				textR3.setText("");
				textCua3.setText("");
				textCu3.setText("");
				
				textR4.setText("");
				textCua4.setText("");
				textCu4.setText("");
				
				textR5.setText("");
				textCua5.setText("");
				textCu5.setText("");
				
				textR6.setText("");
				textCua6.setText("");
				textCu6.setText("");
				
				textR7.setText("");
				textCua7.setText("");
				textCu7.setText("");
				
				textN1.setText("");
				textN2.setText("");
				textN3.setText("");
				textN4.setText("");
				textN5.setText("");
				textN6.setText("");
				textN7.setText("");
			}
		});
		btnBorrar.setBounds(521, 376, 89, 23);
		contentPane.add(btnBorrar);
		
		txtpnEscribaLosNmeros = new JTextPane();
		txtpnEscribaLosNmeros.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		txtpnEscribaLosNmeros.setBackground(new Color(204, 204, 204));
		txtpnEscribaLosNmeros.setText("Escriba los números con los que desee trabajar y pulse en \"Calcular\".");
		txtpnEscribaLosNmeros.setBounds(96, 26, 828, 20);
		contentPane.add(txtpnEscribaLosNmeros);
		
		lblNewLabel_10 = new JLabel("RESULTADOS");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(454, 143, 156, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Número 1");
		lblNewLabel_11.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_11.setBounds(149, 76, 83, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Número 2");
		lblNewLabel_12.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_12.setBounds(276, 76, 93, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Número 3");
		lblNewLabel_13.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_13.setBounds(417, 76, 83, 14);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Número 4");
		lblNewLabel_14.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_14.setBounds(547, 76, 93, 14);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Número 5");
		lblNewLabel_15.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_15.setBounds(679, 76, 78, 14);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Número 6");
		lblNewLabel_16.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_16.setBounds(800, 76, 88, 14);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Número 7");
		lblNewLabel_17.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_17.setBounds(925, 76, 77, 14);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_1 = new JLabel("Introduzca ");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(276, 65, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Introduzca ");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(417, 65, 104, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Introduzca ");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(547, 65, 83, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Introduzca ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(679, 65, 83, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Introduzca ");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(800, 65, 83, 14);
		contentPane.add(lblNewLabel_5);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 128, 64));
		separator_1.setBounds(10, 426, 1010, 2);
		contentPane.add(separator_1);
		
	
	}
}
