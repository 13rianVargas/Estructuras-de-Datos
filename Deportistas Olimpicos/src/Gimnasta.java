public class Gimnasta extends Deportista {

    // - // - // - // Atributos // - // - // - //
    private String tipoDeGimnasia;


    // - // - // - // Constructor // - // - // - //
    public Gimnasta(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo,String pais, String medalla, double puntuacion, String tipoDeGimnasia) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.tipoDeGimnasia = tipoDeGimnasia;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getTipoDeGimnasia() {
        return tipoDeGimnasia;
    }

    public void setTipoDeGimnasia(String tipoDeGimnasia) {
        this.tipoDeGimnasia = tipoDeGimnasia;
    }
    

    // - // - // - // Métodos // - // - // - //
    public String mostrarDatos(){
        return "\n\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nNúmero de identidad: " + numeroDeIdentidad + "\nEdad: "+ edad + "\nDeporte: " + deporte+"\nSexo: " + sexo + "\nPaís: " + pais + "\nMedalla: "+ medalla + "\nPuntuación: " +  puntuacion + "\nTipo de Competencia: " + tipoDeGimnasia + "\n";
    }
}
