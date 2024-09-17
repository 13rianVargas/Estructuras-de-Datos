package parcial1;
import java.util.Scanner;
public class Parcial {
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {
        ListaSE listaSE = new ListaSE();

        while (true) {
            int opt = menu();

            switch (opt) {
                case 1:
                    Participante participante = crearParticipante();
                    listaSE.insertFinal(participante);
                    break;
                case 2:
                    double promedio = listaSE.tiempoPromedio();
                    System.out.println("El tiempo promedio de los participantes es: " + promedio);
                    break;
                case 3:
                    listaSE.mostrarNombreMenorQueElPromedio();
                    break;
                case 4:
                    Participante ultimo = listaSE.getUltimo();
                    listaSE.borrar(ultimo);
                    ultimo = listaSE.getUltimo();
                    listaSE.borrar(ultimo);
                    System.out.println("\nLista de participantes:");
                    listaSE.MostarLista();
                    break;
                case 5:
                    System.out.println(">> FIN <<");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error en la opción");
                    break;
            }
        }

        


    }

    public static int menu(){
        System.out.println("\nSeleccione una opción.");
        System.out.println("[1] Agregar participante");
        System.out.println("[2] Calcular tiempo promedio");
        System.out.println("[3] Mostar participantes con tiempo menor que el promedio.");
        System.out.println("[4] Eliminar de la lista los últimos 2 participantes");
        System.out.println("[5] Salir\n");
        int opt = sc.nextInt();
        sc.nextLine();
        return opt;
    }

    public static Participante crearParticipante(){
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese tiempo realizado en minutos: ");
        int  tiempo = sc.nextInt();
        sc.nextLine();//salto de linea
        Participante participante = new Participante(nombre, tiempo);
        return  participante;
    } 
}
