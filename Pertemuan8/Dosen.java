package Pertemuan8;

public class Dosen {
    private String nip;
    private String nama;
    private String gelar;
    private String bidangKeahlian;

    // Constructor sederhana
    public Dosen(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
        this.gelar = "";
        this.bidangKeahlian = "";
    }

    // Constructor lengkap
    public Dosen(String nip, String nama, String gelar, String bidangKeahlian) {
        this.nip = nip;
        this.nama = nama;
        this.gelar = gelar;
        this.bidangKeahlian = bidangKeahlian;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getBidangKeahlian() {
        return bidangKeahlian;
    }

    public void setBidangKeahlian(String bidangKeahlian) {
        this.bidangKeahlian = bidangKeahlian;
    }

    // Method untuk menampilkan informasi dosen
    public String display() {
        if (!gelar.isEmpty()) {
            return nama + ", " + gelar + " (NIP: " + nip + ")";
        } else {
            return nama + " (NIP: " + nip + ")";
        }
    }
}
