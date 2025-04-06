package Pertemuan8;

import Pertemuan5.Matakuliah;

public class MatakuliahDosen {
    private Matakuliah matakuliah;
    private Dosen dosen;

    public MatakuliahDosen(Matakuliah matakuliah, Dosen dosen) {
        this.matakuliah = matakuliah;
        this.dosen = dosen;
    }

    // Getter dan Setter
    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    // Method untuk menampilkan informasi matakuliah dan dosen pengampu
    public String display() {
        return matakuliah.display() + "\nDosen Pengampu: " + dosen.display();
    }
}
