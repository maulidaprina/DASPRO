package jobsheetlima;
import java.util.Scanner;

public class PemilihanBil12 {
    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);

int angka;
String hasil;

System.err.print("Masukkan Sebuah Angka: ");
angka = Input.nextInt();

hasil = (angka % 2 == 0) ? "genap" : "ganjil";

System.out.println("Angka " + angka + " termasuk bilangan " + hasil);
    
  }
}