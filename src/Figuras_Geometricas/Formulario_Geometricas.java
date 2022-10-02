package Figuras_Geometricas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_Geometricas extends JFrame {

	private JPanel contentPane;
	private JTextField textRcirculo;
	private JTextField textAcirculo;
	private JTextField textPcirculo;
	private JTextField textBrectangulo;
	private JTextField textHrectangulo;
	private JTextField textArectangulo;
	private JTextField textPrectangulo;
	private JTextField textLcuadrado;
	private JTextField textAcuadrado;
	private JTextField textPcuadrado;
	private JTextField textHtriangulo;
	private JTextField textBtriangulo;
	private JTextField textHiptriangulo;
	private JTextField textPtriangulo;
	private JTextField textAtriangulo;
	private JTextField textDMenor_rombo;
	private JTextField textDMayor_rombo;
	private JTextField textArombo;
	private JTextField textPrombo;
	private JTextField textBMayor_trapecio;
	private JTextField textBMenor_trapecio;
	private JTextField textHtrapecio;
	private JTextField textAtrapecio;
	private JTextField textPtrapecio;
	private JTextField textTipotriangulo;
	private JTextField textLrombo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario_Geometricas frame = new Formulario_Geometricas();
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
	public Formulario_Geometricas() {
		this.setTitle("Figuras geométricas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1274, 957);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 61, 1238, 11);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 185, 1238, 11);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 315, 1238, 11);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 452, 1238, 11);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 595, 1238, 11);
		contentPane.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 759, 1238, 11);
		contentPane.add(separator_5);
		
		JLabel lblNewLabel = new JLabel("Circulo\r\n");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 117, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Rectángulo\r\n");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(21, 251, 211, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cuadrado");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(22, 355, 132, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Triángulo rectángulo");
		lblNewLabel_2_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(10, 514, 226, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Rombo");
		lblNewLabel_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(20, 664, 111, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Trapecio");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 828, 182, 14);
		contentPane.add(lblNewLabel_3);
		
		JEditorPane dtrpnEsteProgramaLe = new JEditorPane();
		dtrpnEsteProgramaLe.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 14));
		dtrpnEsteProgramaLe.setBackground(new Color(204, 204, 204));
		dtrpnEsteProgramaLe.setText("Este programa le permitirá calcular el área y el perimetro de distintas figuras geométricas.\r\nAdicionalmente para el triángulo rectangulo podras calcular su hipotenusa e  identificar su tipo de triángulo.");
		dtrpnEsteProgramaLe.setBounds(60, 11, 1034, 39);
		contentPane.add(dtrpnEsteProgramaLe);
		
		JLabel lblNewLabel_4 = new JLabel("Ingrese el radio del circulo en centimetros\r\n\r\n");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(165, 94, 323, 14);
		contentPane.add(lblNewLabel_4);
		
		textRcirculo = new JTextField();
		textRcirculo.setBounds(240, 117, 139, 20);
		contentPane.add(textRcirculo);
		textRcirculo.setColumns(10);
		
		JButton btnCcirculo = new JButton("Calcular\r\n");
		btnCcirculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CALCULA PROPIEDADES CIRCULO
				try {
				double radio=Double.parseDouble(textRcirculo.getText());   
				Circulo micirculo=new  Circulo(radio);
				
				textAcirculo.setText(String.valueOf(micirculo.calcularArea()));
				textPcirculo.setText(String.valueOf(micirculo.calcularPerimetro()));
				
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
					
				}
				
				
				
				
				
				
			}
		});
		btnCcirculo.setBounds(511, 116, 89, 23);
		contentPane.add(btnCcirculo);
		
		JLabel lblNewLabel_5 = new JLabel("Area del circulo\r\n");
		lblNewLabel_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(673, 94, 123, 14);
		contentPane.add(lblNewLabel_5);
		
		textAcirculo = new JTextField();
		textAcirculo.setBounds(652, 117, 144, 20);
		contentPane.add(textAcirculo);
		textAcirculo.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Perimetro del circulo\r\n");
		lblNewLabel_5_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_1.setBounds(910, 94, 166, 14);
		contentPane.add(lblNewLabel_5_1);
		
		textPcirculo = new JTextField();
		textPcirculo.setBounds(910, 117, 132, 20);
		contentPane.add(textPcirculo);
		textPcirculo.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ingrese base del rectángulo");
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1.setBounds(212, 196, 323, 14);
		contentPane.add(lblNewLabel_4_1);
		
		textBrectangulo = new JTextField();
		textBrectangulo.setColumns(10);
		textBrectangulo.setBounds(240, 221, 139, 20);
		contentPane.add(textBrectangulo);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Ingrese altura del rectángulo");
		lblNewLabel_4_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_1.setBounds(212, 253, 323, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		textHrectangulo = new JTextField();
		textHrectangulo.setColumns(10);
		textHrectangulo.setBounds(240, 278, 139, 20);
		contentPane.add(textHrectangulo);
		
		JButton btnNewCrectangulo = new JButton("Calcular\r\n");
		btnNewCrectangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//CALCULA PROPIEDADES RECTANGULO
				double Brectangulo= Double.parseDouble(textBrectangulo.getText()),Hrectangulo= Double.parseDouble(textHrectangulo.getText());
				Rectangulo miRectangulo = new Rectangulo(Brectangulo,Hrectangulo);
				
				textArectangulo.setText(String.valueOf(miRectangulo.calcularArea()));
				textPrectangulo.setText(String.valueOf(miRectangulo.calcularPerímetro()));
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
					
				}
				
			}
		});
		btnNewCrectangulo.setBounds(511, 233, 89, 23);
		contentPane.add(btnNewCrectangulo);
		
		JLabel lblNewLabel_5_2 = new JLabel("Area del rectángulo");
		lblNewLabel_5_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2.setBounds(659, 207, 153, 14);
		contentPane.add(lblNewLabel_5_2);
		
		textArectangulo = new JTextField();
		textArectangulo.setColumns(10);
		textArectangulo.setBounds(652, 234, 144, 20);
		contentPane.add(textArectangulo);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Perimetro del rectángulo");
		lblNewLabel_5_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_1_1.setBounds(897, 207, 166, 14);
		contentPane.add(lblNewLabel_5_1_1);
		
		textPrectangulo = new JTextField();
		textPrectangulo.setColumns(10);
		textPrectangulo.setBounds(910, 234, 132, 20);
		contentPane.add(textPrectangulo);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Ingrese longitud de los lados");
		lblNewLabel_4_1_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_2.setBounds(212, 345, 323, 14);
		contentPane.add(lblNewLabel_4_1_2);
		
		textLcuadrado = new JTextField();
		textLcuadrado.setColumns(10);
		textLcuadrado.setBounds(240, 370, 139, 20);
		contentPane.add(textLcuadrado);
		
		JButton btnCcuadrado = new JButton("Calcular\r\n");
		btnCcuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	
				//CALCULA PROPIEDADES CUADRADO
				double lado=Double.parseDouble(textLcuadrado.getText());   
				Cuadrado micuadrado=new  Cuadrado(lado);
				
				textAcuadrado.setText(String.valueOf(micuadrado.calcularArea()));
				textPcuadrado.setText(String.valueOf(micuadrado.calcularPerímetro()));
			}catch(NumberFormatException ex) {
				//EXCEPCION VALORES NO NÚMERICOS
				JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
				
			}
				
				
			}
		});
		btnCcuadrado.setBounds(511, 369, 89, 23);
		contentPane.add(btnCcuadrado);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Area del caudrado\r\n\r\n");
		lblNewLabel_5_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2_1.setBounds(658, 346, 123, 14);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Perimetro del cuadrado");
		lblNewLabel_5_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_1_1_1.setBounds(897, 337, 166, 14);
		contentPane.add(lblNewLabel_5_1_1_1);
		
		textAcuadrado = new JTextField();
		textAcuadrado.setColumns(10);
		textAcuadrado.setBounds(652, 370, 132, 20);
		contentPane.add(textAcuadrado);
		
		textPcuadrado = new JTextField();
		textPcuadrado.setColumns(10);
		textPcuadrado.setBounds(910, 370, 132, 20);
		contentPane.add(textPcuadrado);
		
		JLabel lblNewLabel_4_1_2_1 = new JLabel("Ingrese altura del triángulo");
		lblNewLabel_4_1_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_2_1.setBounds(229, 539, 323, 14);
		contentPane.add(lblNewLabel_4_1_2_1);
		
		textHtriangulo = new JTextField();
		textHtriangulo.setColumns(10);
		textHtriangulo.setBounds(240, 564, 139, 20);
		contentPane.add(textHtriangulo);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("Ingrese base del triángulo");
		lblNewLabel_4_1_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3.setBounds(229, 474, 323, 14);
		contentPane.add(lblNewLabel_4_1_3);
		
		textBtriangulo = new JTextField();
		textBtriangulo.setColumns(10);
		textBtriangulo.setBounds(240, 491, 139, 20);
		contentPane.add(textBtriangulo);
		
		JButton btnCtriangulo = new JButton("Calcular\r\n");
		btnCtriangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//CALCULA PROPIEDADES TRIÁNGULO
				double Btriangulo= Double.parseDouble(textBtriangulo.getText()),Htriangulo= Double.parseDouble(textHtriangulo.getText());
				TriánguloRectángulo miTriangulo = new TriánguloRectángulo(Btriangulo,Htriangulo);
				
				textAtriangulo.setText(String.valueOf(miTriangulo.calcularArea()));
				textPtriangulo.setText(String.valueOf(miTriangulo.calcularPerímetro()));
				textHiptriangulo.setText(String.valueOf(miTriangulo.calcularHipotenusa()));
				
				if(miTriangulo.determinarTipoTriángulo()==1) {
					textTipotriangulo.setText("El triángulo es equilatero");
				}
				else if(miTriangulo.determinarTipoTriángulo()==2) {
					textTipotriangulo.setText("El triángulo es escaleno");
				}
				else{
					textTipotriangulo.setText("El triángulo es isóceles");
				}
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
					
				}
				
				
				
			}
		});
		btnCtriangulo.setBounds(511, 499, 89, 23);
		contentPane.add(btnCtriangulo);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("Hipotenusa del triángulo");
		lblNewLabel_5_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1.setBounds(652, 474, 173, 14);
		contentPane.add(lblNewLabel_5_2_1_1);
		
		textHiptriangulo = new JTextField();
		textHiptriangulo.setColumns(10);
		textHiptriangulo.setBounds(652, 491, 132, 20);
		contentPane.add(textHiptriangulo);
		
		JLabel lblNewLabel_4_1_3_1 = new JLabel("Perimetro del triángulo");
		lblNewLabel_4_1_3_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_1.setBounds(897, 474, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_1);
		
		textPtriangulo = new JTextField();
		textPtriangulo.setColumns(10);
		textPtriangulo.setBounds(910, 491, 132, 20);
		contentPane.add(textPtriangulo);
		
		JLabel lblNewLabel_5_2_1_1_1 = new JLabel("Area del triángulo");
		lblNewLabel_5_2_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1.setBounds(652, 522, 173, 14);
		contentPane.add(lblNewLabel_5_2_1_1_1);
		
		textAtriangulo = new JTextField();
		textAtriangulo.setColumns(10);
		textAtriangulo.setBounds(652, 547, 132, 20);
		contentPane.add(textAtriangulo);
		
		JLabel lblNewLabel_4_1_3_2 = new JLabel("Ingrese diámetro menor del rombo");
		lblNewLabel_4_1_3_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2.setBounds(212, 617, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_2);
		
		textDMenor_rombo = new JTextField();
		textDMenor_rombo.setColumns(10);
		textDMenor_rombo.setBounds(240, 642, 139, 20);
		contentPane.add(textDMenor_rombo);
		
		JLabel lblNewLabel_4_1_3_2_1 = new JLabel("Ingrese diámetro mayor del rombo");
		lblNewLabel_4_1_3_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_1.setBounds(212, 664, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_2_1);
		
		textDMayor_rombo = new JTextField();
		textDMayor_rombo.setColumns(10);
		textDMayor_rombo.setBounds(240, 683, 139, 20);
		contentPane.add(textDMayor_rombo);
		
		JButton btnCrombo = new JButton("Calcular");
		btnCrombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//CALCULA PROPIEDADES ROMBO
				double DMenorombo= Double.parseDouble(textDMenor_rombo.getText()),DMayor= Double.parseDouble(textDMayor_rombo.getText()),lado= Double.parseDouble(textLrombo.getText());
				Rombo mirombo = new Rombo(lado,DMenorombo,DMayor);
				textArombo.setText(String.valueOf(mirombo.calcularArea()));
				textPrombo.setText(String.valueOf(mirombo.calcularPerimetro()));
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
					
				}
				
			}
		});
		btnCrombo.setBounds(511, 661, 89, 23);
		contentPane.add(btnCrombo);
		
		JLabel lblNewLabel_5_2_1_1_1_1 = new JLabel("Area del rombo");
		lblNewLabel_5_2_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1_1.setBounds(673, 644, 173, 14);
		contentPane.add(lblNewLabel_5_2_1_1_1_1);
		
		JLabel lblNewLabel_4_1_3_1_1 = new JLabel("Perimetro del rombo");
		lblNewLabel_4_1_3_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_1_1.setBounds(910, 644, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_1_1);
		
		textArombo = new JTextField();
		textArombo.setColumns(10);
		textArombo.setBounds(649, 662, 132, 20);
		contentPane.add(textArombo);
		
		textPrombo = new JTextField();
		textPrombo.setColumns(10);
		textPrombo.setBounds(910, 662, 132, 20);
		contentPane.add(textPrombo);
		
		JLabel lblNewLabel_4_1_3_2_2 = new JLabel("Ingrese base mayor");
		lblNewLabel_4_1_3_2_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_2.setBounds(240, 781, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_2_2);
		
		textBMayor_trapecio = new JTextField();
		textBMayor_trapecio.setColumns(10);
		textBMayor_trapecio.setBounds(240, 807, 139, 20);
		contentPane.add(textBMayor_trapecio);
		
		JLabel lblNewLabel_4_1_3_2_2_1 = new JLabel("Ingrese base menor");
		lblNewLabel_4_1_3_2_2_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_2_1.setBounds(240, 830, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_2_2_1);
		
		textBMenor_trapecio = new JTextField();
		textBMenor_trapecio.setColumns(10);
		textBMenor_trapecio.setBounds(240, 850, 139, 20);
		contentPane.add(textBMenor_trapecio);
		
		JLabel lblNewLabel_4_1_3_2_2_1_1 = new JLabel("Ingrese altura");
		lblNewLabel_4_1_3_2_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_2_1_1.setBounds(240, 871, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_2_2_1_1);
		
		textHtrapecio = new JTextField();
		textHtrapecio.setColumns(10);
		textHtrapecio.setBounds(240, 887, 139, 20);
		contentPane.add(textHtrapecio);
		
		JButton btnCtrapecio = new JButton("Calcular\r\n");
		btnCtrapecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//CALCULA PROPIEDADES TRAPECIO
				double BMenor= Double.parseDouble(textBMenor_trapecio.getText()),BMayor= Double.parseDouble(textBMayor_trapecio.getText()),altura= Double.parseDouble(textHtrapecio.getText());
				Trapecio mitrapecio = new Trapecio(BMayor,BMenor,altura);
				textAtrapecio.setText(String.valueOf(mitrapecio.calcularArea()));
				textPtrapecio.setText(String.valueOf(mitrapecio.calcularPerimetro()));
				}catch(NumberFormatException ex) {
					//EXCEPCION VALORES NO NÚMERICOS
					JOptionPane.showMessageDialog(null, "Rellene todos los campos o ingrese un formato valido");
					
				}
				
				
			}
		});
		btnCtrapecio.setBounds(511, 827, 89, 23);
		contentPane.add(btnCtrapecio);
		
		JLabel lblNewLabel_5_2_1_1_1_1_1 = new JLabel("Area del trapecio");
		lblNewLabel_5_2_1_1_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1_1_1.setBounds(652, 803, 173, 14);
		contentPane.add(lblNewLabel_5_2_1_1_1_1_1);
		
		textAtrapecio = new JTextField();
		textAtrapecio.setColumns(10);
		textAtrapecio.setBounds(652, 828, 132, 20);
		contentPane.add(textAtrapecio);
		
		JLabel lblNewLabel_4_1_3_1_1_1 = new JLabel("Perimetro del trapecio");
		lblNewLabel_4_1_3_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_1_1_1.setBounds(910, 803, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_1_1_1);
		
		textPtrapecio = new JTextField();
		textPtrapecio.setColumns(10);
		textPtrapecio.setBounds(910, 828, 132, 20);
		contentPane.add(textPtrapecio);
		
		JLabel lblNewLabel_5_2_1_1_1_2 = new JLabel("Tipo de triángulo");
		lblNewLabel_5_2_1_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_5_2_1_1_1_2.setBounds(903, 522, 173, 14);
		contentPane.add(lblNewLabel_5_2_1_1_1_2);
		
		textTipotriangulo = new JTextField();
		textTipotriangulo.setColumns(10);
		textTipotriangulo.setBounds(910, 547, 200, 20);
		contentPane.add(textTipotriangulo);
		
		JLabel lblNewLabel_4_1_3_2_1_1 = new JLabel("Ingrese lado del rombo");
		lblNewLabel_4_1_3_2_1_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNewLabel_4_1_3_2_1_1.setBounds(229, 707, 323, 14);
		contentPane.add(lblNewLabel_4_1_3_2_1_1);
		
		textLrombo = new JTextField();
		textLrombo.setColumns(10);
		textLrombo.setBounds(240, 728, 139, 20);
		contentPane.add(textLrombo);
		
		JButton btnBorrarC = new JButton("Borrar");
		btnBorrarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textRcirculo.setText("");
				textAcirculo.setText("");
				textPcirculo.setText("");
			}
		});
		btnBorrarC.setBounds(1131, 116, 89, 23);
		contentPane.add(btnBorrarC);
		
		JButton btnBorrarR = new JButton("Borrar");
		btnBorrarR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textBrectangulo.setText("");
				textHrectangulo.setText("");
				textArectangulo.setText("");
				textPrectangulo.setText("");
			}
		});
		btnBorrarR.setBounds(1131, 233, 89, 23);
		contentPane.add(btnBorrarR);
		
		JButton btnCuadrado = new JButton("Borrar");
		btnCuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textLcuadrado.setText("");
				textAcuadrado.setText("");
				textPcuadrado.setText("");
				
			}
		});
		btnCuadrado.setBounds(1131, 369, 89, 23);
		contentPane.add(btnCuadrado);
		
		JButton btnBorrarrec = new JButton("Borrar");
		btnBorrarrec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textTipotriangulo.setText("");
				textBtriangulo.setText("");
				textHtriangulo.setText("");
				textHiptriangulo.setText("");
				textAtriangulo.setText("");
				textPtriangulo.setText("");
				
			}
		});
		btnBorrarrec.setBounds(1131, 499, 89, 23);
		contentPane.add(btnBorrarrec);
		
		JButton btnBorrartri = new JButton("Borrar");
		btnBorrartri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDMenor_rombo.setText("");
				textDMayor_rombo.setText("");
				textLrombo.setText("");
				textArombo.setText("");
				textPrombo.setText("");
			}
		});
		btnBorrartri.setBounds(1131, 661, 89, 23);
		contentPane.add(btnBorrartri);
		
		JButton btnBorrartra = new JButton("Borrar");
		btnBorrartra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textBMenor_trapecio.setText("");
				textBMayor_trapecio.setText("");
				textHtrapecio.setText("");
				textAtrapecio.setText("");
				textPtrapecio.setText("");
				
				
			}
		});
		btnBorrartra.setBounds(1131, 821, 89, 23);
		contentPane.add(btnBorrartra);
		
		
	
	}
}
