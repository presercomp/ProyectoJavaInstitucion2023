package classes;

import java.util.List;

public class Carrera {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Carrera(String n){
        this.nombre = n;
    }
    
    public void setEstudiantes(List<Estudiante> e) {
        this.estudiantes = e;
    }
    
    public List<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    
    public String getNombre() {
        return this.nombre;
    }
}
