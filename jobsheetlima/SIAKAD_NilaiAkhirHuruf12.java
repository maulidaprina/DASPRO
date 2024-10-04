package jobsheetlima;
import java.util.Scanner;

public class SIAKAD_NilaiAkhirHuruf12 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

String nama, nim, kelas, kualifikasi;
byte absen;
double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
char nilaiHuruf;

System.out.print("Masukkan Nama: ");
nama = sc.nextLine();
System.out.print("Masukkan NIM: ");
nim = sc.nextLine();
System.out.print("Masukkan Kelas: ");
kelas = sc.nextLine();
System.out.print("Masukkan Nomor Absen: ");
absen = sc.nextByte();

System.out.print("Masukkan Nilai Kuis: ");
nilaiKuis = sc.nextDouble();
System.out.print("Masukkan Nilai Tugas: ");
nilaiTugas = sc.nextDouble();
System.out.print("Masukkan Nilai UTS: ");
nilaiUTS = sc.nextDouble();
System.out.print("Masukkan Nilai UAS: ");
nilaiUAS = sc.nextDouble();

nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUTS * 0.30) + (nilaiUAS * 0.35);

if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
    nilaiHuruf = 'A'; 
    kualifikasi = "Sangat Baik";
} else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
    nilaiHuruf = 'B';
    kualifikasi = "Lebih dari Baik";
} else if (nilaiAkhir >= 65 && nilaiAkhir <= 73) {
    nilaiHuruf = 'C';
    kualifikasi = "Baik";
} else if (nilaiAkhir >= 60 && nilaiAkhir <= 65) {
    nilaiHuruf = 'D';
    kualifikasi = "Lebih dari Cukup";
} else if (nilaiAkhir >= 50 && nilaiAkhir <= 60) {
    nilaiHuruf = 'D';
    kualifikasi = "Cukup";
} else if (nilaiAkhir >= 39 && nilaiAkhir <= 50) {
    nilaiHuruf = 'D';
    kualifikasi = "Kurang";
} else {
    nilaiHuruf = 'E';
    kualifikasi = "Gagal";
}

System.out.println("Mahasiswa dengan nama " + nama + " (NIM " +  nim  + ")" + " kelas " + kelas + " nomor absen " + absen);
System.out.println("Nilai Akhir: "+ nilaiAkhir); 
System.out.println("Nilai Huruf: " + nilaiHuruf);
System.out.println("Kualifikasi: " + kualifikasi);

    }
}