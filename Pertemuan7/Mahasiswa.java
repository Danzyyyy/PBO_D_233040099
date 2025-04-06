package Pertemuan7;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa() {
        //TO DO Auto-generated constructor stub
        this.NRP = "233040099";
        this.nama = "Tubagus Muhammad Wildan";
    }

    public Mahasiswa(String nRP, String nama) {
        super();
        this.NRP = nRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    //Setter Getter
    public String getNRP() {
        return NRP;
    }

    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
