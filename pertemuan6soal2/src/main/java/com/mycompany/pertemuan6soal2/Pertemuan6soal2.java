/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6soal2;
import java.util.Scanner; // Import library class Scanner
/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan6soal2 {
    public static String keterangan = "Lulus";
public static void main(String[] args) {
   Scanner inputnya= new Scanner(System.in); // membuat    a Scanner objec
        System.out.print("Masukan Nim Anda?   ");
String Agustav = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nim ? : " + Agustav ); //Output user input
System.out.print("Masukan Nama Anda?   ");
String Nama = inputnya.nextLine(); // membaca input dari keyboard
System.out.println("Nama ? : " + Nama ); //Output user input
        System.out.println("Nilai ?  : 85  ");

       int Nilai=75;
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
}
System.out.println("Keterangan : " + keterangan);
}

    }

