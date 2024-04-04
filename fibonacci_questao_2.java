import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int fx = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número desejado:"); 
		int testNumber = sc.nextInt(); 
		
		System.out.print(f1+", "+f2);
		
		while(testNumber > fx) {
			fx = f1 + f2;
			f1 = f2;
			f2 = fx;
			System.out.print(", "+fx);
		}
		
		System.out.println();
		
		if (testNumber == fx) {
			System.out.println("O número "+testNumber+" pertence à série de Fibonacci.");
		} else {
			System.out.println("O número "+testNumber+" não pertence à série de Fibonacci.");
		}
		
		sc.close();
	}

}
