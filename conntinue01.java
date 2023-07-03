package Fundamentos;
import java.util.Scanner; 

public class conntinue01 {
	public static void main (String [] args) {
		for (int i = 1; i <= 100; i++) {
			
			if (i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}
	}
}
