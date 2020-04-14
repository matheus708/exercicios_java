import java.util.Scanner;

public class BoasVindas {

	public static void main(String[] args) {
		
			String nome,cidade;
			int idade;
			
			
			Scanner leitor = new Scanner (System.in);
			
			System.out.println("Digite seu nome,: ");
			nome = leitor.next();
			System.out.println("Digite sua cidade: ");
			cidade = leitor.next();
			System.out.println("Digite sua idade: ");
			idade = leitor.nextInt();
			
		
			
			
			System.out.println("Boas Vindas "+nome);
			System.out.println("Você mora em "+cidade);
			System.out.println("Você tem "+idade+ " anos. ");
			
			

	}

	
