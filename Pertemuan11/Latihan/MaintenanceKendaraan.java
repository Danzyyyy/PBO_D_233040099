package Vehicle;

public interface MaintenanceKendaraan {
    // Konstanta (secara implisit public static final)
    int INTERVAL_SERVIS_RINGAN = 5000; // dalam km
    int INTERVAL_SERVIS_BERAT = 20000; // dalam km

    // Method abstrak (secara implisit public abstract)
    void gantiOli();
    void periksaRem();
    String jadwalPerawatan();
}
