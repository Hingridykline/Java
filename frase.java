package Fundamentos;

public class frase {
	public static void main (String [] args) {
		String frase = "O Rato Roeu a Roupa do Rei de Roma";
		int tam = frase.length(); 
		String semEspaco = frase.replace(" ", "");
		int tam2 = semEspaco.length();
		
		System.out.println(frase);
		System.out.println(tam);
		System.out.println(semEspaco);
		System.out.println(tam2);
		
	}
}
