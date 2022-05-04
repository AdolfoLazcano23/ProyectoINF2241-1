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
public class TrabajosRealizados {
    
    private String nombreEmpresa;
    private String Area;
    private int Duracion;
    private ArrayList<TrabajosRealizados> Trabajos = new ArrayList<TrabajosRealizados>();
    
    
    
    public TrabajosRealizados(){
        
    }

    public TrabajosRealizados(String nombreEmpresa, String Area, int Duracion) {
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

    public ArrayList<TrabajosRealizados> getTrabajos() {
        return Trabajos;
    }

    public void setTrabajos(ArrayList<TrabajosRealizados> Trabajos) {
        this.Trabajos = Trabajos;
    }
    
    
    public void InsertarTrabajos(){
        String nombreEmpresa,Area;
        int Duracion;
        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Nombre Empresa: ");
        nombreEmpresa = Entrada.next();
        System.out.println("Area: ");
        Area = Entrada.next();
        System.out.println("Duracion (MESES): ");
        Duracion = Entrada.nextInt();
        
        Trabajos.add(new TrabajosRealizados(nombreEmpresa,Area,Duracion));
    }
    
    public void MostrarTrabajos(){
        
       for (int i=0;i<Trabajos.size();i++){
           System.out.println("Nombre: "+Trabajos.get(i).nombreEmpresa);
           System.out.println("Area: "+Trabajos.get(i).Area);
           System.out.println("Duracion: "+Trabajos.get(i).Duracion);
       }
    }
    
    public void EliminarTrabajos(String Nombre){
        
        for (int i=0;i<Trabajos.size();i++){
            if (Nombre.equals(Trabajos.get(i).nombreEmpresa))
                Trabajos.remove(i);
        }
    }
    
    public void ActualizarTrabajos(){
        
    }
}
