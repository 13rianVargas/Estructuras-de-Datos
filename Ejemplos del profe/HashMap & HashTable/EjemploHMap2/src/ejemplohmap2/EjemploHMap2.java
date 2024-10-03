/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohmap2;

import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class EjemploHMap2 {

    /**
     * Diccionario de traducción de palabras
     */
    public static void main(String[] args) {
        
         HashMap<String,String> MapTraduce = new HashMap();
    
        MapTraduce.put("Rojo", "Red");   
        MapTraduce.put("Verde", "Green");   
        MapTraduce.put("Negro", "Black");   
        MapTraduce.put("Rosado", "Pink");
        MapTraduce.put("Amarillo", "Yellow"); 
        MapTraduce.put("Blanco", "White");
        MapTraduce.put("Marrón", "Brown"); 
        
        System.out.println(MapTraduce.get("Rojo")); 
         System.out.println("El mapa tiene un tamaño de: "+MapTraduce.size()+" elementos");
        System.out.println("Elementos del mapa:");   
        System.out.println(MapTraduce); 
        MapTraduce.remove("Negro");
        System.out.println("Elementos del mapa después de eliminar la clave Negro");
        System.out.println(MapTraduce); 
    }
    
}
