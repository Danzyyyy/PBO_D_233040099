package Pertemuan7;

import Pertemuan5.Matakuliah;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah m : daftarMatakuliah) {
            sb.append(m.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSks = 0;

        for (Matakuliah m : daftarMatakuliah) {
            totalNilai += m.nilaiIndex() * m.getSks(); // Menggunakan nilaiIndex() untuk nilai numerik
            totalSks += m.getSks();
        }

        if (totalSks > 0) {
            ips = totalNilai / totalSks;
        } else {
            ips = 0;
        }
    }

    // Setter Getter
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getIps() {
        return ips;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
}