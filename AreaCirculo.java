package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		double r = leitor.nextDouble();
		double π = 3.14159;
		double A = π * r * r;
		
		System.out.printf("A = %.4f%n ", A);
		
		leitor.close();
	}
	
/*
Faça um programa para ler o valor 
do raio de um círculo, e depois 
mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.1415
*/
	
	
}
