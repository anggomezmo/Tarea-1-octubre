package Figuras_Geometricas;

public class Rectangulo {
	double base;
	double altura;
	 /**
     * Constructor de la clase Rectangulo
     * @param base Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
	Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		/**
	     * Método que calcula el área de un rectángulo
	     * @return Área de un rectángulo
	     */
		}
	double calcularArea() {
		return base * altura;
		}
	/**
     * Método que calcula el perímetro de un rectángulo
     * @return Perímetro de un rectángulo
     */
	double calcularPerímetro() {
		return (2 * base) + (2 * altura);
		}
	}
