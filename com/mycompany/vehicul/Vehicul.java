/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
//

public class Vehicul implements Reincarcabil{

    public String marca;
    float pret;
    
    public Vehicul(){
        this.marca="Dacia";
        this.pret=0.0f;
    }
    
    public Vehicul(String marca, float pret){
        this.marca=marca;
        this.pret=pret;
    }
    public Vehicul(Vehicul other){
        this.marca=other.marca;
        this.pret=other.pret;
//getter David Dascalu
         public float getPret() {
        return pret;
    }
//getter David Dascalu
    }
    @Override
    public String toString(){
        return "Marca: "+marca+" pret="+pret;
    }
//getter Mihaluta
    public float getPret(){
        return pret;
    }
    @Override
    public void reincarca(){
        System.out.println("Nu se aplica");
    }

    @Override
    public void afiseazaDupaMarca(String marca) {
        if (this.marca != null && this.marca.equals(marca)) {
            System.out.println(this);
        }
    }

    @Override
    public void afiseazaDupaPret(float min, float max) {
        if (this.pret >= min && this.pret <= max) {
            System.out.println(this);
        }
    }
        //Cod Isaia George----
    public boolean verificaPretMaiMic(float pret) {
        if(this.pret < pret)
            return true;
        return false;
    }
    //Cod Isaia George ^
}
