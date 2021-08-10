import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassePrincipal {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		int a,b,r;
		
		try {
		System.out.println("Digite um valor: ");
		a = keyb.nextInt();
		System.out.println("Digite outro valor: ");
		b = keyb.nextInt();
		r = a/b;
		System.out.println("O resultado vale: "+r);
		
		keyb.close();
		}
		catch (InputMismatchException e) {
			System.out.println("Digite um número inteiro");
		}
		catch (ArithmeticException e) {
			System.out.println("Erro no cálculo");
		}
		catch (Exception e) {
			System.out.println("Erro"+e.getClass().getName());
		}
	}
}
