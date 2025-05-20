package Vehicle;

public class ManajemenKendaraan {
    public static void main(String[] args) {
        // Membuat objek dari kelas-kelas turunan
        Mobil sedan = new Mobil("Toyota", "Camry", 2023, 4, 2.5);
        Motor sport = new Motor("Honda", "CBR150R", 2022, "sport", 150);
        Truk barang = new Truk("Hino", "Dutro", 2021, 8.0);

        // Menggunakan method dari kelas abstrak
        sedan.tampilkanInfo();
        System.out.println("Konsumsi BBM: " + sedan.hitungKonsumsiBBM() + " km/liter");
        sedan.bergerak();
        System.out.println("Jumlah pintu: " + sedan.getJumlahPintu());
        System.out.println();

        sport.tampilkanInfo();
        System.out.println("Konsumsi BBM: " + sport.hitungKonsumsiBBM() + " km/liter");
        sport.bergerak();
        // Menggunakan method dari interface
        sport.gantiOli();
        sport.periksaRem();
        System.out.println(sport.jadwalPerawatan());
        System.out.println();

        barang.tampilkanInfo();
        System.out.println("Konsumsi BBM: " + barang.hitungKonsumsiBBM() + " km/liter");
        barang.bergerak();
        barang.tampilkanKapasitasMuatan();
        // Menggunakan method dari interface
        barang.gantiOli();
        barang.periksaRem();
        System.out.println(barang.jadwalPerawatan());
    }
}
