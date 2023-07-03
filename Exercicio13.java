package Fundamentos;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = input.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = input.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int c = input.nextInt();
		
		if ((a>b) && (a>c)) {
			System.out.println("O maior valor é da letra A: " + a );
				} else if ((a<b) && (a<c)) {
					System.out.println("O menor valor é da letra A: " + a);
				}if ((b>a) && (b>c)) {
					System.out.println("O maior valor é da letra B: " + b);
					} else if ((b<a) && (b<c)) {
						System.out.println("O menor valor é da letra B: " + b);
					}else 
						System.out.println("O maior valor é da letra C: " + c);
							if ((c<a) && (c<b)) {
								System.out.println("O menor valor é da letra C: " + c);
							}
				}	
	
}
