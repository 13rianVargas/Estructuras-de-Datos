
package colaarraylist;

public class ColaArraylist {


    public static void main(String[] args) {
        // TODO code application logic here
        ColaList objColaList = new ColaList(); 
       System.out.println("Lista de turnos: ");
       Clientes objJU1 = new Clientes("Rodri", 1);
       objColaList.agregar(objJU1);
       Clientes objJU2 = new Clientes("Paula", 2);
       objColaList.agregar(objJU2);
       Clientes objJU3 = new Clientes("Ronal", 3);
       objColaList.agregar(objJU3);
       Clientes objJU4 = new Clientes("Aleja", 4);
       objColaList.agregar(objJU4);;
       Clientes objJU5 = new Clientes("Xiomara", 5);
       objColaList.agregar(objJU5);
        System.out.println(" ");
        System.out.println("");
        System.out.println("¿La cola esta vacia?: " + objColaList.isEmpty());
        System.out.println("Primer cliente de la cola: " + objColaList.peek());
        objColaList.mostrarCola();
         System.out.print("Último cliente de la cola: " );
          objColaList.mostrarUltimo();
        System.out.println("Primer cliente en atenderse: " + objColaList.poll());
        System.out.println("Cola actual despues de atenderse al primer cliente: ");
        objColaList.mostrarCola();
          System.out.print("Último cliente de la cola: " );
          objColaList.mostrarUltimo();
        System.out.println(" ");
        System.out.println("Segundo cliente en atenderse: " + objColaList.poll());
        System.out.println("Cola actual despues de atenderse al segundo cliente: ");
        objColaList.mostrarCola();
          System.out.print("Último cliente de la cola: " );
          objColaList.mostrarUltimo();
         System.out.println(" ");
        System.out.println("Tercer cliente en atenderse: " + objColaList.poll());
        System.out.println("Cola actual despues de atenderse al tercer cliente: ");
        objColaList.mostrarCola();
          System.out.print("Último cliente de la cola: " );
          objColaList.mostrarUltimo();
         System.out.println(" ");
        System.out.println("Cuarto cliente en atenderse: " + objColaList.poll());
        System.out.println("Cola actual despues de atenderse al cuerto cliente: ");
        objColaList.mostrarCola();
          System.out.print("Último cliente de la cola: " );
         objColaList.mostrarUltimo();
         System.out.println(" ");
        System.out.println("quinto cliente en atenderse: " + objColaList.poll());
        System.out.println("Cola actual despues de atenderse al quinto cliente: ");
        objColaList.mostrarCola();
        System.out.print("Último cliente de la cola: " );
         objColaList.mostrarUltimo();

        
    }
    
}
