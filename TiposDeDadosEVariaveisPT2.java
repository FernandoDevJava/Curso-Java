
public class TiposDeDadosEVariaveisPT2 {

	public static void main(String[] args) {


		int x = 10;      // declara��o de uma vari�vel do tipo int
		double d = x;    // vari�vel double recebe um tipo int
		long l = x;      // vari�vel long recebe um tipo int
		float f = x;     // vari�vel float recebe um tipo de int (aten��o)
		short s = 20;    // declara��o de uma vari�vel do tipo short
		x = s;           // vari�vel int recebe um tipo short
		
		double valorDouble = 9.99;
		int ValorInt = (int) valorDouble;    // (int,double..etc.) serve para for�ar a execu��o do comando (perde informa��o)
		System.out.println(ValorInt);

	}

}
