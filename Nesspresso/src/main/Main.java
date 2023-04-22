/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Cafetera;
import servicios.CafeteraServicio;

/**
 *
 * @author Miguel
 */
public class Main {
    public static void main(String[] args) {
        
    CafeteraServicio cafeservicio = new CafeteraServicio();
   
    Cafetera cafe1 = cafeservicio.llenarCafetera();
    cafeservicio.ServirTaza(cafe1);
    cafeservicio.vaciarCafetera(cafe1);
    cafeservicio.agregarCafe(cafe1);
    
    
    }
   
    
    
    
}
