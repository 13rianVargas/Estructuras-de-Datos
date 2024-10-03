/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplohtable2;

/**
 *
 * @author ASUS
 */
public class EjemploHTable2 {

    
    public static void main(String[] args) {
        HT h = new HT(15);
        h.put(80, "Agua");

        System.out.println("obteniendo elemento asociado a llave 80: " + h.get(80));
        
        h.put(40, "Ron Wisley");
        h.put(65, "Harry Potter");
        h.put(14, "Luna Lovegood");
        h.put(25, "Fresa");
        h.output();
        System.out.println("El codigo 25 es: " + h.get(25));
        System.out.println("Tamaño: " + h.size);
    }
    
}
