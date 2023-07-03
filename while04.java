package Fundamentos;

import java.util.Scanner; 

public class while04 {
	public static void main (String [] args) {
		
		int c = 1;
		while (c <= 100) {
			if(c%2!=0) {
				System.out.println(c);
			}
			c++;
		}
	}

}
