import java.util.Scanner;

public class Numero03 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
			    Scanner entrada = new Scanner(System.in);
			    
			    System.out.print("Informe o tamanho do vetor.");
			    int n = entrada.nextInt(); 
			    int v[] = new int[n]; 
			    int i; 
			    
			    for (i = 0; i < n; i++) {
			        System.out.print("Informe os valores do vetor: ");
			        v[i] = entrada.nextInt();
			}
			    int soma = 0;
			    int menor = 0;
			    int maior = 0;
			    double media = 0;
			    

			    for (i = 0; i < n; i++) {

			      if (i == 0) {
			        menor = v[i];
			      	maior = v[i];
			      }

			      if (v[i] < menor) {
			    	  menor = v[i];
			      }
			       	
			      else if (v[i] > maior) {
			         maior = v[i]; 
			    }
			    soma = soma + v[i];
			    }
			    media = soma / n;
			    int mediaAcima = 0;
			    int mediaAbaixo = 0;
			    
			    int contpar = 0;
			    int contimpar = 0;
			    
			    for (i = 0; i < n; i++) {
				      if (v[i] % 2 == 0) {
				    	  contpar = contpar + 1;
				      }
				      else if (v[i] % 2 != 0) {
				    	  contimpar = contimpar + 1;
				      }
			    }     
				for (i = 0; i < n; i++) {
					 if (v[i] > media) {
						 mediaAcima = mediaAcima + 1;
					 }
					 else {
						 mediaAbaixo = mediaAbaixo + 1;
					 }
				}
				 
			    System.out.println("O menor valor da matriz é: " +menor+".");
			    System.out.println("O maior valor da matriz é: " +maior+".");   
			    System.out.println("Nesse vetor existem " +contpar+ " valores pares.");
			    System.out.println("Nesse vetor existem " +contimpar+ " valores ímpares.");
			    System.out.println("O valor da soma é: " +soma+".");
			    System.out.println("O valor da média é: "+media);
				System.out.println("Existem " +mediaAcima+ " números acima da média.");
				System.out.println("Existem " +mediaAbaixo+ " números abaixo da média.");

				
			    entrada.close();
				    }

	}

