/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fap0kz.harcosvarazslo.modell;

/**
 *
 * @author neszterzsolt
 */
public class Harcos extends Karakterek {

    private String nev;
//    private final String HARCOS = "H";
    
    public Harcos() {
        super();
        this.nev = "H";
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    
    
}
