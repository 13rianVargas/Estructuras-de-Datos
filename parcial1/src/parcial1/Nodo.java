package parcial1;


public class Nodo {
    
    private Participante Dato;
    private Nodo Next;

    public Nodo (Participante Dat, Nodo sig){
        Dato = Dat;
        Next = sig;
    }
    
    public Participante getDato(){
        return Dato;
    }
    
    public Nodo getSig(){
        return Next;
    }
    
    public void setDato(Participante elem){
        Dato = elem;
    }
    
    public void setNext(Nodo sig){
        Next = sig;
    }  
    
}
