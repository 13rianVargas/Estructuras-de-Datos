/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorridosgrafos;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class RecorridosGrafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Grafo g=new Grafo();
        
        ArrayList<Integer> enAnchura=g.recorridoAnchura(1);//Nodo inicial 1
        System.out.println("Recorrido en anchura de un grafo representado como matriz iniciando en 1: ");
        for(int i=0;i<enAnchura.size();i++){
            System.out.print(""+enAnchura.get(i)+" ");
        }
        System.out.println(" ");
          Grafo g1=new Grafo();
         ArrayList<Integer> enAnchura1=g1.recorridoAnchura(3);//Nodo inicial 1
        System.out.println("Recorrido en anchura de un grafo representado como matriz iniciando en 3: ");
        for(int i=0;i<enAnchura1.size();i++){
            System.out.print(""+enAnchura1.get(i)+" ");
        }
      
        ArrayList<Integer> enProfundidad=g.recorridoProfunidad(0);//Nodo inicial 0
        System.out.println("");
        System.out.println("Recorrido en profundidad de un grafo representado como matriz iniciando en 0: ");
        for(int i=0;i<enProfundidad.size();i++){
            System.out.print(""+enProfundidad.get(i)+" ");
        }
    } 
        
   
}
