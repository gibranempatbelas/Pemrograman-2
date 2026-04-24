/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg2;

/**
 *
 * @author Gibran
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Mahasiswa ===");
        
        System.out.print("Masukkan NIM     : ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Nama    : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Jurusan : ");
        String jurusan = input.nextLine();

        // Membuat objek dari class Mahasiswa
       

        // Menampilkan hasil input
        System.out.println("\n=== Data Mahasiswa Berhasil Disimpan ===");
        mhs.tampilkanData();
        
        input.close();
    }

    private static class mhs {

        private static void tampilkanData() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public mhs() {
        }
    }
}