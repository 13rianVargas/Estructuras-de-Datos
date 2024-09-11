package AlumnosListaSimple;
public class Nodo {
    
    private Alumno Dato;
    private Nodo Next;

    public Nodo (Alumno Dat, Nodo sig){
        Dato = Dat;
        Next = sig;
    }
    
    public Alumno getDato(){
        return Dato;
    }
    
    public Nodo getSig(){
        return Next;
    }
    
    public void setDato(Alumno elem){
        Dato = elem;
    }
    
    public void setNext(Nodo sig){
        Next = sig;
    }  
    
}
