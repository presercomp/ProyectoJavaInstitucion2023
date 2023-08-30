package classes;
import java.util.List;
public class Instituto {
    private String nombre;
    private List<Carrera> carreras;
    
    public Instituto(String n){
        this.nombre = n;
    }
    
    public void setCarreras(List<Carrera> c) {
        this.carreras = c;
    }
    
    public List<Carrera> getCarreras() {
        return this.carreras;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public int getTotalEstudiantes() {
        int contador = 0;
        for(int i = 0; i<this.carreras.size(); i++) {
            contador += this.carreras.get(i).getEstudiantes().size();
        }
        return contador;
    }
}
