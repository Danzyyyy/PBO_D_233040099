package Vehicle;

public class Motor extends Kendaraan implements MaintenanceKendaraan{
    private String tipeMotor; // sport, bebek, matic
    private int kapasitasMesin; // dalam cc

    public Motor(String merek, String model, int tahun, String tipeMotor, int kapasitasMesin) {
        super(merek, model, tahun);
        this.tipeMotor = tipeMotor;
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public double hitungKonsumsiBBM() {
        // Logika implementasi untuk motor
        if (tipeMotor.equalsIgnoreCase("matic")) {
            return 45.0; // km/liter
        } else if (tipeMotor.equalsIgnoreCase("sport")) {
            return 35.0; // km/liter
        } else {
            return 50.0; // km/liter untuk tipe bebek
        }
    }

    @Override
    public void bergerak() {
        System.out.println("Motor " + merek + " " + model + " bergerak dengan 2 roda");
    }

    // Implementasi method dari interface PemeliharaanKendaraan
    @Override
    public void gantiOli() {
        System.out.println("Ganti oli motor setiap " + (INTERVAL_SERVIS_RINGAN / 2) + " km");
    }

    @Override
    public void periksaRem() {
        System.out.println("Periksa rem cakram dan kampas rem");
    }

    @Override
    public String jadwalPerawatan() {
        return "Motor " + merek + " " + model + " memerlukan perawatan rutin setiap " +
                INTERVAL_SERVIS_RINGAN + " km dan servis besar setiap " + INTERVAL_SERVIS_BERAT + " km";
    }
}
