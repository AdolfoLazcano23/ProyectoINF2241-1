//ADOLFO LAZCANO
//BASTIAN RIQUELME
//JOSE CORVALAN

package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class ProyectoMain {
    
    // globales

    public static Curso cursos = new Curso();
    public static Empresa empresas = new Empresa();
    public static OfertaTrabajo OfertaLaboral = new OfertaTrabajo();

    public static void main(String[] args) throws ParseException {
      
    Menu m = new Menu();
    m.desplegarMenuPrincipal();    
    }

}
