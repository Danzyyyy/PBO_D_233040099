package Vehicle;

public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private double kapasitasMesin; // dalam liter

    public Mobil(String merek, String model, int tahun, int jumlahPintu, double kapasitasMesin) {
        super(merek, model, tahun);
        this.jumlahPintu = jumlahPintu;
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public double hitungKonsumsiBBM() {
        // Logika implementasi untuk mobil
        return 10.5 * kapasitasMesin / 2.0; // contoh rumus sederhana dalam km/liter
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil " + merek + " " + model + " bergerak dengan 4 roda");
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }
}
