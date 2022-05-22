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
public class PortafolioCursos extends Portafolio{
    
    private String Nombre,Area;
    int Duracion;
    private ArrayList<PortafolioCursos>LCursos = new ArrayList<PortafolioCursos>();
    
    public PortafolioCursos(){
        
    }

    public PortafolioCursos(String Nombre, String Area, int Duracion) {
        this.Nombre = Nombre;
        this.Area = Area;
        this.Duracion = Duracion;
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
    
    
    public void Crear(){
        
        Scanner Entrada = new Scanner(System.in);
        String Nombre,Area;
        int Duracion;
        
        System.out.println("Nombre: ");
        Nombre=Entrada.next();
        System.out.println("Area: ");
        Area=Entrada.next();
        System.out.println("Duracion: ");
        Duracion=Entrada.nextInt();
        
        LCursos.add(new PortafolioCursos(Nombre,Area,Duracion));
    }
    
    public void Mostrar(){
        
        for (int i=0;i<LCursos.size();i++){
            System.out.println("Nombre: "+LCursos.get(i).Nombre);
            System.out.println("Area: "+LCursos.get(i).Area);
            System.out.println("Duracion: "+LCursos.get(i).Duracion);
        }
    }
    
    public void Eliminar(String Nombre){
    
        for (int i=0;i<LCursos.size();i++){
            if (Nombre.equals(LCursos.get(i).Nombre))
                LCursos.remove(i);
        }
    }
    
    public void ActualizarCursoCursado(){
        
    }
    
}
