public class Tenista extends Deportista {

    // - // - // - // Atributos // - // - // - //
    private String tipoCompeticion;


    // - // - // - // Constructor // - // - // - //
    public Tenista(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo, String pais, String medalla, double puntuacion, String tipoCompeticion) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.tipoCompeticion = tipoCompeticion;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getTipoCompeticion() {
        return tipoCompeticion;
    }

    public void setTipoCompeticion(String tipoCompeticion) {
        this.tipoCompeticion = tipoCompeticion;
    }


    // - // - // - // Métodos // - // - // - //
    @Override
    public String mostrarDatos(){
        return "\n\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nNúmero de identidad: " + numeroDeIdentidad + "\nEdad: "+ edad + "\nDeporte: " + deporte+"\nSexo: " + sexo + "\nPaís: " + pais + "\nMedalla: "+ medalla + "\nPuntuación: " +  puntuacion + "\nTipo de Competencia: " + tipoCompeticion + "\n";
    }

}
