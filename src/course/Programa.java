package course;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y(suponha medidas v�lidas).
 Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos possui 
 a maior �rea.
 F�rmula para calcular a �rea de um tri�ngulo a partir de seus lados a,b,c � 
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
