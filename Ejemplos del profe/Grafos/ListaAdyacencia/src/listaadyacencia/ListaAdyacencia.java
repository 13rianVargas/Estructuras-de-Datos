/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaadyacencia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ListaAdyacencia {

    /**
     * @param args the command line arguments
     */
    
   // static int N, A; // N= cantidad de nodos  A=cantidad de aristas
    static int Max=100; // Cantidad máxima de nodos
    
    public static void main(String[] args) {
        
       int Origen, Destino;
       Scanner Sc=new Scanner (System.in);
       System.out.println("Cantidad de Nodos: ");
       int N=Sc.nextInt();  // N= cantidad de nodos
       System.out.println("Cantidad de aristas: "); 
       int A=Sc.nextInt();   // A=cantidad de aristas
       ArrayList<Integer> Ady[]=new ArrayList[N];

       for (int i=0;i<N;i++) //inicializa la lista
         Ady[i] =new ArrayList<Integer>(); 
       
      while (A>0)
       {
         System.out.println("Origen: ");
         Origen=Sc.nextInt(); 
         System.out.println("Destino: ");
         Destino=Sc.nextInt(); 
         Ady[Origen].add(Destino);
         Ady[Destino].add(Origen); // cuando es no dirigido
         A--;
       }
      
      System.out.println("Mostrar la lista de Adyacencia ");
      for (int i=0;i<N;i++)
       {
        System.out.println("Nodo: "+i+" ----->"+Ady[i].toString());  
       }  
    }
    
}
