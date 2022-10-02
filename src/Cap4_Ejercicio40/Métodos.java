package Cap4_Ejercicio40;

import java.text.DecimalFormat;

public class Métodos {
	//calcula las raiz cuadradad del numero
	public static String Calcular_raices(double numero){
		DecimalFormat df = new DecimalFormat("#.0000");
		return df.format(Math.sqrt(numero));
	
		//calcula el cuadrado del numero
	}
	public static double Calcular_cuadrado(double numero){
		return Math.pow(numero,2);
		
	}
	//clcula el cubo del numero
	public static double Calcular_cubo(double numero){
		 
		return Math.pow(numero,3);
		
	}
}
