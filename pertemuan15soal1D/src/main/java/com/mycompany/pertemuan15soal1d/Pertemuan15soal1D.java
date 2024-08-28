/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan15soal1d;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
    class kalkulator {
 public int pengurangan(int a, int b){
return a-b;
 }
 public float perkalian(int a, int b){
return a*b;
 }
 public float pembagian(float a, float b){
return a/b;
 }
    }    
public class Pertemuan15soal1D {
    public static void main(String[] args) {
       Scanner mahasiswa= new Scanner(System.in); // membuat a Scanner object
        System.out.print("Masukan Nim Anda ? ");
 String nim = mahasiswa.nextLine(); // membaca input dari keyboard
 System.out.println("Nim ? : " + nim); //Output user input
 
 kalkulator obj = new kalkulator();
System.out.println(obj.pengurangan(10, 20));
System.out.println(obj.perkalian(10, 20));
System.out.println(obj.pembagian(10, 20));

    }
}
