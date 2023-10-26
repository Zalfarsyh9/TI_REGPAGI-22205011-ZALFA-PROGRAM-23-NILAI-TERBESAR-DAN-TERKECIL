/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011latihan23.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Jurusan : Teknik Informatika
 */
public class TI_REGPAGI22205011latihan23ZalfaJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String namaPetugas = scanner.nextLine();


        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyaknyaNilaiMahasiswa = scanner.nextInt();

        int[] nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }
        int nilaiTerbesar = Integer.MIN_VALUE;
        int nilaiTerkecil = Integer.MAX_VALUE;
        
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }
        
        System.out.println("\n");
        System.out.println("====Hasil Nilai Mahasiswa====");
        System.out.println("\n");
        System.out.println("Nilai Terbesar: " + nilaiTerbesar);
        System.out.println("Nilai Terkecil: " + nilaiTerkecil);
        System.out.println("\n");
        System.out.println("Petugas: " + namaPetugas);

        scanner.close();
    }
}
