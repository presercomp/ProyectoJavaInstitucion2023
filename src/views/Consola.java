package views;

import classes.Instituto;
import classes.Carrera;
import classes.Estudiante;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Consola {
    
    private static Instituto i;   
    private static List<Carrera> cs;
    private static List<Estudiante> es;
    private static int op;
    private static Scanner t;
    public static void main(String[] args){
        cs = new ArrayList<>();
        es = new ArrayList<>();
        System.out.println(" ===== Bienvenido ===== ");
        System.out.println("");
        System.out.println("");
        System.out.print("Ingrese el nombre del C.F.T. a crear: ");
        t = new Scanner(System.in);
        String nombreCFT = t.nextLine();
        i = new Instituto(nombreCFT);
        op = -1;
        while(op != 0){
            menu();
        }
    }
    
    public static void menu() {        
        System.out.println("1) Registrar nueva carrera");
        System.out.println("2) Registrar nuevo estudiante");
        System.out.println("3) Asignar estudiantes a carrera");
        System.out.println("4) Asignar carreras a institucion");
        System.out.println("5) Conocer total de estudiantes en la institucion");
        System.out.println("6) Estadisticas");
        System.out.println("");
        System.out.println("0) Salir");
        System.out.println("");
        System.out.print("Elija opcion: ");        
        op = t.nextInt();
        switch(op) {
            case 1:
                nuevaCarrera();
            break;
            case 2:
                nuevoEstudiante();
            break;
            case 3:
                estudianteACarrera();
            break;
            case 4:
                carrerasAInstitucion();
            break;
            case 5:
                verTotalEstudiantes();
            break;
            case 6:
                estadisticas();
            break;
            case 0:
                //Nothing to do here
            break;
            default: 
                menu();
        }
    }    

    public static void nuevaCarrera(){
        System.out.print("Ingrese el nombre de la carrera: ");
        t = new Scanner(System.in);
        String nombre = t.nextLine();
        Carrera c = new Carrera(nombre);
        cs.add(c);
        System.out.println("Carrera Ingresada!");
        System.out.println("");
        System.out.println("");
        menu();
    }
    
    public static void nuevoEstudiante(){
        t = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = t.nextLine();
        System.out.print("Ingrese el rut del estudiante: ");
        String rut = t.nextLine();
        //
        Estudiante e = new Estudiante(nombre, rut);
        es.add(e);
        System.out.println("Estudiante registrado.");    
        System.out.println("");
    }

    public static void estudianteACarrera() {
        if(cs.isEmpty()){
            System.out.println("No hay carreras disponbiles para crear un estudiante");
            t.nextLine();
            menu();
            return;
        }
        //System.out.println("¿Está seguro de querer enlazar los estudiantes a la carrera?");
        t = new Scanner(System.in);        
        int id_carrera = -1;
        while(id_carrera == -1) {
            System.out.println("Elija la carrera a la que será asignado: ");
            for(int i = 0; i < cs.size(); i++){
                System.out.println((i+1)+") "+cs.get(i).getNombre());
            }
            id_carrera = t.nextInt();
            if(id_carrera > cs.size()){
                id_carrera = -1;
                System.out.println("El id de carrera no existe");
            } else {
                List<Estudiante> nes = new ArrayList<>();
                nes.addAll(es);
                cs.get((id_carrera-1)).setEstudiantes(nes);
                es.clear();
                System.out.println("Estudiantes vinculados!");
                System.out.println("");
                menu();
            }            
        }
        
        
        
    }

    public static void carrerasAInstitucion() {
        List<Carrera> ncs = new ArrayList<>();
        ncs.addAll(cs);
        i.setCarreras(ncs);
        cs.clear();
        System.out.println("Carreras asignadas");
        System.out.println("");
        menu();
    }

    public static void verTotalEstudiantes() {
        int total = i.getTotalEstudiantes();
        System.out.println(i.getNombre()+" cuenta con un total de "+total+" estudiantes registrados");
        System.out.println("");
        menu();
    }
    
    public static void estadisticas() {
        System.out.println("Nombre institucion: "+i.getNombre());
        System.out.println("Cantidad de carreras: "+i.getCarreras().size());
    }
}
