package Fundamentos;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextDouble();
		if (resp >= 0) {
			System.out.println("Positivo!");
		} else {
			System.out.println("Negativo!");
		}

	}

}
