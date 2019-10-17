/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Nilai {
        Scanner sc = new Scanner(System.in);
	private int mahasiswa;
	private double ratarata, nilai;
	
	public void inputNilai(){
		System.out.print("Masukkan Banyaknya Mahasiswa : ");
		mahasiswa = sc.nextInt();
		for (int i = 0; i < mahasiswa; i++ ) {
			System.out.print("Nilai Mahasiswa ke - " + (i+1) + " : ");
			nilai += sc.nextDouble();
		}
		
	}
	
	public void outputHasil() {
		ratarata = nilai / mahasiswa;
		System.out.println("Maka, Rata-rata Nilainya adalah " + ratarata);
	} 
}
