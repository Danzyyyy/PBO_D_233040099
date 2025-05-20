package Pertemuan11;

public class Lingkaran extends Bentuk {

    /*
     * Konstruktor untuk kelas Lingkaran
     * Memanggil konstruktor kelas induk (Bentuk) dengan parameter jari-jari
     *
     * @param jari2 Nilai jari-jari lingkaran
     */
    public Lingkaran(int jari2) {
        // Memanggil konstruktor dari kelas induk (Bentuk)
        super(jari2);
    }

    /*
     * L: PHI*r*r
     */

    /*
     * Implementasi metode abstrak luas() dari kelas Bentuk
     * Menghitung luas lingkaran dengan rumus: PHI * jari-jari * jari-jari
     *
     * @return Luas lingkaran dalam satuan persegi
     */
    @Override
    public double luas() {
        // Menghitung luas lingkaran dengan rumus: PHI * r * r
        return PHI*jari2*jari2;
    }
}
