package Pertemuan7;

import Pertemuan5.Matakuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0.0;
        int totalSks = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            khs.hitungIPS(); // Hitung IPS untuk setiap KHS
            List<Matakuliah> daftarMatakuliah = khs.getDaftarMatakuliah();

            for (Matakuliah m : daftarMatakuliah) {
                totalNilai += m.nilaiIndex() * m.getSks(); // Menggunakan nilaiIndex() untuk nilai numerik
                totalSks += m.getSks();
            }
        }

        if (totalSks > 0) {
            ipk = totalNilai / totalSks;
        } else {
            ipk = 0.0;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    // Setter Getter
    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}