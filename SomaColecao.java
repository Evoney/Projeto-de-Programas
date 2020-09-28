import java.util.Scanner;

public class SomaColecao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int soma = 0;
		
		while(s != -1) {
			soma = soma + s;
			s = scan.nextInt();
		}
		
		System.out.println(soma);
		
		scan.close();
	}

}
