package Pertemuan11;

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kodeBank dan PIN
        KartuElektronik kartu = new KartuElektronik("IF111", "123");

        // Menguji metode otentikasi untuk memverifikasi PIN
        System.out.println("Otentikasi:" + kartu.otentikasi("123")); // Menampilkan hasil otentikasi
    }
}