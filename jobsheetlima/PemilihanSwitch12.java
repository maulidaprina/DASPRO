package jobsheetlima;
import java.util.Scanner;

public class PemilihanSwitch12 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

double angka1, angka2, hasil = 0;
char operator;

System.out.println("Masukkan Angka 1: ");
angka1 = sc.nextDouble();
System.out.println("Masukkan Angka 2: ");
angka2 = sc.nextDouble();
System.out.println("Masukkan Operator (+ - * :)");
operator = sc.next().charAt(0);

switch (operator) {
    case '+':
        hasil = angka1 + angka2;
        break;
    case '-':
        hasil = angka1 - angka2;
        break;
    case '*':
        hasil = angka1 * angka2;
        break;
    case '/':
        hasil = angka1 / angka2;
        break; 
    default:
    System.out.println("Operator yang Anda masukkan tidak sesuai.");
    return;
}
    System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    
  }
}