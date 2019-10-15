package com.pbo;

import java.util.Scanner;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung nilai rata-rata dari sejumlah Mahasiswa
 *
 */

public class Mahasiswa {
    private static int jumlah, nilaiAkhir;

    private static void masukanNilai(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(String.format("Nilai Mahasiswa ke-%d : ", i));
            Scanner scanner = new Scanner(System.in);
            nilaiAkhir += scanner.nextInt();
        }
    }

    private static void hitungRataRata(int jumlahMahasiswa, double nilai) {
        System.out.println(String.format("Maka, nilai rata-ratanya adalah %.2f", (nilai / jumlahMahasiswa)));
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.print("Masukkan banyaknya mahasiwa\t: ");
        Scanner scanner = new Scanner(System.in);
        mahasiswa.jumlah = scanner.nextInt();
        mahasiswa.masukanNilai(jumlah);
        mahasiswa.hitungRataRata(jumlah, nilaiAkhir);
    }
}
