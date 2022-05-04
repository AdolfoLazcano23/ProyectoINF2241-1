package proyecto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class OfertaTrabajo {
    
    private String NombreEmpresa,RutEmpresa,Area,Cargo;
    private int Duracion, Sueldo;
    private String Ubicacion;
    private ArrayList<OfertaTrabajo> ListaOferta = new ArrayList<OfertaTrabajo>();
    
    
    public OfertaTrabajo(){
        
    }
    
    public OfertaTrabajo(String NombreEmpresa, String RutEmpresa, String Area, String Cargo, int Duracion, int Sueldo, String Ubicacion) {
        this.NombreEmpresa = NombreEmpresa;
        this.RutEmpresa = RutEmpresa;
        this.Area = Area;
        this.Cargo = Cargo;
        this.Duracion = Duracion;
        this.Sueldo = Sueldo;
        this.Ubicacion = Ubicacion;
    }

    
    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getRutEmpresa() {
        return RutEmpresa;
    }

    public void setRutEmpresa(String RutEmpresa) {
        this.RutEmpresa = RutEmpresa;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }
    
    
    
    public void IngresarOferta(){
        
        String Nombre,Rut,Area,Cargo,Ubicacion;
        int Duracion,Sueldo;
        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Nombre: ");
        Nombre = Entrada.next();
        System.out.println("Rut: ");
        Rut = Entrada.next();
        System.out.println("Area: ");
        Area = Entrada.next();
        System.out.println("Cargo: ");
        Cargo = Entrada.next();
        System.out.println("Duracion: ");
        Duracion = Entrada.nextInt();
        System.out.println("Sueldo: ");
        Sueldo = Entrada.nextInt();
        System.out.println("Ubicacion: ");
        Ubicacion = Entrada.next();
        
        ListaOferta.add(new OfertaTrabajo(Nombre,Rut,Area,Cargo,Duracion,Sueldo,Ubicacion));
        System.out.println("Oferta agregada");
    }

    public void MostrarOferta(){
        
        for (int i=0;i<ListaOferta.size();i++){
            System.out.println("Nombre: "+ListaOferta.get(i).NombreEmpresa);
            System.out.println("Rut: "+ListaOferta.get(i).RutEmpresa);
            System.out.println("Area: "+ListaOferta.get(i).Area);
            System.out.println("Cargo: "+ListaOferta.get(i).Cargo);
            System.out.println("Duracion "+ListaOferta.get(i).Duracion);
            System.out.println("Sueldo: "+ListaOferta.get(i).Sueldo);
            System.out.println("Ubicacion: "+ListaOferta.get(i).Ubicacion);
            System.out.println("------------------------------------------");
        }
    }
    
    public void MostrarOferta(int Sueldo){
        
        for (int i=0;i<ListaOferta.size();i++){
            
            if(ListaOferta.get(i).Sueldo==Sueldo){
                System.out.println("Nombre: "+ListaOferta.get(i).NombreEmpresa);
                System.out.println("Rut: "+ListaOferta.get(i).RutEmpresa);
                System.out.println("Area: "+ListaOferta.get(i).Area);
                System.out.println("Cargo: "+ListaOferta.get(i).Cargo);
                System.out.println("Duracion "+ListaOferta.get(i).Duracion);
                System.out.println("Sueldo: "+ListaOferta.get(i).Sueldo);
                System.out.println("Ubicacion: "+ListaOferta.get(i).Ubicacion);
                System.out.println("------------------------------------------");
            }
        }
    }
    
    public void EliminarOferta(String Cargo){
        
        for (int i=0;i<ListaOferta.size();i++){
            
            if (Cargo.equals(ListaOferta.get(i).Cargo)){
                ListaOferta.remove(i);
            }
        }
    }
}
