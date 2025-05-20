package Pertemuan11;

public interface Kartu {
    /*
     * Metode untuk melakukan otentikasi PIN
     * Kelas yang mengimplementasikan interface ini harus menyediakan logika
     * untuk memverifikasi apakah PIN yang dimasukkan valid atau tidak
     *
     * @param pin String yang berisi PIN yang akan diverifikasi
     * @return true jika PIN valid, false jika tidak valid
     */
    public boolean otentikasi(String pin);
    /*
     * Metode untuk melakukan enkripsi PIN
     * Kelas yang mengimplementasikan interface ini harus menyediakan logika
     * untuk mengenkripsi PIN menjadi format yang aman
     *
     * @param pin String yang berisi PIN yang akan dienkripsi
     * @return String hasil enkripsi PIN
     */
    public String encode(String pin);
}
