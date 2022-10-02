package Cap4_Ejercicio41;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;

public class Formulario_41 extends JFrame {

	private JPanel contentPane;
	private JTextField textNros;
	protected double cosa;
	private JTextField textResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					Formulario_41 frame = new Formulario_41();
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
	public Formulario_41() {
		

        this.setTitle("Ejercicio 41");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 234);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNros = new JTextField();
		textNros.setBounds(21, 90, 342, 20);
		contentPane.add(textNros);
		textNros.setColumns(10);
		
		JButton btnComparar = new JButton("Comparar");
		btnComparar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnComparar.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				
				String numeros;
				
				try {
				numeros=textNros.getText();
				//CALCULO DEL NÚMERO MAYOR.
				
				textResultado.setText("El mayor número de los elementos introducidos es: "+metodos.Calcular_mayor_numero(numeros));
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o utilice un formato valido");
					
				}
				}
				
			
			
		});
		
		btnComparar.setBounds(397, 89, 156, 23);
		contentPane.add(btnComparar);
		
		JTextPane txtpnEsteProgramaLo = new JTextPane();
		txtpnEsteProgramaLo.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		txtpnEsteProgramaLo.setBackground(new Color(204, 204, 204));
		txtpnEsteProgramaLo.setText("Este programa lo ayudara a identificar qué número es mayor a los demás de un conjunto de números.");
		txtpnEsteProgramaLo.setBounds(21, 11, 618, 20);
		contentPane.add(txtpnEsteProgramaLo);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnBorrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				textNros.setText("");
				textResultado.setText("");
				
				
			}
		});
		btnBorrar.setBounds(516, 150, 168, 23);
		contentPane.add(btnBorrar);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 64));
		separator.setBounds(10, 55, 982, -4);
		contentPane.add(separator);
		
		JTextPane txtpnAcontinuacinAgregueLos = new JTextPane();
		txtpnAcontinuacinAgregueLos.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		txtpnAcontinuacinAgregueLos.setBackground(new Color(204, 204, 204));
		txtpnAcontinuacinAgregueLos.setText("A continuación agregue los números separados por comas.  Ejemplo:1,2,3,4.");
		txtpnAcontinuacinAgregueLos.setBounds(21, 58, 466, 20);
		contentPane.add(txtpnAcontinuacinAgregueLos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(46, 139, 87));
		separator_1.setBackground(new Color(0, 100, 0));
		separator_1.setBounds(44, 42, 899, -2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 128, 64));
		separator_2.setBounds(29, 42, 677, 9);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_10 = new JLabel("RESULTADO");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(21, 152, 156, 14);
		contentPane.add(lblNewLabel_10);
		
		textResultado = new JTextField();
		textResultado.setBounds(145, 151, 345, 20);
		contentPane.add(textResultado);
		textResultado.setColumns(10);
	}
}
