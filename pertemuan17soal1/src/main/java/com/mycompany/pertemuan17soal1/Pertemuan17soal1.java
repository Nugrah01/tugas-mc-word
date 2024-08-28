/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan17soal1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pertemuan17soal1 {

    public static void main(String[] args) {
        
        Scanner inputnya= new Scanner(System.in); // membuat    a Scanner objec
        System.out.print("Masukan jumlah kota?   ");
String Agustav = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Jumlah kota  : " + Agustav ); //Output user input

System.out.print("Masukan Nama-nama kota?   ");
String Nama = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nama-nama kota : " + Nama ); //Output user input

        String[] kota = {"Jakarta","Bandung", "Surabaya", "Makasar"};
        for(int i=0; i<kota.length; i++)
 System.out.println(kota[i]);
    }
}
