package Pertemuan8;

import Pertemuan5.Matakuliah;
import Pertemuan7.Mahasiswa;
import Pertemuan7.KartuHasilStudi;
import Pertemuan7.TranskripNilai;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040099", "Tubagus Muhammad Wildan");

        // Create objek dosen
        Dosen d1 = new Dosen("D001", "Siroj Nur Ulum", "S.T., M.Kom.", "Algoritma dan Pemrograman");
        Dosen d2 = new Dosen("D002", "Ade Sukendar", "S.Kom., M.T.", "Pemrograman Berorientasi Objek");
        Dosen d3 = new Dosen("D003", "Ayi Purbasari", "S.T., M.T.", "Data Science");

        // Create objek Semester
        Semester semester1 = new Semester("20221", "2022/2023", 1, "Ganjil");
        Semester semester2 = new Semester("20222", "2022/2023", 2, "Genap");

        // Create objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Create objek relasi matakuliah-dosen
        MatakuliahDosen md1 = new MatakuliahDosen(mk1, d1);
        MatakuliahDosen md2 = new MatakuliahDosen(mk2, d1);
        MatakuliahDosen md3 = new MatakuliahDosen(mk3, d2);

        // List untuk menyimpan relasi matakuliah-dosen
        List<MatakuliahDosen> daftarMatakuliahDosen = new ArrayList<>();
        daftarMatakuliahDosen.add(md1);
        daftarMatakuliahDosen.add(md2);
        daftarMatakuliahDosen.add(md3);

        // Create objek KHS
        KartuHasilStudi khs1 = new KartuHasilStudi("Semester 1");
        khs1.addMatakuliah(mk1);
        khs1.addMatakuliah(mk2);

        KartuHasilStudi khs2 = new KartuHasilStudi("Semester 2");
        khs2.addMatakuliah(mk3);

        // Create objek relasi KHS-Semester
        KHSSemester khsSemester1 = new KHSSemester(khs1, semester1);
        KHSSemester khsSemester2 = new KHSSemester(khs2, semester2);

        // Create objek Transkrip Nilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs1);
        transkrip.addKHS(khs2);
        transkrip.hitungIPK();

        // Menampilkan informasi transkrip
        System.out.println("=== TRANSKRIP NILAI ===");
        System.out.println(mhs.display());
        System.out.println("Tanggal Cetak: " + transkrip.getTglCetak().toString());
        System.out.println("IPK: " + transkrip.getIpk());

        // Menampilkan KHS dengan informasi semester
        System.out.println("\n=== KARTU HASIL STUDI DENGAN INFORMASI SEMESTER ===");
        System.out.println(khsSemester1.display());
        System.out.println("\n" + khsSemester2.display());

        // Menampilkan matakuliah dengan informasi dosen pengampu
        System.out.println("\n=== DAFTAR MATAKULIAH DENGAN DOSEN PENGAMPU ===");
        for (MatakuliahDosen md : daftarMatakuliahDosen) {
            System.out.println(md.display());
            System.out.println("-------------------------");
        }
    }
}
