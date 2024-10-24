/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaaristas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ListaAristas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int Origen, Destino;
       Scanner Sc=new Scanner (System.in);
       System.out.println("Cantidad de Nodos: ");
       int N=Sc.nextInt();  // N= cantidad de nodos
       System.out.println("Cantidad de aristas: "); 
       int A=Sc.nextInt();   // A=cantidad de aristas
       
       ArrayList<Arista> Ar=new ArrayList<>();
       
       while (A>0)
       {
         System.out.println("Origen: ");
         Origen=Sc.nextInt(); 
         System.out.println("Destino: ");
         Destino=Sc.nextInt();
         Ar.add(new Arista(Origen,Destino));
         Ar.add(new Arista(Destino,Origen)); // cuando es no dirigido
         A--;
       }
       
       for (int i=0;i<Ar.size();i++)
            System.out.println(Ar.get(i).toString());  
          
    }
    
}
