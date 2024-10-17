import java.util.*;

public class Diccionario2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n >> Ingrese una palabra para separar por comas: ");
        String oracion = sc.nextLine();
        String modificada = oracion.replace(" ","");

        String word[] = modificada.split(",");

        //Determine la cantidad de palabras del listado.
        System.out.println("\n >>Las palabras separadas por coma de la oración son: " + word.length);

        //Utilizando el diccionario del punto 1, muestre la traducción de cada palabra.
        Diccionario1.putPalabras();

        HashMap<Integer, String> palabrasNoEncontradas = new HashMap<>();
        
        int contador = 1;

        System.out.println("\n-----------Traducciones del Diccionario Spanish/English-----------");
        for (String w :  word) {
            boolean encontrada = false;
            for (Map.Entry<String, String> entrada : Diccionario1.Traductor.entrySet()) {

                if(entrada.getKey().equals(w) || entrada.getValue().equals(w)){
                    System.out.println(" >> Valor de ["+ entrada.getKey() + "]: " + entrada.getValue());
                    encontrada = true;
                    break;
                }//if
            }//for
            if (!encontrada) {
                palabrasNoEncontradas.put(contador, w);
            }
            contador++;
        }//for
        System.out.println("------------------------------------------------------------------\n");

        //Determine la cantidad de palabras que no se encuentran en el diccionario.
        System.out.println("\n >> El número de palabras que no se encuentran en el diccionario es: " + palabrasNoEncontradas.size());

        //Incorpore al diccionario la traducción de las palabras que no se encuentra (lea a través del teclado la palabra en inglés).
        for (Map.Entry<Integer, String> entrada : palabrasNoEncontradas.entrySet()) {
            System.out.println("\n >> Ingrese la traducción de " + entrada.getValue() + ": ");
            String traduccion = sc.nextLine();
            Diccionario1.Traductor.put(traduccion, entrada.getValue());
        }
        
        System.out.println("\n-----------NUEVAS Traducciones del Diccionario Spanish/English-----------");
        for (Map.Entry<String, String> entrada : Diccionario1.Traductor.entrySet()) {
            System.out.println(" >> Valor de ["+ entrada.getKey() + "]: " + entrada.getValue());
        }
        System.out.println("---------------------------------------------------------------------------\n");

        //Muestre el HashCode de todas las palabras de la lista.
        System.out.println("\n-----------HashCode Traducciones del Diccionario Spanish/English-----------");
        for (Map.Entry<String, String> entrada : Diccionario1.Traductor.entrySet()) {
            System.out.println(" >> El HashCode de [ " + entrada.getKey() + " - " +  entrada.getValue() +" ] es -> " +  entrada.hashCode());
        }
        System.out.println("---------------------------------------------------------------------------\n");


        sc.close();
    }
}
