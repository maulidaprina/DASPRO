import java.util.Scanner;

public class Pemilihan2Percobaan2_12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);


int pilihan_menu, jmlBeli;
double harga = 0, diskon = 0, totalBayar = 0;
String member;

System.out.println("-------------------------------------------");
System.out.println("============== MENU KAFE JTI ==============");
System.out.println("-------------------------------------------");
System.out.println("1. Ricebowl");
System.out.println("2. Ice Tea");
System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
System.out.println("-------------------------------------------");

System.out.print("Masukkan angka dari menu yang dipilih = ");
pilihan_menu = Input12.nextInt();
Input12.nextLine();
System.out.print("Apakah punya member (y/n) ? = ");
member = Input12.nextLine();
System.out.println("-------------------------------------------");

if (pilihan_menu == 1) {
    harga = 14000;
    System.out.println("Harga ricebowl = " + harga);

} else if (pilihan_menu == 2) {
    harga = 3000;
    System.out.println("Harga ice tea = " + harga);

}else if (pilihan_menu == 3){
    harga = 15000;
    System.out.println("Harga bundling = " + harga);

} else {
    System.out.println("Masukkan pilihan menu dengan benar");
    return;
}

totalBayar = harga - (harga * diskon);
System.out.println("Total bayar setelah diskon = " + totalBayar);


else if (member.equalsIgnoreCase("n")); {
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
    
    } else if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea = " + harga);
    
    }else if (pilihan_menu == 3){
        harga = 15000;
        System.out.println("Harga bundling = " + harga);
    
    } else {
        System.out.println("Masukkan pilihan menu dengan benar");
        return;
}
System.out.println("Total bayar = + harga");

} else {
    System.out.println("Member tidak valid");
}
System.out.println("-------------------------------------------");

    }
}