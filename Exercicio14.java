package Fundamentos;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float media;
		System.out.println("Digite a primeira nota: ");
		float n1 = input.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float n2 = input.nextFloat();
		
		System.out.println("A média do aluno(a): " + (n1+n1)/2);
		
	}
}
