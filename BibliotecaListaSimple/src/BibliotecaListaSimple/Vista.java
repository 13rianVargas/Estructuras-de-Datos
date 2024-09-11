package BibliotecaListaSimple;
import java.util.Scanner;
public class Vista {
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>        Elije una opción:         <>\n"
				+ " <> [1] Registrar nuevo estudiante   <>\n"
                + " <> [2] Mostrar total de consultas   <>\n"
                + " <> [3] Mostrar promedio consultas   <>\n"
                + " <> [4] Mostrar mayor consultador    <>\n"
                + " <> [5] Mostrar estudiantes con      <>\n"
                + " <> consultas superiores al promedio <>\n"
                + " <> [6] Salir                        <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		int option = sc.nextInt();
        sc.nextLine(); //clean sc
		return option;
    }

    public int menuContarTotal(){
        System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>      ¿Qué total desea ver?       <>\n"
				+ " <> [1] Total de estudiantes         <>\n"
                + " <> [2] Seleccionar sexo             <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
		int option = sc.nextInt();
        sc.nextLine(); //clean sc
		return option;
    }

    public String pedirString(){
        return sc.nextLine();
    }

    public int pedirInt(){
        int num = sc.nextInt();
        sc.nextLine(); //clean sc
        return num;
    }

    public char pedirChar(){
        System.out.print("\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n"
				+ " <>                                  <>\n"
				+ " <> Ingrese el sexo del estudiante:  <>\n"
				+ " <>   [F] Femenino. [M] Másculino.   <>\n"
				+ " <>                                  <>\n"
				+ " <> <> <> <> <> <> <> <> <> <> <> <> <>\n");
        char ch = sc.nextLine().charAt(0);
        //sc.nextLine(); //clean sc
        return ch;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
