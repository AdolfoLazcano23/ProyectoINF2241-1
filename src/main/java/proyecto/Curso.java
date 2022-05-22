package proyecto;


import java.util.ArrayList;
import java.util.Scanner;


public class Curso implements Metodos{
    
    private String Nombre,Area;
    int Duracion,Costo;
    private ArrayList<Curso> ListaCursos = new ArrayList<Curso>();
    
    public Curso(){
        
    }

    public Curso(String Nombre, String Area, int Duracion, int Costo) {
        this.Nombre = Nombre;
        this.Area = Area;
        this.Duracion = Duracion;
        this.Costo = Costo;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }
    
    
    
    public void Crear(){
        
        String Nombre,Area;
        int Duracion,Costo;
        
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Nombre: ");
        Nombre = Entrada.next();
        System.out.println("Area: ");
        Area = Entrada.next();
        System.out.println("Duracion (Meses): ");
        Duracion = Entrada.nextInt();
        System.out.println("Costo: ");
        Costo = Entrada.nextInt();
        
        ListaCursos.add(new Curso(Nombre,Area,Duracion,Costo));
        System.out.println("Curso Agregado");
    }
    
    public void Mostrar(){
        
        for (int i=0;i<ListaCursos.size();i++){
            System.out.println("Nombre: "+ListaCursos.get(i).Nombre);
            System.out.println("Area: "+ListaCursos.get(i).Area);
            System.out.println("Duracion: "+ListaCursos.get(i).Duracion);
            System.out.println("Costo: "+ListaCursos.get(i).Costo);
        }
    }
    
    public void Mostrar(int Costo){
        
        for (int i=0;i<ListaCursos.size();i++){
            if (Costo==ListaCursos.get(i).Costo){
                System.out.println("Nombre: "+ListaCursos.get(i).Nombre);
                System.out.println("Area: "+ListaCursos.get(i).Area);
                System.out.println("Duracion: "+ListaCursos.get(i).Duracion);
                System.out.println("Costo: "+ListaCursos.get(i).Costo);
            }
        }
    }
    
    public void Eliminar(String Nombre){
        
        for (int i=0;i<ListaCursos.size();i++){
            
            if(Nombre.equals(ListaCursos.get(i).Nombre))
                ListaCursos.remove(i);
        }        
    }
    
    public void Costos(int min,int max){
        
        for (int i=0;i<ListaCursos.size();i++){
            if ((ListaCursos.get(i).Costo>min) && (ListaCursos.get(i).Costo<max))
                System.out.println("Curso: "+ListaCursos.get(i).getNombre());
        }
    }
}