import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello World!");
		int a;
		System.out.println("Digite o valor de a: ");
		a = keyboard.nextInt();
		System.out.println("Valor de a: " + a);
		keyboard.close();
	}
}