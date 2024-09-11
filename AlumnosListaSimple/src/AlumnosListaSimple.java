import java.util.Scanner;
public class AlumnosListaSimple {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ListaSimpleLink listaSimpleLink = new ListaSimpleLink();
        
        String nombre= "Bri";
        int edad = 23;
        char sexo = 'M';
        String programa = "Ingeniería de Sistemas";
        Estudiante alumno1 = new Estudiante(nombre, edad, sexo, programa);
        listaSimpleLink.insertInicio(alumno1);

        nombre= "Aleja";
        edad = 21;
        sexo = 'F';
        programa = "Ingeniería de Sistemas";
        Estudiante alumno2 = new Estudiante(nombre, edad, sexo, programa);
        listaSimpleLink.insertInicio(alumno2);

        nombre= "Sharina";
        edad = 19;
        sexo = 'F';
        programa = "Ingeniería de Sistemas";
        Estudiante alumno3 = new Estudiante(nombre, edad, sexo, programa);
        listaSimpleLink.insertInicio(alumno3);

        nombre= "Camilo";
        edad = 19;
        sexo = 'M';
        programa = "Ingeniería de Sistemas";
        Estudiante alumno4 = new Estudiante(nombre, edad, sexo, programa);
        listaSimpleLink.insertInicio(alumno4);

        listaSimpleLink.MostarLista();
        System.out.println("\n// - // - // - // - // - // - //\n");

        System.out.print("Ingrese nombre para eliminar: ");
        String nombreBuscar = sc.nextLine();
        listaSimpleLink.borrar(nombreBuscar);
        
        listaSimpleLink.MostarLista();
        System.out.println("\n// - // - // - // - // - // - //\n");

        nombre= "Nicoll";
        edad = 21;
        sexo = 'F';
        programa = "Ingeniería de Sistemas";
        Estudiante alumno5 = new Estudiante(nombre, edad, sexo, programa);
        listaSimpleLink.insertFinal(alumno5);

        nombre= "Steven";
        edad = 23;
        sexo = 'M';
        programa = "Psicología";
        Estudiante alumno6 = new Estudiante(nombre, edad, sexo, programa);
        listaSimpleLink.insertFinal(alumno6);

        listaSimpleLink.MostarLista();
        System.out.println("\n// - // - // - // - // - // - //\n");

        System.out.print("Ingrese genero para contar (F ó M): ");

        char sexoBuscar = sc.nextLine().charAt(0);
        if (sexoBuscar == 'F') {
            System.out.println("La cantidad de mujeres es: " + listaSimpleLink.ContarElementos(sexoBuscar));    
        }
        if (sexoBuscar == 'M') {
            System.out.println("La cantidad de hombres es: " + listaSimpleLink.ContarElementos(sexoBuscar));    
        }
        
        listaSimpleLink.calcularEdadPromedio();

        sc.close();
    }
}
