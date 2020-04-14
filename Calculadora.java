import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		
		
		Scanner leitor = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro número: ");
		num1 = leitor.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leitor.nextInt();
		
		
		int soma =num1+num2;
		int subtracao =num1-num2;
		int multiplicacao =num1*num2;
		int divisao =num1/num2;
		double divisaoInteiro = (double) num1/num2;
		int resto =num1%num2;
		
		System.out.println("A soma é " +soma);
		System.out.println("A subtracao é " +subtracao);
		System.out.println("A multiplicacao é " +multiplicacao);
		System.out.println("A divisao é " +divisao);
		System.out.println("O resto é " +resto);
		System.out.println("A divisaoInteiro é " +divisaoInteiro);
		
		
		
		
		
		
		
			
		
		

	}

}
