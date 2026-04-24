/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author Gibran
 */

import java.util.Scanner;

public class NilaiMhs {

    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input user
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        String nim, nama, grade;
        double uts, uas, rata;

        System.out.println("--- Input Data Mahasiswa ---");
        
        System.out.print("Masukkan NIM    : ");
        nim = input.nextLine();
        
        System.out.print("Masukkan Nama   : ");
        nama = input.nextLine();
        
        System.out.print("Nilai UTS       : ");
        uts = input.nextDouble();
        
        System.out.print("Nilai UAS       : ");
        uas = input.nextDouble();

        // Menghitung rata-rata
        rata = (uts + uas) / 2;

        // Logika penentuan Grade
        if (rata < 50) {
            grade = "E";
        } else if (rata < 60) {
            grade = "D";
        } else if (rata < 70) {
            grade = "C";
        } else if (rata < 80) {
            grade = "B";
        } else {
            grade = "A";
        }

        // Menampilkan Output Tabel
        System.out.println("\n==================================================================");
        System.out.println("NIM\tNama\t\tUTS\tUAS\tRata2\tGrade");
        System.out.println("==================================================================");
        System.out.println(nim + "\t" + nama + "\t" + uts + "\t" + uas + "\t" + rata + "\t" + grade);
        System.out.println("==================================================================");
        
        input.close(); // Menutup scanner
    }
}