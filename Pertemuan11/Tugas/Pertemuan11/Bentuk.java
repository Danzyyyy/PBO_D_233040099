package Pertemuan11;

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
        // Memanggil konstruktor dari kelas induk (Object)
        super();
        // Menginisialisasi nilai jari-jari dengan nilai yang diberikan
        this.jari2 = jari2;
    }

    /*
     * Metode abstrak untuk menghitung luas bentuk geometri
     * Harus diimplementasikan oleh semua kelas yang meng-extend kelas Bentuk
     *
     * @return Luas dari bentuk geometri dalam satuan persegi
     */
    public abstract double luas();

    //Setter & Getter

    public int getJari2() {
        return jari2;
    }

    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}
