/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gibran
 */
class Mahasiswa {
    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Mahasiswa(String nama, String nim, double tugas, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = tugas;
        this.nilaiUts = uts;
        this.nilaiUas = uas;
    }

    // Menghitung nilai akhir dengan bobot: Tugas 20%, UTS 30%, UAS 50%
    public double hitungNilaiAkhir() {
        return (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.5 * nilaiUas);
    }

    // Menentukan Grade berdasarkan nilai akhir
    public String getGrade() {
        double akhir = hitungNilaiAkhir();
        if (akhir >= 85) return "A";
        else if (akhir >= 75) return "B";
        else if (akhir >= 65) return "C";
        else if (akhir >= 50) return "D";
        else return "E";
    }

    public void tampilkanData() {
        System.out.printf("| %-10s | %-15s | %-6.2f | %-6.2f | %-6.2f | %-6.2f | %-5s |\n", 
            nim, nama, nilaiTugas, nilaiUts, nilaiUas, hitungNilaiAkhir(), getGrade());
    }
}