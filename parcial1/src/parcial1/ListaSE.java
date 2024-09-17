package parcial1;

public class ListaSE {
   
    private Nodo primero;
   
     public ListaSE(){ 
        primero = null;
    }
     
    public void insertInicio (Participante Dat){
        Nodo nuevo = new Nodo (Dat, primero);
        primero = nuevo;
    } 
    
     public void insertFinal (Participante Dat){ 
        Nodo nuevo = new Nodo(Dat, null);
        if (primero == null){
        primero = nuevo;
        }
        else {
            Nodo actual = primero;
            while (actual.getSig()!= null){
                actual = actual.getSig();

            }
            actual.setNext(nuevo);
        }
    }
    
    public void borrar (Participante Dat){
        if (primero == null) 
            System.out.println("lista vacía");
        else
            if (primero.getDato()== Dat){
            primero = primero.getSig();
            }
            else {
                Nodo actual = primero;
                while (actual.getSig()!=null && actual.getSig().getDato() != Dat)
                 {
                   actual = actual.getSig(); 
                 }
                if (actual.getSig()== null )
                        System.out.println ("elemento "+Dat+" no esta en la lista");
                    else{
                        actual.setNext(actual.getSig().getSig());
                    }
            }
    }
    
        
    public void MostarLista(){
        Nodo actual = primero;
        while (actual!= null){
            System.out.println(actual.getDato());
            actual = actual.getSig();
        }
     } 
    
    public int tamaño(){
        int cont = 0;
        Nodo actual = primero;
        while (actual!= null){
            cont++;
            actual = actual.getSig();
        }
        return cont;
    }

    public double tiempoPromedio(){
        double tiempoParcial = 0;
        Nodo actual = primero;
        while (actual!= null){
            tiempoParcial += actual.getDato().getTiempoRealizado();
            actual = actual.getSig();
        }
        return tiempoParcial/tamaño();
    }

    public void mostrarNombreMenorQueElPromedio(){
        double promedio = tiempoPromedio();
        Nodo actual = primero;
        System.out.println("Menores que el promedio:");

        while (actual!= null){
            if (actual.getDato().getTiempoRealizado() < promedio){
                System.out.println(">> " + actual.getDato().getNombre());
                actual = actual.getSig();
            } else {
                actual = actual.getSig();
            }

        }
    }

    public Participante getUltimo(){ 
        Nodo actual = primero;
        Participante ultimo = actual.getDato();
        while (actual != null){
            if  (actual.getSig() == null){
                ultimo = actual.getDato();
                break;
            } else{
                actual = actual.getSig();
            }
        }
        return ultimo; 
    } 
}
