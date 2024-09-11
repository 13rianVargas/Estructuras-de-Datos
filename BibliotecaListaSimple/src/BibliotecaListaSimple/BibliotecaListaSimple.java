package BibliotecaListaSimple;
public class BibliotecaListaSimple {
    
    static Vista vista =new Vista();
    static ListaSimpleLink listaSimpleLink = new ListaSimpleLink();

    public static void main(String[] args) throws Exception {
        while (true) {
            int option = vista.menu();
            int cantidad = 0;

            switch (option) {
                case 1:
                    crearEstudiante();
                    break;

                case 2:
                    int opt = vista.menuContarTotal();
                    switch (opt) {
                        case 1:
                            cantidad = listaSimpleLink.ContarElementos();                
                            vista.mostrarMensaje("\n<> <> El total de estudiantes es: " + cantidad + "  <> <>");
                            cantidad = 0;
                            break;

                        case 2:
                            char ch = vista.pedirChar();
                            cantidad = listaSimpleLink.ContarElementos(ch);
                            vista.mostrarMensaje("\n<> <> El total de estudiantes es: " + cantidad + "  <> <>");
                            cantidad = 0;
                            break;

                        default:
                            System.out.println("Error en elegir sexo de Estudiante.");
                            break;
                    }
                    break;

                case 3:
                    double promedio = listaSimpleLink.calcularPromedio();
                    vista.mostrarMensaje("\n<> <> El promedio de consultas totales es: " + promedio + "  <> <>");
                    break;

                case 4:
                    Estudiante mayor = listaSimpleLink.calcularMayorConsulta();
                    vista.mostrarMensaje("\n<> <> El mayor consultador es: " + mayor.getNombre() + " con " + mayor.getLibrosConsultados() +" libros consultados <> <>");
                    break;

                case 5:
                    double prom = listaSimpleLink.calcularPromedio();
                    listaSimpleLink.mostarListaSuperiores(prom);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Error en opción del menú.");
                    break;

            }//cierra switch
    
        }//cierra while
        
    }//cierra main

    public static void crearEstudiante(){
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre= vista.pedirString();
        System.out.print("Ingrese cantidad de libros consultados: ");
        int librosConsultados= vista.pedirInt();
        System.out.print("Ingrese sexo del estudiante: ");
        char sexo = vista.pedirChar();
        Estudiante estudiante = new Estudiante(nombre, librosConsultados, sexo);
        listaSimpleLink.insertFinal(estudiante);

    }//cierra crearEstudiante

}//cierra class
