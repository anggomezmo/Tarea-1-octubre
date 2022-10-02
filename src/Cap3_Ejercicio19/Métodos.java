package Cap3_Ejercicio19;

public class Métodos {
	//Metodo que calcula el perimetro del triángulo
	public static double calcular_perimetro(double lado) {
		double perimetro;
		perimetro=lado*3;
		return perimetro;
		
		//Metodo que calcula la altura del triángulo
	}
	public static double calcular_altura(double lado) {
		double altura;
		altura=(lado*Math.sqrt(3))/2;
		return altura;
	}
	//metodo que calcula el area del triángulo
	public static double calcular_area(double lado) {
		double area;
		area=(Math.pow(lado,2)*Math.sqrt(3))/4;
		return area;
	}
}
