package Pertemuan11;

public class Main {
    public static void main(String[] args) {
        // Bagian untuk mendemonstrasikan kelas Lingkaran
        System.out.println("== Lingkaran ==");
        // Membuat objek Lingkaran dengan jari-jari 10
        Lingkaran l = new Lingkaran(10);
        // Menampilkan nilai jari-jari dari objek Lingkaran
        System.out.println("jari2: " + l.getJari2());
        // Menampilkan hasil perhitungan luas lingkaran
        System.out.println("Luas: " + l.luas());

        // Bagian untuk mendemonstrasikan kelas Tabung
        System.out.println("== Tabung ==");
        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung t = new Tabung(10, 5);
        // Menampilkan nilai jari-jari dan tinggi dari objek Tabung
        System.out.println("jari2: " + t.getJari2() + ", " + "Tinggi: " + t.getTinggi());
        // Menampilkan hasil perhitungan luas permukaan tabung
        System.out.println("Luas: " + t.luas());
    }
}
