/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg9;

/**
 *
 * @author Gibran
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AplikasiNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        boolean berjalan = true;

        System.out.println("=== SISTEM ADMINISTRASI NILAI MAHASISWA ===");

        while (berjalan) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Semua Nilai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            
            int pilihan = input.nextInt();
            input.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nilai Tugas: ");
                    double tugas = input.nextDouble();
                    System.out.print("Nilai UTS: ");
                    double uts = input.nextDouble();
                    System.out.print("Nilai UAS: ");
                    double uas = input.nextDouble();

                    daftarMahasiswa.add(new Mahasiswa(nama, nim, tugas, uts, uas));
                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("Belum ada data.");
                    } else {
                        System.out.println("\n" + "=".repeat(75));
                        System.out.printf("| %-10s | %-15s | %-6s | %-6s | %-6s | %-6s | %-5s |\n", 
                            "NIM", "NAMA", "TUGAS", "UTS", "UAS", "AKHIR", "GRADE");
                        System.out.println("-".repeat(75));
                        for (Mahasiswa m : daftarMahasiswa) {
                            m.tampilkanData();
                        }
                        System.out.println("=".repeat(75));
                    }
                    break;

                case 3:
                    berjalan = false;
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        input.close();
    }
}