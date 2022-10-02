package Cap3_Ejercicio18;

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
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;

public class Formulario_18 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textHoras;
	private JTextField textValor;
	private JTextField textRetencion;
	private JTextField textSalariob;
	private JTextField textSalarion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_18 frame = new Formulario_18();
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
	public Formulario_18() {
		this.setTitle("Ejercicio 18");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Código");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(30, 102, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(30, 144, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas trabajadas");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(30, 181, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Valor hora trabajada");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(30, 217, 137, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Porcentaje de retención");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(30, 252, 205, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Salario bruto");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(30, 287, 156, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Salario neto");
		lblNewLabel_6.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(30, 325, 89, 14);
		contentPane.add(lblNewLabel_6);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(218, 100, 163, 20);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(218, 142, 163, 20);
		contentPane.add(textNombre);
		
		textHoras = new JTextField();
		textHoras.setColumns(10);
		textHoras.setBounds(218, 179, 163, 20);
		contentPane.add(textHoras);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(218, 215, 163, 20);
		contentPane.add(textValor);
		
		textRetencion = new JTextField();
		textRetencion.setColumns(10);
		textRetencion.setBounds(218, 250, 163, 20);
		contentPane.add(textRetencion);
		
		textSalariob = new JTextField();
		textSalariob.setColumns(10);
		textSalariob.setBounds(218, 284, 163, 20);
		contentPane.add(textSalariob);
		
		textSalarion = new JTextField();
		textSalarion.setColumns(10);
		textSalarion.setBounds(218, 322, 163, 20);
		contentPane.add(textSalarion);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CALCULA EL SALARIO BRUTO,NETO, Y DINERO RETENIDO
				try {
				double horas,valorhora, porcentaje_retencion,dinero_retenido;
				horas=Double.parseDouble(textHoras.getText());
				valorhora=Double.parseDouble(textValor.getText());
				porcentaje_retencion=Double.parseDouble(textRetencion.getText());
				
				
				textSalariob.setText(String.valueOf(Métodos.metodo_salario_bruto(horas, valorhora)));
				dinero_retenido=Métodos.metodo_retencion_fuente(horas, valorhora,porcentaje_retencion);
				
				textSalarion.setText(String.valueOf(Métodos.metodo_salario_neto(dinero_retenido,horas, valorhora)));
				}
				catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o utilice un formato valido");
					
				}
				
			}
		});
		btnCalcular.setBounds(30, 392, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Limpia todos los campos Jfield
				
				textSalariob.setText("");
				textSalarion.setText("");
				textCodigo.setText("");
				textNombre.setText("");
				textHoras.setText("");
				textRetencion.setText("");
				textValor.setText("");
			}
		});
		btnBorrar.setBounds(146, 392, 89, 23);
		contentPane.add(btnBorrar);
		
		JEditorPane dtrpnEsteProgramaLe = new JEditorPane();
		dtrpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		dtrpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 11));
		dtrpnEsteProgramaLe.setText("Este programa le permitirá calcular el salario bruto y el salario neto de un \r\ntrabajador teniendo en cuenta la retención en la fuente.\r\nIngrese los datos del trabajador y pulse en \"Calcular\".");
		dtrpnEsteProgramaLe.setBounds(12, 11, 402, 59);
		contentPane.add(dtrpnEsteProgramaLe);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 64));
		separator.setBounds(12, 365, 380, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 128, 64));
		separator_1.setBounds(12, 68, 380, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 128, 64));
		separator_2.setBounds(12, 81, 380, 10);
		contentPane.add(separator_2);
	}
}