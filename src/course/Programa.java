package course;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y(suponha medidas válidas).
 Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui 
 a maior área.
 Fórmula para calcular a área de um triângulo a partir de seus lados a,b,c é 
 area = raiz quadrade P(p-a)(p-b)(p-c) onde p a+b+c/2    */

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		System.out.println("Entre com as  medidas do triangulo X");
		xA = sc.nextDouble();
		xB =sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y");
		yA = sc.nextDouble();
		yB =sc.nextDouble();
		yC = sc.nextDouble();
		double p= (xA + xB + xC)/2.0;
		double areaX = Math.sqrt(p * (p - xA)* (p - xB)* (p-xC));
		
	     p= (yA + yB + yC)/2.0;
		double areaY = Math.sqrt(p * (p - yA)* (p - yB)* (p-yC));
		
		System.out.printf("Triangul X area %.4f%n", areaX);
		System.out.printf("Triangul Y area %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		}
		else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
	}

}
