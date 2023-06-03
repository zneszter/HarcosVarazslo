/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fap0kz.harcosvarazslo.modell;

import java.util.Random;

/**
 *
 * @author neszterzsolt
 */
public class Karakterek {
    private int eletero;
    private String nev;
    public static Random random = new Random();


    public Karakterek() {
        this.eletero = eletero();
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }


    public int getEletero() {
        return eletero;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }
    
    
        
    public static int eletero() {
        return (random.nextInt(6)+3);
    }
    
    public static int harc() {
        return (random.nextInt(6));
    }
    
    public static int lep(int HOSSZ) {
        return (random.nextInt(HOSSZ));
    }
    
}
