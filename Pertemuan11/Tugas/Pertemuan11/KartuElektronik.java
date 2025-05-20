package Pertemuan11;
/*
 * Kelas KartuElektronik yang mengimplementasikan interface Kartu
 * Merupakan implementasi konkret dari kartu elektronik yang memiliki
 * kode bank dan PIN untuk keperluan otentikasi
 */
public class KartuElektronik implements Kartu{
    /*
     * Variabel untuk menyimpan kode bank dari kartu elektronik
     * Dideklarasikan sebagai private untuk menjaga keamanan data
     */
    private String kodeBank;
    /*
     * Variabel untuk menyimpan PIN kartu elektronik
     * Dideklarasikan sebagai private untuk menjaga keamanan data
     */
    private String pin;

    /*
     * Konstruktor untuk kelas KartuElektronik
     * Menginisialisasi nilai kode bank dan PIN
     *
     * @param kodeBank String yang berisi kode bank dari kartu
     * @param pin String yang berisi PIN awal kartu
     */
    public KartuElektronik(String kodeBank, String pin){
        // Memanggil konstruktor dari kelas induk (Object)
        super();
        // Menginisialisasi kode bank
        this.kodeBank = kodeBank;
        // Menginisialisasi PIN
        this.pin = pin;
    }

    /*
     * Implementasi metode otentikasi dari interface Kartu
     * Memeriksa apakah PIN yang dimasukkan sama dengan PIN yang tersimpan
     *
     * @param pinInput String yang berisi PIN yang dimasukkan untuk verifikasi
     * @return true jika PIN cocok, false jika tidak cocok
     */
    @Override
    public boolean otentikasi(String pinInput){
        // Membandingkan PIN input dengan PIN yang tersimpan
        if(pin.equals(pinInput))
            return true;
        else
            return false;
    }

    /*
     * Implementasi metode encode dari interface Kartu
     * Metode ini seharusnya melakukan enkripsi pada PIN yang dimasukkan
     * Namun, implementasi saat ini mengembalikan null (belum diimplementasikan)
     *
     * @param pin String yang berisi PIN yang akan dienkripsi
     * @return String hasil enkripsi PIN (saat ini mengembalikan null)
     */
    @Override
    public String encode(String pin){
        //melakukan enkripsi inputan PIN
        return null;
    }
}
