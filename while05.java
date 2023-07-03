package Fundamentos;
import java.util.Scanner;
		
public class while05 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int n = entrada.nextInt();
		
		int c = 1;
		while (c <= n) {
			if(c%2!=0) {
				System.out.print(c);
			}
			c++;
			
		}	
		System.out.println();
		int cc = 0;
		while (cc < n ) {
			if (cc % 2 ==0) {
				System.out.print(cc);
			}
			cc++;
		}
	}

}
