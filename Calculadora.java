import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = leitor.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = leitor.nextInt();
		
		
		int soma =num1+num2;
		int subtracao =num1-num2;
		int multiplicacao =num1*num2;
		int divisao =num1/num2;
		double divisaoInteiro = (double) num1/num2;
		int resto =num1%num2;
		
		System.out.println("A soma � " +soma);
		System.out.println("A subtracao � " +subtracao);
		System.out.println("A multiplicacao � " +multiplicacao);
		System.out.println("A divisao � " +divisao);
		System.out.println("O resto � " +resto);
		System.out.println("A divisaoInteiro � " +divisaoInteiro);
		
		
		
		
		
		
		
			
		
		

	}

}
