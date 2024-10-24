public class Arista {
    
    public int Origen, Destino;

    public Arista(int Origen, int Destino) {
        this.Origen = Origen;
        this.Destino = Destino;
    }

    @Override
    public String toString() {
        return "Arista [" + "Origen -> " + Origen + ", Destino -> " + Destino + ']';
    } 
    
}
