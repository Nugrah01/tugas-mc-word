/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan12soal1;

/**
 *
 * @author Thinkpad-T450
 */
public class Pertemuan12soal1 {
    public static void main(String[] args) {
        Pegawaitetap Pegawai = new Pegawaitetap("001",  "System Analyst", 4000000,40000,50000,1000000);
        
        System.out.println("Gaji System Analyst: " + Pegawai.gajisystemanalyst);
        System.out.println("Bonus System Analyst: " + Pegawai.bonus);
        System.out.println("Tunjangan Makan: " + Pegawai.tunjanganMakan);
        System.out.println("Transport: " + Pegawai.transport);
        System.out.println("Gaji Total: " + Pegawai.hitunggajitotal());
    }
}
    
class Pegawai {
    
    double gajisystemanalyst;      
    double tunjanganMakan;  
    double transport;       

public Pegawai (double gajisystemanalyst, double tunjanganMakan, double transport){
 this.gajisystemanalyst = gajisystemanalyst;
 this.tunjanganMakan = tunjanganMakan;
 this. transport = transport;
}
}

class Pegawaitetap extends Pegawai {
    double bonus; 

    public Pegawaitetap(String id, String jabatan, double gajisystemanalyst, double tunjanganMakan, double transport, double bonus) {
        super(gajisystemanalyst, tunjanganMakan, transport);
        this.bonus = bonus;
    }
        public double hitunggajitotal() {
            return gajisystemanalyst + bonus + tunjanganMakan + transport;
        }
}
