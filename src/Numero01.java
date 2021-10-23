import java.util.Scanner;
import java.util.Arrays;

public class Numero01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner entrada = new Scanner(System.in);
	    
	    int n = 5; 
	    int v[] = new int[n]; 
	    int i; 
	    
	    for (i=0; i<n; i++) {
	        System.out.printf("Informe os valores do vetor: ", (i+1), n);
	        v[i] = entrada.nextInt();
	}
	    System.out.println("Os valores do vetor são: " +Arrays.toString(v));
	    
	    entrada.close();
	}
}