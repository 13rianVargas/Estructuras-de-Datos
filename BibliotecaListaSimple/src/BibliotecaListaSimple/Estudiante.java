package BibliotecaListaSimple;
public class Estudiante {
    String nombre;
    int librosConsultados;
    char sexo;


    public Estudiante() {
    }
    public Estudiante(String nombre, int librosConsultados, char sexo) {
        this.nombre = nombre;
        this.librosConsultados = librosConsultados;
        this.sexo = sexo;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getLibrosConsultados() {
        return librosConsultados;
    }
    public void setLibrosConsultados(int librosConsultados) {
        this.librosConsultados = librosConsultados;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", librosConsultados=" + librosConsultados + ", sexo=" + sexo + "]";
    }

}
