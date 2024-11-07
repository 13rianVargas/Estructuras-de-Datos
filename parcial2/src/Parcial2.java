import java.util.HashMap;
import java.util.Map;

public class Parcial2 {

    static HashMap<Integer, Visitante> visitantes = new HashMap<>(); 
    static double edadPromedio = 0;
    static int  cantidad20y25 = 0;

    public static void main(String[] args) {
        datosPrueba();

        edadPromedio = edadPromedio();
        System.out.println("\n\n\n\n\nLa edad promedio de los visitantes es: " + edadPromedio);
        
        System.out.println("\n\nVisitantes con edad inferior a la edad promedio son: ");
        edadInferior();

        cantidad20y25 = entre20y25();
        System.out.println("\n\nLa cantidad de visitantes con edad entre 20 y 25 años son: " + cantidad20y25);

        System.out.println("\n<> FIN <>\n");
        
    }
        
    private static int entre20y25() {

        for (Map.Entry<Integer, Visitante> v : visitantes.entrySet()) {
            if(v.getValue().getEdad() >= 20 &&  v.getValue().getEdad() <= 25){
                cantidad20y25++;
            }
        }
        return cantidad20y25;
    }
        
    private static void edadInferior() {

        for (Map.Entry<Integer, Visitante> v : visitantes.entrySet()) {
            if(v.getValue().getEdad() < edadPromedio){
                System.out.println("Nombre -> " + v.getValue().getNombre() + "| Edad -> " + v.getValue().getEdad());
            }
        }

    }
        
        
        
    public static double edadPromedio(){
        int edad;

        for (Map.Entry<Integer, Visitante> v : visitantes.entrySet()) {
            edad = v.getValue().getEdad();
            edadPromedio += edad;
        }

        return edadPromedio / visitantes.size();
    }

    public static void datosPrueba(){

        Visitante v1 = new Visitante("Brian", 23);
        Visitante v2 = new Visitante("Luis", 50);
        Visitante v3 = new Visitante("Sharina", 19);
        Visitante v4 = new Visitante("Carlos", 20);
        Visitante v5 =  new Visitante("Alejandra", 20);

        visitantes.put(1, v1);
        visitantes.put(2, v2);
        visitantes.put(3, v3);
        visitantes.put(4, v4);
        visitantes.put(5, v5);

    }

}
