/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fap0kz.harcosvarazslo.modell;

import com.fap0kz.harcosvarazslo.Multithreads;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 *
 * @author neszterzsolt
 */
public class Karakterek extends Multithreads {
    private int eletero;
    private String nev;
    private int pozicio;
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

    public int getPozicio() {
        return pozicio;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }
    
    
        
    public int eletero() {
        return (random.nextInt(6)+3);
    }
    
    public static int harc() {
//        Multithreads m2 = new Multithreads();
//        Thread t2 = new Thread(m2);
//        t2.setName("Harc thread");
//        t2.start();
        return (random.nextInt(6));
    }
    
    public static int lep(int HOSSZ) {
        return (random.nextInt(HOSSZ));
    }

    @Override
    public void run() {
            
            harc();
            
            
    }
    
}
