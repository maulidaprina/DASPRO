package jobsheetlima;
import java.util.Scanner;

public class Kafe_JS5_12 {
    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);

boolean keanggotaan;
int jmlKopi, jmlTeh, jmlRoti;
double jmlDiskon, totalHarga, nominalBayar, hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0; 
float diskon = 10 / 100f;


System.out.print("Masukkan Keanggotaan (true/false): ");
keanggotaan = Input.nextBoolean();
System.out.print("Masukkan Jumlah Pembelian Kopi: ");
jmlKopi = Input.nextInt();
System.out.print("Masukkan Jumlah Pembelian Teh: ");
jmlTeh = Input.nextInt();
System.out.print("Masukkan Jumlah Pembelian Roti: ");
jmlRoti = Input.nextInt();

totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

if (keanggotaan) {
    nominalBayar = totalHarga - (diskon * totalHarga);
} else {
    nominalBayar = totalHarga;
}

int nominalInt = (int) nominalBayar;

System.out.println("Keanggotaan Pelanggan " + keanggotaan);
System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
System.out.println("Total Harga: Rp " + totalHarga);

if (keanggotaan) {
    jmlDiskon = (diskon * totalHarga);
    System.out.println("Anda Mendapatkan Diskon Sebesar: " + jmlDiskon);
}
else {
    System.out.println("Anda Tidak Mendapatkan Diskon");
}

System.out.println("Nominal Bayar: Rp " + nominalInt);
    
    }
}

