package parcial1;

public class Participante {
    String nombre;
    int tiempoRealizado;

    public Participante() {
    }
    
    public Participante(String nombre, int tiempoRealizado) {
        this.nombre = nombre;
        this.tiempoRealizado = tiempoRealizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoRealizado() {
        return tiempoRealizado;
    }

    public void setTiempoRealizado(int tiempoRealizado) {
        this.tiempoRealizado = tiempoRealizado;
    }

    @Override
    public String toString() {
        return "participante [nombre=" + nombre + ", tiempoRealizado=" + tiempoRealizado + "]";
    }

}
