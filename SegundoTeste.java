import java.util.Scanner;
import java.util.Locale;

public class SegundoTeste {
	public static void main(String[] args) {
	  
		Locale.setDefault(new Locale("en", "US"));
		
		//Entrada do CPF
		Scanner sc = new Scanner(System.in);
		
		//Cria vetor de tamanho 4
		String[] cpf = new String[4]; 
		
		//Quebra linha e divide a String
		cpf = sc.nextLine().split("-");
		
		for(int i= 0; i < cpf.length; i++) {
		  System.out.println(cpf[i].replace(".","\n"));
	  }
	  
		sc.close();
	}
}
