/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal1;

/**
 *
 * @author LENOVO
 */

        abstract class harimau {
// method abstract
public abstract void suara();
 public void nonsuara2(){
 System.out.println(" ini method konkrit dari parent class");
    }
        }
        
         class kucing extends harimau{
            public void suara() {
                System.out.println("suara kucing mengeong");
            }
         }
            
public class Pertemuan14soal1 {
            public static void main(String[] args) {
                harimau hewan = new kucing();
                hewan.nonsuara2();
                                hewan.suara();

            }
        }
    
