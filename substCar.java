package Fundamentos;

public class substCar {
	public static void main (String [] args) {
		String str = "Hello World";
		String s = "abc";
		String strg = "Hello World World2";
		
		String result1 = str.replace ("l", "w"); //substitui o primeiro caracter pelo seguno
		String result2 = str.substring (6); //Começa a partir do 6 caracter
		String result3 = str.substring (3,9); //
		String result4 = str.trim(); //Remove os espaços do início e do fim
		char result5 = str.charAt(1);
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("Azul");
		int tam = s.length(); 
		int pos = strg.indexOf("o"); //conta quantos caracters iguais tem
		int pos2 = strg.lastIndexOf("l");
		String valor = "CDD4.0 - Java";
		
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println(tam);
		
		System.out.println(pos);
		System.out.println(pos2);
		
		
		System.out.println(valor.compareTo("CDD4.0 - Java") == 0 ? true : false);
		System.out.println(valor.compareTo("cdd4.0 - JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true : false);
		
	}
}
