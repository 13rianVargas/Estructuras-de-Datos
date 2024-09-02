
package alumno;

public class DatAlumno {

    private String Nombre;
    private char Sexo;
    private int Edad;
    
    
    public DatAlumno(String Nombre, char Sexo, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
    }
    

    public String getNombre() {
        return Nombre;
    }
    
    public char getSexoe() {
        return Sexo;
    }
    
     public int getEdad() {
        return Edad;
    }
     
    public void setNombre(String Name) {                                                                                   
        this.Nombre = Name;
    }
    
    public void setSexo(char Sex) {                                                                                   
        this.Sexo = Sex;
    }
    
    public void setEdad(int Ed) {                                                                                   
        this.Edad = Ed;
    }

}
