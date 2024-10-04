package jobsheetlima;

import java.util.Scanner;

public class Usia_JS5_12 {
    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);


int usia;

System.out.println("Masukkan Usia Anda: ");

if (Input.hasNextInt()) {
    usia = Input.nextInt();

    if (usia < 0) {
        System.out.println("Usia harus berupa angka positif. Silakan coba lagi.");
    } else {

        if (usia >= 0 && usia <= 12) {
            System.out.println("Anda termasuk kategori: Anak");
        } else if (usia >= 13 && usia <= 19) {
            System.out.println("Anda termasuk kategori: Remaja");
        } else if (usia >= 20 && usia <= 64) {
            System.out.println("Anda termasuk kategori: Dewasa");
        } else {
            System.out.println("Anda termasuk kategori: Lansia");
        }
    }
} else {
System.out.println("Input tidak valid, masukkan angka yang benar."); 
        }    
    }
}