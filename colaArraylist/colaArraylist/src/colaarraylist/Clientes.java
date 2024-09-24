package colaarraylist;


public class Clientes {
    private String nombre;
    private int numTurno;

    public Clientes(String nombre, int numTurno) {
        this.nombre = nombre;
        this.numTurno = numTurno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", numTurno=" + numTurno + '}';
    }
    
    
}
