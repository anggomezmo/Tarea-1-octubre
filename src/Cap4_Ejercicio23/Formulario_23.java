package Cap4_Ejercicio23;

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
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.Color;

public class Formulario_23 extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_23 frame = new Formulario_23();
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
	public Formulario_23() {
		this.setTitle("Ejercicio 23");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 285);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese valor de A");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel.setBounds(10, 82, 124, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngreseValorDe = new JLabel("Ingrese valor de B");
		lblIngreseValorDe.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblIngreseValorDe.setBounds(271, 82, 124, 14);
		contentPane.add(lblIngreseValorDe);
		
		JLabel lblIngreseValorDe_1 = new JLabel("Ingrese valor de C");
		lblIngreseValorDe_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblIngreseValorDe_1.setBounds(537, 82, 124, 14);
		contentPane.add(lblIngreseValorDe_1);
		
		txtA = new JTextField();
		txtA.setBounds(30, 99, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(286, 99, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(557, 99, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double A, B, C,Respuesta1,Respuesta2;
				 try {
					 
					 //CALCULO DE ECUACION CUADRATICA.
				 A=Double.parseDouble(txtA.getText());
				 B=Double.parseDouble(txtB.getText());
				 C=Double.parseDouble(txtC.getText());
				 double determinante=  Math.pow(B, 2) - (4 * A * C);
				 System.out.println(determinante);
				 
				 
				 if(determinante<0) {
					txtResultado.setText("Las soluciones para la ecuación cuadratica son soluciones complejas"); 
					
				 }
				 else if(determinante==0) {
					 txtResultado.setText(String.valueOf("X= "+Métodos.Calcular_Cuadratica_determinante_cero(A,B, determinante)));
					 
					 
				 }
				 else {
					 Respuesta1=Métodos.Calcular_Cuadratica_Positiva(A,B, determinante);
					 Respuesta2=Métodos.Calcular_Cuadratica_Negativa(A,B, determinante);
					 txtResultado.setText("X1= "+String.valueOf(Respuesta1)+"    X2= "+String.valueOf(Respuesta2));
				 }
				 }catch(NumberFormatException ex) {
						//EXCEPCION VALORES NO NÚMERICOS
						JOptionPane.showMessageDialog(null, "Rellene todos los campos o utilice un formato valido");
						
					}
				
			}
		});
		btnCalcular.setBounds(248, 147, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtC.setText("");
				txtResultado.setText("");
				
			}
		});
		btnBorrar.setBounds(357, 147, 89, 23);
		contentPane.add(btnBorrar);
		
		JLabel lblNewLabel_10 = new JLabel("RESULTADO");
		lblNewLabel_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(30, 186, 156, 14);
		contentPane.add(lblNewLabel_10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(167, 185, 407, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JEditorPane dtrpnEsteProgramaLe = new JEditorPane();
		dtrpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		dtrpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		dtrpnEsteProgramaLe.setText("Este programa le permitirá hallar las posibles soluciones de una ecuación de segundo grado (de la forma ax^2+bx+c).");
		dtrpnEsteProgramaLe.setBounds(10, 11, 664, 20);
		contentPane.add(dtrpnEsteProgramaLe);
		
		JEditorPane dtrpnParaElloIngrese = new JEditorPane();
		dtrpnParaElloIngrese.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 12));
		dtrpnParaElloIngrese.setBackground(new Color(204, 204, 204));
		dtrpnParaElloIngrese.setText("Para ello ingrese los valores A,B,C y pulse en \"Calcular\".");
		dtrpnParaElloIngrese.setBounds(10, 29, 479, 20);
		contentPane.add(dtrpnParaElloIngrese);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 128, 0));
		separator.setBounds(10, 222, 664, 13);
		contentPane.add(separator);
	}
}
