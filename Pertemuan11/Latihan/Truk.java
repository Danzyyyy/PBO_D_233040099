package Vehicle;

public class Truk extends Kendaraan implements MaintenanceKendaraan {
    private double kapasitasMuatan; // dalam ton

    public Truk(String merek, String model, int tahun, double kapasitasMuatan) {
        super(merek, model, tahun);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    @Override
    public double hitungKonsumsiBBM() {
        // Semakin berat muatan, semakin boros
        return 5.0 - (kapasitasMuatan * 0.1); // km/liter
    }

    @Override
    public void bergerak() {
        System.out.println("Truk " + merek + " " + model + " bergerak dengan 6 roda");
    }

    // Implementasi method dari interface PemeliharaanKendaraan
    @Override
    public void gantiOli() {
        System.out.println("Ganti oli truk setiap " + (INTERVAL_SERVIS_RINGAN / 3) + " km");
    }

    @Override
    public void periksaRem() {
        System.out.println("Periksa sistem rem pneumatik dan tekanan udara");
    }

    @Override
    public String jadwalPerawatan() {
        return "Truk " + merek + " " + model + " memerlukan perawatan khusus karena beban berat. " +
                "Servis ringan setiap " + (INTERVAL_SERVIS_RINGAN / 2) + " km.";
    }

    public void tampilkanKapasitasMuatan() {
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " ton");
    }
}
