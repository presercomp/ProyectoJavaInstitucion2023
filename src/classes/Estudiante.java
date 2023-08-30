package classes;

public class Estudiante {
    private String nombre;
    private String rut;
    
    public Estudiante(String n, String r) {
        this.nombre = n;
        this.rut = r;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public String getRut(){
        return this.rut;
    }
}
