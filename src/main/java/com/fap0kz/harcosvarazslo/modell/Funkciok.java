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
public class Funkciok {
    
    public static Random random = new Random();
    
        
    public static int eletero() {
        return random.nextInt(6)+3;
    }
    
    
    
}
