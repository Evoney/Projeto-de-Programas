import java.lang.Math;
import java.util.Scanner;

public class AreaVolume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double pi = Math.PI;
        double A = pi*r*r;
        double V = (4.0/3.0)*pi*r*r*r;
         
        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.",r,A);
        System.out.println("");
		System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.",r,V);
		System.out.println("");
		
		 scan.close();
		}

}
