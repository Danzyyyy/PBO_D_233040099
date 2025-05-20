package Pertemuan11;

/*
 * Kelas Tabung yang merupakan turunan dari kelas abstrak Bentuk
 * Mengimplementasikan perhitungan luas permukaan tabung
 */
public class Tabung extends Bentuk {
    /*
     * Variabel untuk menyimpan nilai tinggi tabung
     * Dideklarasikan sebagai private sehingga hanya bisa diakses melalui getter dan setter
     */
    private int tinggi;

    /*
     * Konstruktor default untuk kelas Tabung tanpa parameter
     * Memanggil konstruktor kelas induk (Bentuk) dengan jari-jari = 0
     */
    public Tabung() {
        // Memanggil konstruktor dari kelas induk (Bentuk) dengan jari-jari = 0
        super(0);
    }

    /*
     * Konstruktor untuk kelas Tabung dengan parameter jari-jari dan tinggi
     * Memanggil konstruktor kelas induk (Bentuk) dan menginisialisasi nilai tinggi
     *
     * @param jari2 Nilai jari-jari alas tabung
     * @param tinggi Nilai tinggi tabung
     */
    public Tabung(int jari2, int tinggi) {
        // Memanggil konstruktor dari kelas induk (Bentuk)
        super(jari2);
        // Menginisialisasi nilai tinggi tabung
        this.tinggi = tinggi;
    }

    /*
     * L: 2₶ . r (r+t)
     */

    /*
     * Implementasi metode abstrak luas() dari kelas Bentuk
     * Menghitung luas permukaan tabung dengan rumus: 2 * PHI * jari-jari * (jari-jari + tinggi)
     * Rumus ini merupakan penjumlahan dari luas dua alas lingkaran (2 * PHI * r^2) dan
     * luas selimut tabung (2 * PHI * r * t)
     *
     * @return Luas permukaan tabung dalam satuan persegi
     */
    @Override
    public double luas() {
        // Menghitung luas permukaan tabung dengan rumus: 2 * PHI * r * (r + t)
        return 2*PHI*jari2*(jari2+tinggi);
    }

    //Setter & Getter

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
