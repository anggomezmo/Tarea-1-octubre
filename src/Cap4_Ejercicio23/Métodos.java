package Cap4_Ejercicio23;

public class Métodos {
	public static double Calcular_Cuadratica_determinante_cero(double A,double B,double determinante) { 
		//CALCULA LA RAIZ CUADRATICA CUANDO EL DETERMINANTE ES CERO
		return (-B/ (2 * A));
		
	}
	
	public static double Calcular_Cuadratica_Positiva(double A,double B,double determinante) {
		//CALCULA LA RAIZ CUADRATICA CON DETERMINANTE MAYOR QUE CERO
		return (-B + Math.sqrt(determinante)) / (2 * A);
		
	}
	public static double Calcular_Cuadratica_Negativa(double A,double B,double determinante) {
		//CALCULA LA RAIZ CUADRATICA CON DETERMINANTE MAYOR QUE CERO
		return (-B - Math.sqrt(determinante)) / (2 * A);

}
}