/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6no1;
import java.util.Scanner; // Import library classScanner 
/**
 *
 * @author Agus
 */
public class Pertemuan6no1 {
    public static void main(String[] args){
        Scanner mahasiswa= new Scanner(System.in); // membuat a Scanner object
        System.out.print("Masukan Nim Anda ? ");
 String nim = mahasiswa.nextLine(); // membaca input dari keyboard
 System.out.println("Nim ? : " + nim); //Output user input
 
 
  Scanner Agustav= new Scanner(System.in); // membuat a Scanner object
        System.out.print("Masukan Nama Anda ? ");
 String orang = Agustav.nextLine(); // membaca input dari keyboard
 System.out.println("Nama ? : " + orang); //Output user input
 
 
 Scanner no= new Scanner(System.in); // membuat a Scanner object
        System.out.print("Masukan Nilai Anda ? ");
 String nilai = no.nextLine(); // membaca input dari keyboard
 System.out.println("Nilai ? : " + nilai); //Output user input
 
 int Nilai=85;
 if(Nilai<50){
 System.out.println("Tidak Lulus ");
 }
 else if(Nilai>=50 && Nilai<60){
 System.out.println("grade D ");
 }
 else if(Nilai>=60 && Nilai<70){
 System.out.println("grade C ");
 }
 else if(Nilai>=70 && Nilai<80){
 System.out.println("grade B ");
 }
 else if(Nilai>=80 && Nilai<90){
     System.out.println("grade A ");
 }else if(Nilai>=90 && Nilai<100){
 System.out.println("grade A+");
 }else{
 System.out.println("Data Nilai Salah !");
 }
 }
 }
