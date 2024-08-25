// - // - // - // Nombres y Códigos // - // - // - //

//  Nicole Alejandra Durán Quintero   - 506232726 //
//    Brian Steven Vargas Clavijo     - 506232730 //
// Daniel Felipe Betancourt Rodríguez - 506232008 //

public class Principal {
    public static void main(String[] args) {

        // - // - // - // Creación de Objetos // - // - // - //

        // nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion, tipoDe(segun tipoDeportista) //

        Deportista A = new Gimnasta ("Angel Gabriel", "Barajas Vivas", 100982345, 17, "Gimnasia Artística", 'M', "Colombia", "Plata", 14.533 ,"Barra Fija Masculino");

        Deportista B = new Nadador ("Sarah Frederica", "Sjöström", 90723435, 30, "Natación", 'F', "Suecia", "Oro", 23.71 ,"50m Estilo Libre Femenino");

        Deportista C = new Tenista("María Camila", "Osorio Serrano", 199078122, 22, "Tenis", 'F',"Colombia", "No gano medallas", 84 , "Individual Femenino");

        Deportista D = new Boxeador("Lewis", "Richardson", 890039193, 27, "Boxeo", 'M', "Inglaterra", "Bronce", 3.181, "Peso Wélter Masculino");


        // - // - // - // Uso de Objetos // - // - // - //

        System.out.println(A.mostrarDatos());

        System.out.println(B.mostrarDatos());
        
        System.out.println(C.mostrarDatos());

        System.out.println(D.mostrarDatos());

    }
}
