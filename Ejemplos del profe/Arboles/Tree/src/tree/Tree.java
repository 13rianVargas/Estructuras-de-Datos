/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author ASUS
 */
public class Tree {

    /**
     * @param args the command line arguments
     */
    
    /*
    Regla para la construcción del árbol
    
    En la creación del árbol el primer nodo que se crea se establece como raíz y a partir de ahí
    el resto de los nodos se ubican a las izquierda si son menores y a la derecha si son mayores
    
    Los nodos del árbol son tipo int (enteros)
    */
    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        arbol.insertar(20);
        arbol.insertar(30);
        arbol.insertar(10);
        arbol.insertar(15);
        arbol.insertar(5);
        arbol.insertar(40);
        arbol.insertar(25);
        System.out.println("Recorrido inorden:");
        arbol.inorden();
        System.out.println("Recorrido postorden:");
        arbol.postorden();
        System.out.println("Recorrido preorden:");
        arbol.preorden();
        System.out.println(arbol.existe(40)); // true
        System.out.println(arbol.existe(7)); // false
        System.out.println(arbol.existe(15)); // true 
        
        
    }
    
}
