package Pertemuan8;

import Pertemuan7.KartuHasilStudi;


public class KHSSemester {
    private KartuHasilStudi khs;
    private Semester semester;

    public KHSSemester(KartuHasilStudi khs, Semester semester) {
        this.khs = khs;
        this.semester = semester;
    }

    // Getter dan Setter
    public KartuHasilStudi getKhs() {
        return khs;
    }

    public void setKhs(KartuHasilStudi khs) {
        this.khs = khs;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    // Method untuk menampilkan informasi KHS dengan detail semester
    public String display() {
        return "Kartu Hasil Studi\n" +
                semester.display() + "\n" +
                "IPS: " + khs.getIps() + "\n" +
                "Daftar Matakuliah:\n" + khs.display();
    }
}
