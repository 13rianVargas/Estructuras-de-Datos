/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaaristas;

/**
 *
 * @author ASUS
 */
public class Arista {
    
    public int Origen, Destino;

    public Arista(int Origen, int Destino) {
        this.Origen = Origen;
        this.Destino = Destino;
    }

    @Override
    public String toString() {
        return "Arista{" + "Origen=" + Origen + ", Destino=" + Destino + '}';
    }
    
    
    
}
