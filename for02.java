package Fundamentos;
import java.util.Scanner; 

public class for02 {
	public static void main (String [] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			
			if (i==19) {
				break;
			}
		}
	}
}
