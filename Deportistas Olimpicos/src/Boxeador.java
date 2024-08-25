public class Boxeador extends Deportista {
    
    // - // - // - // Atributos // - // - // - //
    private String categoriaCompeticion;

    
    // - // - // - // Constructor // - // - // - //
    public Boxeador(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais, String medalla, double puntuacion, String categoriaCompeticion) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.categoriaCompeticion = categoriaCompeticion;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getCategoriaCompeticion() {
        return categoriaCompeticion;
    }

    public void setCategoriaCompeticion(String categoriaCompeticion) {
        this.categoriaCompeticion = categoriaCompeticion;
    }
    

    // - // - // - // Métodos // - // - // - //
    @Override
    public String mostrarDatos(){
        return "\n\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nNúmero de identidad: " + numeroDeIdentidad + "\nEdad: "+ edad + "\nDeporte: " + deporte+"\nSexo: " + sexo + "\nPaís: " + pais + "\nMedalla: "+ medalla + "\nPuntuación: " +  puntuacion + "\nTipo de Competencia: " + categoriaCompeticion + "\n";
    }

}
