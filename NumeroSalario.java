package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class NumeroSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		int numeroFuncionario = leitor.nextInt();
		int horasTrabalhadas = leitor.nextInt();
		double valorHora = leitor.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		
		leitor.close();
	}
	
/*
Fazer um programa que leia o 
número de um funcionário, 
seu número de horas trabalhadas, 
o valor que recebe por hora e 
calcula o salário desse 
funcionário. A seguir, mostre o 
número e o salário do funcionário, com duas casas 
decimais
*/

}
