/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizadyacencia;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MatrizAdyacencia {

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
       
       int Ady[][]=new int[N][N];
       for (int i=0;i<N;i++)
           for (int j=0;j<N;j++)
               Ady[i][j]=0;
       
       while (A>0)
       {
         System.out.println("Origen: ");
         Origen=Sc.nextInt(); 
         System.out.println("Destino: ");
         Destino=Sc.nextInt(); 
         Ady[Origen][Destino]=1;
         Ady[Destino][Origen]=1;  // cuando es no dirigido
         A--;
       }
        System.out.println("Mostrar la Matriz de Adyacencia ");
      for (int i=0;i<N;i++)
       {
         for (int j=0;j<N;j++)
           System.out.print(Ady[i][j]+"  ");
        System.out.println("  ");
       }   
    }
    
}
