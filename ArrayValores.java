package Fundamentos;
import java.util.Scanner;
public class ArrayValores {
	public static void main (String [] args) {
		Scanner entrada = new Scanner (System.in);
		
		int[] num1 = new int[10];
		System.out.println("Array1");
		for (int x = 0; x < 10; x++) {
			System.out.print((x+1));
			 num1[x] = entrada.nextInt();
		}			
		
		int[] num2 = new int[10];
		System.out.println("Array2");
		for (int x = 0; x < 10; x++) {
			System.out.print((x+1));
			 num2[x] = entrada.nextInt();
		}
		int[] num3 = new int[10];
		System.out.println("Array3");
		for (int x = 0; x < 10; x++) {
			System.out.print((x+1));
			 num3[x] = entrada.nextInt();
		}
		int[] num4 = new int[10];
		System.out.println("Array4");
		for (int x = 0; x < 10; x++) {
			System.out.print((x+1));
			 num4[x] = entrada.nextInt();
		}
		
		for (int x:num1) {
			System.out.print(x + " ");
		}
		System.out.print("\n");
		for(int x: num2) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x: num3) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		for(int x: num4) {
			System.out.print(x + " ");
		}
	}
}
