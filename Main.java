package exercicios;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String x = leitor.next();

		System.out.println("Você digitou: " + x);
		
		leitor.close();
	}
}
