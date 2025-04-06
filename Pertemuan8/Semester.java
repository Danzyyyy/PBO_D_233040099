package Pertemuan8;

public class Semester {
    private String kodeSemester;
    private String tahunAjaran;
    private int semesterKe;
    private String jenisSemester; // Ganjil/Genap

    // Constructor sederhana
    public Semester(String kodeSemester) {
        this.kodeSemester = kodeSemester;
        this.tahunAjaran = "";
        this.semesterKe = 0;
        this.jenisSemester = "";
    }

    // Constructor lengkap
    public Semester(String kodeSemester, String tahunAjaran, int semesterKe, String jenisSemester) {
        this.kodeSemester = kodeSemester;
        this.tahunAjaran = tahunAjaran;
        this.semesterKe = semesterKe;
        this.jenisSemester = jenisSemester;
    }

    // Getter dan Setter
    public String getKodeSemester() {
        return kodeSemester;
    }

    public void setKodeSemester(String kodeSemester) {
        this.kodeSemester = kodeSemester;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public int getSemesterKe() {
        return semesterKe;
    }

    public void setSemesterKe(int semesterKe) {
        this.semesterKe = semesterKe;
    }

    public String getJenisSemester() {
        return jenisSemester;
    }

    public void setJenisSemester(String jenisSemester) {
        this.jenisSemester = jenisSemester;
    }

    // Method untuk menampilkan informasi semester
    public String display() {
        if (!tahunAjaran.isEmpty() && semesterKe > 0) {
            return "Semester " + semesterKe + " (" + jenisSemester + ") - Tahun Ajaran " + tahunAjaran + " (Kode: " + kodeSemester + ")";
        } else {
            return "Kode Semester: " + kodeSemester;
        }
    }
}
