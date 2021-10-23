import java.util.Scanner;

public class Numero17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome[] = {"Carlos Henrique", "Bruno", "Lucas", "Neymar", "Antony", "Raphinha", 
						 "Gabriel", "Vinicius", "Marquinhos", "Ederson"};
			
		for (int i = 0; i < nome.length; i++) {
		}
		
		String sobrenome[] = {"Casemiro", "Guimarães", "Paquetá", "Junior", "Santos", "Dias",
								"Jesus", "Paixão", "Corrêa", "Moraes"};
		for (int i = 0; i < sobrenome.length; i++) {
		}
		
		String email[] = {"casemirinho@gmail.com", "bruninhovolante@gmail.com", "paquetadopassin@gmail.com",
				"neycamisa10@gmail.com", "antonyliso@gmail.com", "raphinadoleeds@gmail.com", 
				"falso9daamarelinha@gmail.com", "meteligoli@gmail.com", "marquinhospsg@gmail.com",
				"edersoncity@gmail.com"};
		for (int i = 0; i < email.length; i++) {
		}
		
		String celular[] = {"5555-5555", "8888-8888", "1111-1111", "1010-1010", "7777-7777",
							"1717-1717", "9999-9999", "1919-1919", "4444-4444", "2323-2323"};
		for (int i = 0; i < celular.length; i++) {
		}
		
		String data[] = {"23/02/1992", "16/11/1997", "27/08/1997", "05/02/1992", "24/02/2000",
						"14/12/1996", "03/04/1997", "12/07/2000", "14/05/1994", "17/08/1993"};
		
		for (int i = 0; i < data.length; i++) {
		}
		
		System.out.print("Informe um nome: ");
		String nomeUser = entrada.next();
		
		for (int i = 0; i < nome.length; i++) { 
			if (nomeUser.equalsIgnoreCase(nome[i])) {
				System.out.println(nome[i]);
				System.out.println(sobrenome[i]);
				System.out.println(email[i]);
				System.out.println(celular[i]);
				System.out.println(data[i]);
			}
		}
		
		System.out.print("Informe um sobrenome: ");
		String sobrenomeUser = entrada.next();
		
		for (int i = 0; i < sobrenome.length; i++) { 
			if (sobrenomeUser.equalsIgnoreCase(sobrenome[i])) {
				System.out.println(nome[i]);
				System.out.println(sobrenome[i]);
				System.out.println(email[i]);
				System.out.println(celular[i]);
				System.out.println(data[i]);
			}
		}
		System.out.print("Informe um email: ");
		String emailUser = entrada.next();
		
		for (int i = 0; i < email.length; i++) { 
			if (emailUser.equalsIgnoreCase(email[i])) {
				System.out.println(nome[i]);
				System.out.println(sobrenome[i]);
				System.out.println(email[i]);
				System.out.println(celular[i]);
				System.out.println(data[i]);
			}
		}
		System.out.print("Informe um celular: ");
		String celularUser = entrada.next();
		
		for (int i = 0; i < celular.length; i++) { 
			if (celularUser.equalsIgnoreCase(celular[i])) {
				System.out.println(nome[i]);
				System.out.println(sobrenome[i]);
				System.out.println(email[i]);
				System.out.println(celular[i]);
				System.out.println(data[i]);
			}
		}
		System.out.print("Informe uma data de nascimento: ");
		String dataUser = entrada.next();
		
		for (int i = 0; i < data.length; i++) { 
			if (dataUser.equalsIgnoreCase(data[i])) {
				System.out.println(nome[i]);
				System.out.println(sobrenome[i]);
				System.out.println(email[i]);
				System.out.println(celular[i]);
				System.out.println(data[i]);
			}
		}
		
		
		
		
	}
}

