import java.util.Scanner;
public class Numero14 {

		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

			int i = 0;
			int j = 0;
			int vetor[] = new int[10];
			int segundovetor[] = new int[10];
			int terceirovetor[] = new int[20];

			for (i = 0; i < 10; i++) {
				System.out.println("Informe um número para o primeiro vetor : ");
				vetor[i] = Integer.parseInt(entrada.nextLine());
			}
			for (i = 0; i < 10; i++) {
				System.out.println("Informe um número para o segundo vetor : ");
				segundovetor[i] = Integer.parseInt(entrada.nextLine());
			}
			for (i = 0; i < 10; i++) {
				terceirovetor[j] = vetor[i];
				j++;
				terceirovetor[j] = segundovetor[i];
				j++;
			}
			System.out.println("O vetor 3 será composto pelos elementos: ");
			for (i = 0; i < 20; i++) {
				System.out.println(terceirovetor[i]);
			}
			entrada.close();
		}

	

	}


