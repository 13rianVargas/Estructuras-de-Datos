/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohmap1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class EjemploHMap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       HashMap<Integer,String> Frutas=new HashMap<>();
        Frutas.put(100,"Mango");
        Frutas.put(104,"Naranja"); 
        Frutas.put(101,"Fresa");
        Frutas.put(102,"Manzana");
        System.out.println("El mapa tiene un tamaño de: "+Frutas.size()+" elementos");
        if (Frutas.isEmpty())
             System.out.println("El mapa está vacio");
          else
            System.out.println("El mapa no está vacio");
        
        System.out.println("La fruta con código 104 es : "+Frutas.get(104));
        System.out.println("-----------Contenido del Hash map-----------");
        for (Map.Entry m:Frutas.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }  
    }
    
}
