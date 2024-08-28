
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan13soal1;

/**
 *
 * @author LENOVO
 */
 
class Calculator {
    // Method for adding two integers
   public int pertambahan(int a, int b) {
        return( a + b);
    }

    // Overloaded method for adding three integers
    public int pengurangan(int a, int b) {
        return (a - b);
    }   
     public int perkalian(int a, int b) {
        return (a * b);
     }
     public int pembagian(int a, int b){
         return (a / b);
}

public class Pertemuan13soal1 {
    public static void main(String[] args) {
        // Create an instance of CalculatorSederhana
        Calculator Calculator = new Calculator();
        
        // Call the overloaded methods
        System.out.println(Calculator.pertambahan(10, 20));    // Calls the method with two parameters
        System.out.println(Calculator.pengurangan(10, 20));
        System.out.println(Calculator.perkalian(10, 20));
        System.out.println(Calculator.pembagian(10,20));// Calls the method with three parameters
    }
}

   }
   
    

