package alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    static Scanner sc = new Scanner(System.in);

    // - // - // NOMBRES // - // - //
    // Nicoll Alejandra Durán Quintero
    // 506232726
    // Brian Steven Vargas Clavijo
    // 506232730
    
    public static void main(String[] args) {

        String Nombre;
        char Sexo;
        int Edad;

        DatAlumno aux;

        ArrayList<DatAlumno> Alumnos = new ArrayList();

        System.out.print("Cantidad de Alumnos: ");
        int n = sc.nextInt();
        

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Alumno: " + i + "\n");
            
            System.out.println("Nombre: ");
            Nombre = sc.nextLine();
            System.out.println("Edad: ");
            Edad = sc.nextInt();
            System.out.println("Sexo: ");
            Sexo = sc.next().charAt(0);

            aux = new DatAlumno(Nombre, Sexo , Edad); // Se crea un objeto DatAlumno y se asigna su referencia a aux
            Alumnos.add(aux);
        }


        for (int i = 0; i < Alumnos.size(); i++) {
            System.out.println("Alumno: " + (i + 1));
            System.out.print("Nombre: " + Alumnos.get(i).getNombre());
            System.out.print("   Sexo: " + Alumnos.get(i).getSexoe());
            System.out.println("    Edad: " + Alumnos.get(i).getEdad());
        }
        
        System.out.println("Nombre de estudiante a buscar: ");
        sc.nextLine();
        String nombrexd = sc.nextLine();
    
        for (int i = 0; i < Alumnos.size(); i++) {
            if (Alumnos.get(i).getNombre().equals(nombrexd)) {
                System.out.println(Alumnos.get(i).getNombre() + ", sí está");
            }
        }

        int contadorSexoM = 0;
        int contadorSexoF = 0;

        for (int i = 0; i < Alumnos.size(); i++) {
            if (Alumnos.get(i).getSexoe() ==  'M' ||  Alumnos.get(i).getSexoe() == 'm') {
                contadorSexoM -= -1;
            }else if (Alumnos.get(i).getSexoe() ==  'F'  ||  Alumnos.get(i).getSexoe() == 'f') {
                contadorSexoF -= -1;
            }
        }

        System.out.println("Estudiantes hombres: " + contadorSexoM +"\nEstudiantes mujeres: " + contadorSexoF);

        int contadorEdad = 0;

        for (int i = 0; i < Alumnos.size(); i++) {
            contadorEdad  += Alumnos.get(i).getEdad();
        }
        
        System.out.println("El promedio de edades es: " + contadorEdad/n);

        System.out.println("El estudiante eliminado es: "+Alumnos.remove(n-1).getNombre());
        System.out.println("El estudiante eliminado es: "+Alumnos.remove(n-2).getNombre());

        for (DatAlumno datAlumno : Alumnos) {
            System.out.println(datAlumno.getNombre());
        }
    }

}
