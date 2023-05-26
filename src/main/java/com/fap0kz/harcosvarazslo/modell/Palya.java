/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fap0kz.harcosvarazslo.modell;

/**
 *
 * @author neszterzsolt
 */
public class Palya {
    
    private final String HARCOS = "H", VARAZSLO = "V", URES = "_", HARC = "X";
    private final int HOSSZ = 3;
    private String[] mezok = new String[HOSSZ];
    
    public Palya() {
        for(int i = 0; i < HOSSZ; i++) mezok[i] = URES;
    }
    
    
    public Palya(String[] mezok){
        this.mezok = mezok;
    }

    public String getHARCOS() {
        return HARCOS;
    }

    public String getVARAZSLO() {
        return VARAZSLO;
    }

    public String getURES() {
        return URES;
    }

    public String getHARC() {
        return HARC;
    }

    public int getHOSSZ() {
        return HOSSZ;
    }
    
    
    
}
