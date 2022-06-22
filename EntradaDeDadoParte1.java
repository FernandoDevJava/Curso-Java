import java.util.Scanner;

public class EntradaDeDadoParte1 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		sc.close();
		
		//Para ler um número inteiro
		int x;
		x = sc.nextInt();
		
		//Para ler um número com ponto flutuante
		double x;
		x = sc.nextDouble();
		
		//Para ler um caractere
		//Suponha uma variável char declarada:
		char x;
		x = sc.next().charAt(0);
		
		//Para ler vários dados na mesma linha
		string x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


	}

}
