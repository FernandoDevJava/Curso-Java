import java.util.Scanner;

public class EstruturasRepetitivasParaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Contagem Progressiva
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		sc.close();
		
		
		//Contagem Regressiva
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}

	}

}
