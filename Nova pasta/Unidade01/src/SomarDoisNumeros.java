import java.util.Scanner;
public class SomarDoisNumeros {

	 public static void main( String[] args ) {
	      int a, b, c = 0;
	      Scanner Scanner = new Scanner( System.in );
	      System.out.print( "digite o primeiro numero: ");
	      a = Scanner.nextInt();
	      System.out.print( "digite o segundo numero: ");
	      b = Scanner.nextInt();
	      c = a + b;
	      Scanner.close();
	      System.out.println( "A soma dos numeros é: " + c );
	   }

	
}
