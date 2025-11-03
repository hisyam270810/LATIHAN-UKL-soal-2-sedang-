import java.util.Scanner;

public class soal2VolumeTabung {
    
    //fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jarijari,double tinggi) {
        double volume = Math.PI * jarijari * jarijari * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input data dari pengguna
        System.out.println("masukkan jari jari tabung (cm):");
        double r= input.nextDouble();

        System.out.println("masukkan tinggi tabung (cm):");
        double t = input.nextDouble();

        //panggil fungsi untuk menghitung volume tabung
        double volume = hitungVolumeTabung(r, t);

        //tampilkan haslil volume tabung
        System.out.println("=============hasil volume tabung=============");
        System.out.println("jari jari" + r + " cm");
        System.out.println("tinggi" + t + " cm");
        System.out.printf("volume tabung: %.2f cm^3%n", volume);
        input.close();
    }
}
