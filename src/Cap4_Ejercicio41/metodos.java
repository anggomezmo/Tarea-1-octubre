package Cap4_Ejercicio41;

public class metodos {
	//metodo que separa cadena de string y busca el mayor
	public static double Calcular_mayor_numero(String numeros) {
		double datoArray,cont=0;
		String split[]=numeros.split(",");
		for (int i=0;i<split.length;i++) {
			  datoArray=Double.parseDouble(split[i]);
			if(datoArray>cont) {
				
				cont=datoArray;
		
								}//fin si
										}//fin for
		return cont;
		
		
	}
	

}
