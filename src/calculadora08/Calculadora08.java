package calculadora08;
/**autoria: Aitor Fernandez Clase: CalculadoraGIT08*/

/**
 * Clase de ejemplo para demostración.
 * @author Aitor Fernández
 * @version 1.0.0
 */

public class Calculadora08 {
	
	public int sumar(int a, int b) {
		 return a + b;
	}
	
	public int restar(int a, int b) {
		 return a - b;
	}
		
	public double dividir(int a, int b) {
		 if (b == 0) {
			 throw new IllegalArgumentException("No se puede dividir entre cero");
		 }
		 return (double) a / b;
	}


HEAD
	//version main

	//version feature-avanzadas
feature-avanzadas


	public int multiplicar(int a, int b) {
		 return a * b;
	}
		
	public int modulo(int a, int b) {
		 return a % b;
	}

	public int potencia(int base, int exponente) {
		 int resultado = 1;
		 for (int i = 0; i < exponente; i++) {
			 resultado *= base;
		 }
		 return resultado;
	}

}
