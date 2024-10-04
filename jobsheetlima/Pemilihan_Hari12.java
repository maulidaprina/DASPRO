package jobsheetlima;
import java.util.Scanner;

public class Pemilihan_Hari12 {
    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);

String dayName, dayType;

System.out.print("Input day name: ");
dayName = Input.nextLine();

switch (dayName.toLowerCase()) {
    case "monday":
    case "tuesday":
    case "wednesday":
    case "thursday":
    case "friday":
        dayType = "weekday";
        break;
    case "saturday":
    case "sunday":
        dayType = "weekend";
        break;
    default:
        dayType = "invalid day name";
}

System.out.println(dayName + " is a " + dayType);

    }
}