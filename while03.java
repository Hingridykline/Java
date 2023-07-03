package Fundamentos;

import java.util.Scanner;

public class while03 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
	System.out.println("Quantos alunos tem na sua sala?");
	int n = entrada.nextInt();
	
	int c=0;
	float snota = 0;
	
	while (c <= n-1) {
		System.out.println("Qual a média do aluno?");
		float nota = entrada.nextFloat();
		
		c++;
		snota += nota;
	}
	
	System.out.println(snota/n);
	}

}
