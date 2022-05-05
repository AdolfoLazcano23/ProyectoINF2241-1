/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author adolfojr
 */
public class ArchivoTrabajos {
    
    private String Ruta;

    public ArchivoTrabajos(String Ruta) {
        this.Ruta = Ruta;
    }
    
    public void GenerarTrabajos(String[] header, ArrayList<TrabajosRealizados> Datos) throws IOException{
        
        File file = new File(this.Ruta);
        try{
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            writer.writeNext(header);
            
            for (int i=0;i<Datos.size();i++){
                String[] data = {Datos.get(i).getNombreEmpresa(),Datos.get(i).getArea()};
                writer.writeNext(data);
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
