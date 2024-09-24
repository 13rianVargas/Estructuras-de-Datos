
package colaarraylist;

import java.util.ArrayList;

public class ColaList {
   ArrayList<Clientes> cola;

    public ColaList() {
        this.cola = new ArrayList<>();
    }
  public void agregar(Clientes dat){
      cola.add(dat);
      
      System.out.println("Se agrego a la cola: " +  dat );
      
  }

  public boolean isEmpty(){
      return cola.isEmpty();
  }
  
  public Clientes peek(){
      if (isEmpty()) {
          System.out.println("La cola esta vacia.");
      }else{
          return cola.get(0);
      }
       return null;
  }
  public Clientes poll(){
      if (isEmpty()) {
          System.out.println("La cola esta vacia.");
      }else{
          return cola.remove(0);
      }
       return null;
   }
  public void mostrarCola(){
      if (cola.isEmpty()) {
        System.out.println("La cola está vacía.");
    } else {
        for (Clientes cliente : cola) {
            System.out.println(cliente);
        }
     }
  }
  
  public void mostrarUltimo() {
      if (isEmpty()) {
          System.out.println("La cola está vacía.");
          
      } else {
          System.out.println(cola.get(cola.size() - 1));  
      }
  }
}

