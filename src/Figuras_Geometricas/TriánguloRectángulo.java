package Figuras_Geometricas;
/**
 * Constructor de la clase TriánguloRectángulo
 *
 * @param base   Parámetro que define la base de un triángulo
 *               rectángulo
 * @param altura Parámetro que define la altura de un triángulo
 *               rectángulo
 */
public class TriánguloRectángulo {
	double base;
	double altura;
	 
	TriánguloRectángulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	}



/**
 * Método que calcula el área de un triángulo rectángulo
 *
 * @return Área de un triángulo rectángulo
 */
	double calcularArea() {
		return (base * altura / 2);
		}
	/**
     * Método que calcula el perímetro de un triángulo rectángulo
     * @return Perímetro de un triángulo rectángulo
     */
	double calcularPerímetro() {
		return (base + altura + calcularHipotenusa());
	}
	/**
     * Método que calcula la hipotenusa de un triángulo rectángulo
     * @return Hipotenusa de un triángulo rectángulo
     */
	double calcularHipotenusa() {
		return Math.pow(base*base + altura*altura, 0.5);
		}
	/**
     * Método que determina si un triángulo es:
     * - Equilatero: si sus tres lados son iguales
     * - Escaleno: si sus tres lados son todos diferentes
     * - Escaleno: si dos de sus lados son iguales y el otro es diferente de
     * los demás
     */
	int determinarTipoTriángulo() {
		
			if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())) {
				
			
		return 1;  //retorna tipo de triangulo equilatero
		
		
			}
			else if((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())){
				
		return 2;		//retorna tipo de triangulo escaleno
			}
			else {
		return 3; //retorna tipo de triangulo isoceles
			}
			
}
}
