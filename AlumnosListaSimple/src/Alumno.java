public class Alumno {
    String nombre;
    int edad;
    char sexo;
    String programa;
    
    public Alumno(){

    }
    
    public Alumno(String nombre, int edad, char sexo, String programa) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", programa=" + programa + "]";
    }

}
