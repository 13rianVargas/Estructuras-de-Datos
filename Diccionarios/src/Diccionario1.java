import java.util.HashMap;
import java.util.Scanner;

public class Diccionario1 {
    public static HashMap<String,String> Traductor = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
    
        //Introduzca 6 palabras.
        putPalabras();

        //Entre una palabra (en español) por el teclado y obtenga su respectiva traducción.
        System.out.println(" >> Ingrese una palabra en español: ");
        String español = sc.nextLine();

        String ingles = Traductor.get(español);
        System.out.println(" >> La traduccion de " + español + " es: " + ingles);

        //Obtenga el HashCode del valor de una de las palabras del diccionario.
        System.out.println(" >> El HashCode de " + español + " es: " +  español.hashCode());

        sc.close();
    }

    public static void putPalabras(){
        Traductor.put("Purpura", "Purple");   
        Traductor.put("Lima", "Lime");   
        Traductor.put("Gris", "Gray");   
        Traductor.put("Cian", "Cyan");
        Traductor.put("Amarillo", "Yellow"); 
        Traductor.put("Turquesa", "Turquise");
    }
}
