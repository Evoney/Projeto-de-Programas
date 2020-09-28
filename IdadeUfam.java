import java.util.Scanner;

public class IdadeUfam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano = scan.nextInt();
		int X =  ano - 1909;
		System.out.println("A UFAM tem " + X + " anos de fundacao");
		scan.close();
	}

}
