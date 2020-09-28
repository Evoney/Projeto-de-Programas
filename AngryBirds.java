import java.lang.Math;
import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double v = scan.nextDouble();
        double a = scan.nextDouble();
        double D = scan.nextDouble();
        double ra = Math.toRadians(a);
        double R = ((v*v)*Math.sin(2*ra))/9.8;
		if ((R >= (D - 0.1)) && (R <= (D + 0.1)))  {
			 System.out.println("1");
			 } else {
			 System.out.println("0");
			 }
		
		 scan.close();
		}

}
