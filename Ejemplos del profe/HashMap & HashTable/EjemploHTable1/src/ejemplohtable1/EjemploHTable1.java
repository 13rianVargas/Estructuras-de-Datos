/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohtable1;

import java.util.Hashtable;

/**
 *
 * @author ASUS
 */
public class EjemploHTable1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Hashtable<String,String> paises = new Hashtable<>();
        paises.put("ES", "España");
        paises.put("UK", "Reino Unido");
        paises.put("US", "Estados Unidos");
        paises.put("FR", "Francia");
        paises.put("CO", "Colombia");
        paises.put("CU", "Cuba");
        System.out.println("El codigo US es: " + paises.get("US"));
        System.out.println("Tamaño: " + paises.size());
        System.out.println("Elementos: " + paises);
        if (paises.containsKey("ES"))
              System.out.println("El código ES si está en la tabla " );
           else
             System.out.println("El código ES no está en la tabla " );
        if (paises.containsValue("España"))
              System.out.println("El valor España si está en la tabla " );
           else
             System.out.println("El valor España ES no está en la tabla " ); 
    }
    
}
