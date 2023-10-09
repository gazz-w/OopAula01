package webaula01;
import java.util.Scanner;

public class Teclado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite sua idade: ");
		String idade = scanner.nextLine();
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		scanner.close();
		
	}
}
