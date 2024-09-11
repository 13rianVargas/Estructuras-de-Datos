package BibliotecaListaSimple;
public class ListaSimpleLink {
   
    private Nodo primero;
   
     public ListaSimpleLink(){ 
        primero = null;
    }
     
    public void insertInicio (Estudiante Dat){
        Nodo nuevo = new Nodo (Dat, primero);
        primero = nuevo;
    } 
    
     public void insertFinal (Estudiante Dat){ 
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
    
    public int ContarElementos(){
        int Cant = 0;
        Nodo actual = primero;
            while (actual!= null){
                Cant++;
                actual = actual.getSig();
            }
        return Cant;
    }

    public int ContarElementos(char sex){
        int Cant = 0;
        Nodo actual = primero;
            while (actual!= null){
                if (actual.getDato().getSexo() == sex){
                    Cant++;
                }
                actual = actual.getSig();
            }
        
        return Cant;
    } 
    
    public void borrar (String Dat){
        if (primero == null) 
            System.out.println("lista vacía");
        else
            if (primero.getDato().getNombre().equals(Dat)){
            primero = primero.getSig();
            }
            else {
                Nodo actual = primero;
                while (actual.getSig()!=null && !(actual.getSig().getDato().getNombre().equals(Dat))){
                   actual = actual.getSig(); 
                 }
                if (actual.getSig()== null )
                        System.out.println ("elemento "+Dat+" no esta en la lista");
                    else{
                        actual.setNext(actual.getSig().getSig());
                    }
            }
    }
    
     public boolean ListaVacia(){
       
        if (primero==null)
              return true;
         else
              return false;   
    } 
     
    public void mostarLista(){

        Nodo actual = primero;
        while (actual!= null){
            System.out.println(actual.getDato());
            actual = actual.getSig();
        }
    }

    public void mostarListaSuperiores(double promedio){

        Nodo actual = primero;
        while (actual!= null){
            if (actual.getDato().getLibrosConsultados() > promedio) {
                System.out.println("<> <> " + actual.getDato().getNombre() + " => " + actual.getDato().getLibrosConsultados() + " libros consultados <> <>");
            }
            actual = actual.getSig();
        }
    }

    public double calcularPromedio(){
        int suma = 0;
        int cont = 0;
        Nodo actual = primero;
        while (actual!= null){
            suma += actual.getDato().getLibrosConsultados();
            cont++;
            actual = actual.getSig();
        }
        return suma/cont;
    }

    public Estudiante calcularMayorConsulta(){
        int max = 0;
        Nodo actual = primero;
        Estudiante mayor = actual.getDato();
        while (actual!= null){
            if (actual.getDato().getLibrosConsultados() > max) {
                max = actual.getDato().getLibrosConsultados();
                mayor = actual.getDato();
            }
            actual = actual.getSig();
        }
        return mayor;
    }
}
