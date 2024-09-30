import java.util.Scanner;

public class TugasSatu12 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int bilangan1, bilangan2, hasil;

        System.out.print("Masukkan bilangan pertama: ");
        bilangan1 = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        bilangan2 = sc.nextInt();

        hasil = bilangan1 + bilangan2;

        System.out.println("Hasil penjumlahan: " + hasil);
    }
}