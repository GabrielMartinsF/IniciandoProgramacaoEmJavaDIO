import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 

public class PrimeiroTeste{
	
    public static void main(String[] args) throws IOException {
      
      //new BufferedReader
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	//Lê a entrada
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	//Converte a string em inteiro
    	int entrada = Integer.parseInt(st.nextToken());
    	
    	 for(int i = 1; i <= entrada; i++){
    	   if(i%2 == 0){
    	       System.out.println(i);
    	   }
    	 }

    	}
  }