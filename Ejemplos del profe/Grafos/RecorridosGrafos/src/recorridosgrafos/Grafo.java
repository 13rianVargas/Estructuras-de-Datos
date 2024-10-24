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
public class Grafo {
    
     public int[][] g = {{0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 1},
                        {0, 0, 0, 1, 0}};
    private boolean[] visitiadoAnchura = new boolean[5];
    private boolean[] visitiadoProfunidad = new boolean[5];
    
    public Grafo() {
    }

    public int[][] getG() {
        return g;
    }
    
    public ArrayList<Integer> recorridoAnchura(int nodoI) {
        
        ArrayList<Integer> recorridos = new ArrayList<>(); //Lista donde guardan los nodos recorridos
        visitiadoAnchura[nodoI] = true;  //El nodo inicial se establece como visitado
        ArrayList<Integer> cola = new ArrayList<>();  //Cola de visitas de los nodos adyacentes
        recorridos.add(nodoI);  //se guarda el nodo como ya recorrido
        cola.add(nodoI);       //Se agrega el nodo a la cola de visitas
        while (!cola.isEmpty()) //Hasta que visite todos los nodos
          {
            int j = cola.remove(0); //Se saca el primero nodo de la cola
            for (int i = 0; i < g.length; i++)  //Se busca en la matriz que representa el grafo los nodos adyacentes
             {
                if (g[j][i] != 0 && !visitiadoAnchura[i]) //Si es un nodo adyacente y no está visitado entonces
                   {
                    cola.add(i);//Se agrega a la cola de visitas
                    recorridos.add(i);//Se marca como recorrido
                    visitiadoAnchura[i] = true;//Se marca como visitado
                  }
             }
           }
        return recorridos;//Devuelvo el recorrido del grafo en anchura
    }
    
    
    public ArrayList<Integer> recorridoProfunidad(int nodoI) {

        ArrayList<Integer> recorridos = new ArrayList<>(); //Lista donde guardo los nodos recorridos
        visitiadoProfunidad[nodoI] = true;  //El nodo inicial ya está visitado
        ArrayList<Integer> cola = new ArrayList<>();  //Cola de visitas de los nodos adyacentes
        recorridos.add(nodoI);//Listo el nodo como ya recorrido
        cola.add(nodoI);//Se agrega el nodo a la cola de visitas
        while (!cola.isEmpty()) //Hasta que visite todos los nodos
          {
            int j = cola.remove(0);//Se saca el primer nodo de la cola
            for (int i = 0; i < g.length; i++)   //Se busca en la matriz que representa el grafo los nodos adyacentes
              { 
                if (g[j][i] == 1 && !visitiadoProfunidad[i]) //Si es un nodo adyacente y no está visitado entonces
                     {
                       cola.add(i);//Se agrega a la cola de visita
                       recorridos.addAll(recorridoProfunidad(i));  
                       visitiadoProfunidad[i] = true;//Se marca como visitado
                     }
               }
           }
        return recorridos;//Se devuelve el recorrido del grafo en profundidad
    }
    
    
    
}
