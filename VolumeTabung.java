package week1;
import java.util.Scanner;
public class VolumeTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai jari-jari dan tinggi tabung
        System.out.print("Masukkan diameter tabung: ");
        double diameter = input.nextDouble();
        diameter = 5;
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJari = input.nextDouble();
        jariJari = diameter / 2;
        
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = input.nextDouble();

        // Menghitung volume tabung
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;

        // Menampilkan hasil
        System.out.println("Volume tabung dengan diameter: " + diameter + "dan tinggi" + tinggi + "adalah: " + volume);

        input.close();
    }
}
