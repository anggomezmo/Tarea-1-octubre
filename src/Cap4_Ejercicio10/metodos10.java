package Cap4_Ejercicio10;

public class metodos10 {
	
	//METODO QUE SE ENCARGA DE CALCULAR EL PAGO DE LA MATRICULA.
	public static double Calcular_matricula(double plata,double estrato) {
		double pago;
		double normal=50000;
		pago = 0;
		if ((plata > 2000000) && (estrato > 3)) {
            pago = 0.03*plata+normal;
            return  pago;
        }else {
        	pago = normal;
			return pago;
		
		
		
		


	}
}
}

