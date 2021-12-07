package metodosJava;

//Exemplo de sobrecarga de métodos utilizando o exemplo do cálculo de area dos quadriláteros
public class Quadrilatero {
	
	public static void area(double lado) {
		System.out.println("Area do quadrado é: " + lado * lado);
	}
	
	public static void area(double lado1, double lado2) {
		System.out.println("Area retângulo: " + lado1 * lado2);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("Area do trapézio: " + ((baseMaior+baseMenor)*altura) /2);
	}
	
	public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }

}
