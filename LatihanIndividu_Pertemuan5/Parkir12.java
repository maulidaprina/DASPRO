import java.util.Scanner;

public class Parkir12 {
    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);


String jenisKendaraan = "";
int pilihan, biayaMobil = 5000, biayaMotor = 3000, jam, totalBiaya;

System.out.println("Pilih Jenis Kendaraan: ");
System.out.println("1. Mobil");
System.out.println("2. Motor");
System.out.print("Masukkan pilihan (1/2): ");
pilihan = Input.nextInt();

System.out.print("Berapa jam Anda akan parkir: ");
jam = Input.nextInt();

if (pilihan == 1) {
    jenisKendaraan = "Mobil";
    totalBiaya = biayaMobil * jam;
} else if (pilihan == 2) {
    jenisKendaraan = "Motor";
    totalBiaya = biayaMotor * jam;
} else {
    System.out.println("Pilihan tidak valid.");
    return;

    }

    System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya parkir: Rp" + totalBiaya);

  }
}
