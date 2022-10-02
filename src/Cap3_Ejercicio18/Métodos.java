package Cap3_Ejercicio18;

public class Métodos {
	
	
	public static double metodo_salario_bruto(double horas, double valorhora) {
		//Metodo que calcula el salario bruto
		double salario_bruto;
		salario_bruto= horas*valorhora;
		return salario_bruto;

}
	public static double metodo_retencion_fuente(double porcentaje_retencion,double horas, double valorhora) {
		//Metodo que calcula el dinero retenido en la fuente
		double dinero_retenido;
		dinero_retenido= (horas*valorhora)*(porcentaje_retencion)/100;

		return dinero_retenido;
}
	public static double metodo_salario_neto(double dinero_retenido,double horas, double valorhora) {
		//metodo que calcula el salario neto
		double salario_neto;
		 salario_neto= (horas*valorhora)-dinero_retenido;
		 
		return salario_neto;
}
	
}
