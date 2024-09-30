import java.util.Scanner;

public class TugasDua01 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        float tugas, uts, uas, rataRata;

        System.out.print("Masukkan nilai Tugas: ");
            tugas = sc.nextFloat();
        System.out.print("Masukkan nilai UTS: ");
            uts = sc.nextFloat();
        System.out.print("Masukkan nilai UAS: ");
            uas = sc.nextFloat();

        rataRata = (tugas + uts + uas) / 3;

        System.out.println("Rata-rata nilai: " + rataRata);
    }
} 
