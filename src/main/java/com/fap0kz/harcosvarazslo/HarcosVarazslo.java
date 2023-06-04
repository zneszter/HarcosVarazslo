/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fap0kz.harcosvarazslo;

import com.fap0kz.harcosvarazslo.gui.Gui;

/**
 *
 * @author neszterzsolt
 */
public class HarcosVarazslo extends Multithreads {

    public static void main(String[] args) {
        System.out.println("Hello Játékosok !"); 
        Multithreads m1 = new Multithreads();
        Thread t1 = new Thread(m1);
        t1.setName("Thread GUI");
        new Gui().setVisible(true);
        t1.start();
    }
    

    
    @Override
    public void run() {
        
    }
}
