public class Nadador extends Deportista {

    // - // - // - // Atributos // - // - // - //
    private String tipoDeNatación;


    // - // - // - // Constructor // - // - // - //
    public Nadador(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo,String pais, String medalla, double puntuacion, String tipoDeNatación) {
        super(nombres, apellidos, numeroDeIdentidad, edad, deporte, sexo, pais, medalla, puntuacion);
        this.tipoDeNatación = tipoDeNatación;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getTipoDeNatación() {
        return tipoDeNatación;
    }

    public void setTipoDeNatación(String tipoDeNatación) {
        this.tipoDeNatación = tipoDeNatación;
    }
    

    // - // - // - // Métodos // - // - // - //
    @Override
    public String mostrarDatos(){
        return "\n\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nNúmero de identidad: " + numeroDeIdentidad + "\nEdad: "+ edad + "\nDeporte: " + deporte+"\nSexo: " + sexo + "\nPaís: " + pais + "\nMedalla: "+ medalla + "\nPuntuación: " +  puntuacion + "\nTipo de Competencia: " + tipoDeNatación + "\n";
    }

}