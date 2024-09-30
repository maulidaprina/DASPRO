public class PakRomi {
    public static void main(String[] args) {

        double Kecepatan = 70;
        double Waktu = 1 + 1.0 / 4;
        double Jarak = Kecepatan * Waktu;
        double JarakMeter = Jarak * 1000;
        
        System.out.println("Kecepatan Pak Romi: " + Kecepatan + " km/jam");
        System.out.println("Waktu Pak Romi: " + Waktu + " Jam");
        System.out.println("Jarak Pak Romi dari Polinema ke lokasi kerja: " + Jarak + " Km");
        System.out.println("Jarak pak romi dalam meter: " + JarakMeter + " Meter");

    }
}