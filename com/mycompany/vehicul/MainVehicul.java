/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public class MainVehicul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicul v1, v2, v3;
        Masina m1, m2, m3;
        Electrica e1, e2, e3;
        Trotineta t1, t2, t3;
        rotineta t1 = new Trotineta();
        Trotineta t2 = new Trotineta("Xiaomi", 1500.5f, 80, (byte) 60);
        Trotineta t3 = new Trotineta(t2);

        System.out.println("Trotineta 1: " + t1);
        System.out.println("Trotineta 2: " + t2);
        System.out.println("Trotineta 3: " + t3);
        
        System.out.println();
        System.out.println("Test reincarcare:");
        t1.reincarca();
        t2.reincarca();
        t3.reincarca();
    }
}

        v1=new Vehicul();
        v2=new Vehicul("Peugeot",3000.99f);
        v3=new Vehicul(v2);
        
        System.out.println("Vehicul 1 "+v1);
        System.out.println("Vehicul 2 "+v2);
        System.out.println("Vehicul 3 "+v3);
        
    }
    
}
