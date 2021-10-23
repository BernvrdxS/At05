import java.util.Scanner;

public class Numero04 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe quantas notas.");
	    int n = entrada.nextInt(); 
	    int v[] = new int[n]; 
	    int i; 

	    for (i = 0; i < n; i++) {
	        System.out.print("Informe suas notas: ");
	        v[i] = entrada.nextInt();
	    }
	    
	    float soma = 0;
	    float media = 0;
	    

	    for (i = 0; i < n; i++) {
		    soma = soma + v[i];
		    media = soma / n;
	    }
	    
	    System.out.println("As notas informadas são: " + i);
	    System.out.println("A média das notas é: "+media);

	    entrada.close();
}
}
