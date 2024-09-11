package BibliotecaListaSimple;
public class Nodo {
    
    private Estudiante Dato;
    private Nodo Next;

    public Nodo (Estudiante Dat, Nodo sig){
        Dato = Dat;
        Next = sig;
    }
    
    public Estudiante getDato(){
        return Dato;
    }
    
    public Nodo getSig(){
        return Next;
    }
    
    public void setDato(Estudiante elem){
        Dato = elem;
    }
    
    public void setNext(Nodo sig){
        Next = sig;
    }  
    
}
