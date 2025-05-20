package Vehicle;

public abstract class Kendaraan {
    // Atribut
    protected String merek;
    protected String model;
    protected int tahun;

    // Constructor
    public Kendaraan(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    // Method konkrit (sudah diimplementasikan)
    public void tampilkanInfo() {
        System.out.println("Kendaraan: " + merek + " " + model + " (" + tahun + ")");
    }

    // Method abstrak (harus diimplementasikan oleh subclass)
    public abstract double hitungKonsumsiBBM();
    public abstract void bergerak();
}
