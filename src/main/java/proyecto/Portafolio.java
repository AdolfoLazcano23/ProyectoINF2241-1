/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author adolfojr
 */
public abstract class Portafolio {

    public Portafolio() {
    }
    //CLASE MADRE PARA "TRABAJOSREALIZADOS" Y "CURSOCURSADOS"
    //IMPLEMENTAR METODOS PROPIOS PARA AMBAS CLASES
    public abstract void Crear();
    public abstract void Mostrar();
    public abstract void Eliminar(String N);
    
    
}