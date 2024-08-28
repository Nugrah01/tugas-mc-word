/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11soal2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pertemuan11soal2 {
     public static void main(String[] args) {
         Scanner mahasiswa= new Scanner(System.in); // membuat a Scanner object
        System.out.print("Masukan Id Karyawan ? ");
 String nim = mahasiswa.nextLine(); // membaca input dari keyboard
 System.out.println("Id karyawan : " + nim); //Output user input
 
  
  Scanner Agustav= new Scanner(System.in); // membuat a Scanner object
        System.out.print("Masukan Nama Karyawan ? ");
 String orang = Agustav.nextLine(); // membaca input dari keyboard
 System.out.println("Nama Karyawan : " + orang); //Output user input
 
 
 
         Karyawan objek1=new Karyawan(1111 , "Agus " , "3 " , "Manager ");
 objek1.info();
    }}
class Karyawan {
    int IdKaryawan;
 String NamaKaryawan;
 String GolKaryawan;
 String JabatanKaryawan;

 // constructor dengan 2 parameter
 Karyawan (int id, String nama, String gol, String jabatan){
 this.IdKaryawan = id;
 this.NamaKaryawan = nama;
 this. GolKaryawan = gol;
 this. JabatanKaryawan = jabatan;
 }
 void info(){
 System.out.println("Id Karyawan : " + IdKaryawan);
 System.out.println(" Nama: " + NamaKaryawan);
 System.out.println("Gol: " + GolKaryawan);       
 System.out.println("Jabatan: " + JabatanKaryawan);
 int gajipokok = 3;
 switch (gajipokok) {
     case 1:
     System.out.println("gaji pokok: 300.000");
     break;
     case 2:
     System.out.println("gaji pokok: 4.000.000");
     break;
     case 3:
     System.out.println("gaji pokok: 4.000.000");
     break;
 }}
}
