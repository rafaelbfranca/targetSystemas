import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma sequência de caracteres:"); 
		String name = sc.nextLine(); 
		
		for(int i = name.length()-1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		
		sc.close();
	}
}
