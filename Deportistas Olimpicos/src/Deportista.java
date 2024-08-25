public class Deportista{

    // - // - // - // Atributos // - // - // - //
    protected String nombres;
    protected String apellidos;
    protected int numeroDeIdentidad;
    protected int edad;
    protected String deporte;
    protected char sexo;
    protected String pais;
    protected String medalla;
    protected double puntuacion;
    

    // - // - // - // Constructor // - // - // - //
    public Deportista(String nombres, String apellidos, int numeroDeIdentidad, int edad, String deporte, char sexo,String pais, String medalla, double puntuacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDeIdentidad = numeroDeIdentidad;
        this.edad = edad;
        this.deporte = deporte;
        this.sexo = sexo;
        this.pais = pais;
        this.medalla = medalla;
        this.puntuacion = puntuacion;
    }


    // - // - // - // Getters & Setters // - // - // - //
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroDeIdentidad() {
        return numeroDeIdentidad;
    }

    public void setNumeroDeIdentidad(int numeroDeIdentidad) {
        this.numeroDeIdentidad = numeroDeIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMedalla() {
        return medalla;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    
    // - // - // - // Métodos // - // - // - //
    public String mostrarDatos(){
        return "\n\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nNúmero de identidad: " + numeroDeIdentidad + "\nEdad: "+ edad + "\nDeporte: " + deporte+"\nSexo: " + sexo + "\nPaís: " + pais + "\nMedalla: "+ medalla + "\nPuntuación: " +  puntuacion + "\n";
    }
    
}
