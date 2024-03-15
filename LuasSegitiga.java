package week1;
import java.util.Scanner;
public class LuasSegitiga {
	public static void main(String[] args) {
		//menghutung luas segitiga
		double L, a, t;
		Scanner in = new Scanner(System.in);
		System.out.println("masukkan alas = "); 
		a = in.nextDouble();
		System.out.println("masukkan tinggi = ");
		t = in.nextDouble();
		L = 0.5 * (a * t);
		
		System.out.println("L = "+L);
		
	}
}
