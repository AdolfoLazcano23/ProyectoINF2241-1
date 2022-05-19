/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author adolfojr
 */
public class PortafolioTrabajos extends Portafolio {
    
    private String nombreEmpresa;
    private String Area;
    private int Duracion;
    private ArrayList<PortafolioTrabajos> Trabajos = new ArrayList<PortafolioTrabajos>();
    
    
    
    public PortafolioTrabajos(){
        
    }

    public PortafolioTrabajos(String nombreEmpresa, String Area, int Duracion) {
        this.nombreEmpresa = nombreEmpresa;
        this.Area = Area;
        this.Duracion = Duracion;
    }
    
    

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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

    public ArrayList<PortafolioTrabajos> getTrabajos() {
        return Trabajos;
    }

    public void setTrabajos(ArrayList<PortafolioTrabajos> Trabajos) {
        this.Trabajos = Trabajos;
    }
    
    
    public void Crear(){
        String nombreEmpresa,Area;
        int Duracion;
        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Nombre Empresa: ");
        nombreEmpresa = Entrada.next();
        System.out.println("Area: ");
        Area = Entrada.next();
        System.out.println("Duracion (MESES): ");
        Duracion = Entrada.nextInt();
        
        Trabajos.add(new PortafolioTrabajos(nombreEmpresa,Area,Duracion));
    }
    
    public void Mostrar(){
        
       for (int i=0;i<Trabajos.size();i++){
           System.out.println("Nombre: "+Trabajos.get(i).nombreEmpresa);
           System.out.println("Area: "+Trabajos.get(i).Area);
           System.out.println("Duracion: "+Trabajos.get(i).Duracion);
       }
    }
    
    public void Eliminar(String Nombre){
        
        for (int i=0;i<Trabajos.size();i++){
            if (Nombre.equals(Trabajos.get(i).nombreEmpresa))
                Trabajos.remove(i);
        }
    }
    
    public void ActualizarTrabajos(){
        
    }
}
