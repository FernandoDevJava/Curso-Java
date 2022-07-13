
public class TiposDeDadosEVariaveisPT2 {

	public static void main(String[] args) {


		int x = 10;      // declaração de uma variável do tipo int
		double d = x;    // variável double recebe um tipo int
		long l = x;      // variável long recebe um tipo int
		float f = x;     // variável float recebe um tipo de int (atenção)
		short s = 20;    // declaração de uma variável do tipo short
		x = s;           // variável int recebe um tipo short
		
		double valorDouble = 9.99;
		int ValorInt = (int) valorDouble;    // (int,double..etc.) serve para forçar a execução do comando (perde informação)
		System.out.println(ValorInt);

	}

}
