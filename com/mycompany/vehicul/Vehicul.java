/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
//

public class Vehicul {

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
    }
    @Override
    public String toString(){
        return "Marca: "+marca+" pret="+pret;
    }
}
