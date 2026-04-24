/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg2;

import java.util.Scanner;

/**
 *
 * @author Gibran
 */
public class Pertemuan2 {



public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;

    // Constructor untuk inisialisasi data
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkan data ke konsol
    public void tampilkanData() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("---------------------------");
    }
}
}
