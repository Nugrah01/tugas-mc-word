/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal2;

/**
 *
 * @author LENOVO
 */

        abstract class abstrakhewan {
// method abstract
 public abstract void suara();
}


        class burung extends abstrakhewan {
 public void suara(){
System.out.println("Suara burung mencicit");
 }
        }

 public class Pertemuan14soal2 {
 public static void main(String[] args) {
 // TODO code application logic here
 abstrakhewan objek=new burung();
 objek.suara();

    
        }
        }