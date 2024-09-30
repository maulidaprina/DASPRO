import java.util.Scanner;

public class TugasTiga12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float saldoAwal = 500000.0f;
        float saldoAkhir, jumlahTarik;

        System.out.println("Saldo awal Anda: " + saldoAwal);

        System.out.print("Masukkan jumlah uang yang ingin ditarik: ");
        jumlahTarik = sc.nextFloat();

        if (jumlahTarik > saldoAwal) {
            System.out.println("Saldo tidak mencukupi untuk penarikan.");
        } else {
           
            saldoAkhir = saldoAwal - jumlahTarik;

            System.out.println("Saldo akhir Anda: " + saldoAkhir);
        }
    }
}
    

