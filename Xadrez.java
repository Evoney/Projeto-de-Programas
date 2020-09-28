import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int i = 0;
		while(i<(x/2)) {
			for(int j=0; j<x; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
			System.out.print(" ");		
			for(int j=0; j<x; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");	
			i++;
		}
		
		scan.close();
	}
}
