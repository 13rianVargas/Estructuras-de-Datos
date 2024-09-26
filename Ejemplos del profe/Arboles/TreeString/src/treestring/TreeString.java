/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treestring;

/**
 *
 * @author ASUS
 */
public class TreeString {

    /**
     * @param args the command line arguments
     */
    
    /*
    Regla para la construcción del árbol
    
    En la creación del árbol el primer nodo que se crea se establece como raíz y a partir de ahí
    el resto de los nodos se ubican a las izquierda si son menores y a la derecha si son mayores
    
    Los nodos del árbol son tipo String
    */
    public static void main(String[] args) {
        
        ArbolCadenas arbol = new ArbolCadenas();
        arbol.insertar("H");
        arbol.insertar("C");
        arbol.insertar("M");
        arbol.insertar("A");
        arbol.insertar("D");
        arbol.insertar("J");
        arbol.insertar("T");
        System.out.println("Nodo Raíz:"+arbol.getRaiz().toString());
        System.out.println("Recorrido inorden:");
        arbol.inorden();
        System.out.println("Recorrido postorden:");
        arbol.postorden();
        System.out.println("Recorrido preorden:");
        arbol.preorden();
        System.out.println(arbol.existe("Z")); // false
        System.out.println(arbol.existe("D")); // true
        System.out.println(arbol.existe("X")); // false
    }
    
}
