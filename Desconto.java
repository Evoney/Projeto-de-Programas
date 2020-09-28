import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float p = scan.nextFloat();
		
		if (p >= 200.0) {
			float d = (float)(0.95*p);
			System.out.printf("%.2f", d);
		} else {
			System.out.printf("%.2f", p);
		}
		scan.close();
	}

}
