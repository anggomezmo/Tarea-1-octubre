package Figuras_Geometricas;
/**
 * Constructor de la clase Cuadrado
 * @param lado Parámetro que define la longitud de la base de un
 * cuadrado
 */
public class Cuadrado {
double lado;
	public Cuadrado(double lado) {
		this.lado = lado;
		}
	/**
     * Método que calcula el área de un cuadrado
     * @return Área de un Cuadrado
     */
	double calcularArea() {
		return lado*lado;
	}
	 /**
     * Método que calcula el perímetro de un cuadrado
     * @return Perímetro de un cuadrado
     */
	double calcularPerímetro() {
		return (4*lado);
		}

}
