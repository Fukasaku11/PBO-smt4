package week1;
import java.util.Scanner;
public class KelilingLingkaran {
	 public static void main(String[] args) {
	        // Menghitung keliling lingkaran
	       final double phi = 3.14;
	       double Kell, r, d;
	       Scanner masuk = new Scanner(System.in);
	       System.out.print("Masukkan d = ");
	       
	       r = masuk.nextDouble();
	       d = 10;
	       
	       Kell = phi * d;
	       
	       System.out.println("Kell = " + Kell);
	       
	 
	}
	 
}
	 
