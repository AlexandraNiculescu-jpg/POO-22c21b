/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public class Trotineta extends Vehicul implements Reincarcabil{
    int capacitateBaterie;
    byte autonomieAcumulator;
    
    public Trotineta(){
        super();
        this.capacitateBaterie=50;
        this.autonomieAcumulator=50;
    }
    
    public Trotineta(String marca, float pret,int capacitateBaterie, byte autonomieAcumulator){
        super(marca,pret);
        this.capacitateBaterie=capacitateBaterie;
        this.autonomieAcumulator=autonomieAcumulator;
    }
    
    public Trotineta(Trotineta other){
        super(other);
        this.capacitateBaterie=other.capacitateBaterie;
        this.autonomieAcumulator=other.autonomieAcumulator;
    }
    
    @Override
    public String toString(){
        return super.toString()+" capacitate baterie"+ capacitateBaterie+ "autonomie acumulator="+ autonomieAcumulator;
    }
    
    @Override
    public void reincarca(){
       System.out.println("Perioada de incarcare="+capacitateBaterie/2);
    }
}
