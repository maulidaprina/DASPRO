import java.util.Scanner;

public class ProgramJamKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jamSekarang = 3;
        int menitSekarang = 0;
        int detikSekarang = 0;
        
        System.out.println("============Program Jam Kuliah============");
        // System.out.println("Jam sekarang adalah " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);
        System.out.println("Jam sekarang adalah " + formatWaktu(jamSekarang, menitSekarang, detikSekarang));
        
        System.out.print("Masukkan jam kuliah: ");
        int jamKuliah = input.nextInt();
        System.out.print("Masukkan menit kuliah: ");
        int menitKuliah = input.nextInt();
        System.out.print("Masukkan detik kuliah: ");
        int detikKuliah = input.nextInt();
        
        int totalDetikSekarang = jamSekarang * 3600 + menitSekarang * 60 + detikSekarang;
        int totalDetikKuliah = jamKuliah * 3600 + menitKuliah * 60 + detikKuliah;

        int totalSisaDetik = (totalDetikKuliah - totalDetikSekarang + 86400) % 86400;
        int sisaJam = totalSisaDetik / 3600;
        int sisaMenit = (totalSisaDetik % 3600) / 60;
        int sisaDetik = totalSisaDetik % 60;
        
        System.out.println("Kuliah Anda dimulai " + formatWaktu(jamKuliah, menitKuliah, detikKuliah));
        System.out.println("Jadi sisa waktu menuju perkuliahan Anda adalah " + sisaJam + " jam " + sisaMenit + " menit " + sisaDetik + " detik");
        
        input.close();
    }
    
    public static String formatWaktu(int jam, int menit, int detik) {
        return String.format("%02d:%02d:%02d", jam, menit, detik);
    }
}
