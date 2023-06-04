/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fap0kz.harcosvarazslo.modell;

import com.fap0kz.harcosvarazslo.Multithreads;
/**
 *
 * @author neszterzsolt
 */
public class Palya {

    

    private final String URES = "_";
    private String HARC;
    private final int HOSSZ = 3;
    private String[] mezok = new String[HOSSZ];
    
    public Palya() {
        for(int i = 0; i < HOSSZ; i++) mezok[i] = URES;
        this.HARC = "X";
    }
    
    
    public Palya(String[] mezok){
        this.mezok = mezok;
    }


    public String getURES() {
        return URES;
    }


    public int getHOSSZ() {
        return HOSSZ;
    }

    public String getHARC() {
        return HARC;
    }
    

    public String[] getMezok() {
       return mezok;
    }


     
}
