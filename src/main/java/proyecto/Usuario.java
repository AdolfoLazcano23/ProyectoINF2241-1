
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
    
    private String Nombre,Apellido, Ubicacion, Cargo, Rut;
    private int Telefono;
    Scanner Entrada = new Scanner(System.in);
    
    private ArrayList<Usuario> Lusuarios = new ArrayList<Usuario>();
    private ArrayList<CursoCursado> LCursos = new ArrayList<CursoCursado>();
    private ArrayList<TrabajosRealizados> LTrabajos = new ArrayList<TrabajosRealizados>();
    
    
    Usuario(){
        
    }   
    
    Usuario(String nombre, String apellido, String ubicacion, String cargo, String rut, int telefono){
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Ubicacion = ubicacion;
        this.Cargo = cargo;
        this.Rut = rut;
        this.Telefono = telefono;
    }
    
    
    //ACCESORES
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public String getUbicacion(){
        return Ubicacion;
    }
    
    public String getCargo(){
        return Cargo;
    }

    public String getRut() {
        return Rut;
    }

    public int getTelefono() {
        return Telefono;
    }
    
   
    //MUTADORES
    public void setNombre(String Nombre1){
        Nombre = Nombre1;
    }

    public void setApellido(String Apellido1) {
        Apellido = Apellido1;
    }
    
    public void setUbicacion(String Ubicacion1){
        Ubicacion = Ubicacion1;
    }
    
    public void setCargo(String Cargo1){
        Cargo = Cargo1;
    }
    
    public void setTelefono(int Telefono1){
        Telefono = Telefono1;
    }
    
    public void setRut(String Rut1){
        Rut = Rut1;
    }

    
    //COMPORTAMIENTOS
    public void InsertarDatosArchivo() {

        String file = "src/test/java/usuarios.txt";
        
        Usuario[] usuariosArchivo = new Usuario[5];

        try {

            File archivo = new File(file);
            Scanner scanner = new Scanner(archivo);            

            while (scanner.hasNext()) {
                for (int j = 0; j < usuariosArchivo.length; j++) {
                    String[] datos = scanner.next().split(";");
                    usuariosArchivo[j] = new Usuario();
                    usuariosArchivo[j].setNombre(datos[0]);
                    usuariosArchivo[j].setApellido(datos[1]);
                    usuariosArchivo[j].setUbicacion(datos[2]);
                    usuariosArchivo[j].setCargo(datos[3]);
                    int Telefono = Integer.parseInt(datos[4]);
                    usuariosArchivo[j].setTelefono(Telefono);
                    usuariosArchivo[j].setRut(datos[5]); 
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        for(int z=0;z<usuariosArchivo.length;z++)
            Lusuarios.add(usuariosArchivo[z]);
        
    }
    
    public void AgregarUsuario() {
        String nombre,apellido,ubicacion,cargo,rut;
        int telefono,cursosRendidos,trabajosRealizados;

        System.out.println("Digite el Nombre");
        nombre = Entrada.next();

        System.out.println("Digite el Apellido ");
        apellido = Entrada.next();
        
        System.out.println("Digite el Rut");
        rut = Entrada.next();
        
        System.out.println("Digite el Telefono");
        telefono = Entrada.nextInt();

        System.out.println("Digite la Ubicacion");
        ubicacion = Entrada.next();
        
        System.out.println("Cargo: ");
        cargo = Entrada.next();
        
        System.out.println("Ingrese cantidad de trabajos realizados: ");
        trabajosRealizados = Entrada.nextInt();
        TrabajosRealizados Trabajos = new TrabajosRealizados();
        for (int j=0;j<trabajosRealizados;j++){
            System.out.println("Ingrese Datos");
            Trabajos.InsertarTrabajos();
        }
        
        System.out.println("Ingrese Cantidad de cursos rendidos: ");
        cursosRendidos = Entrada.nextInt();
        CursoCursado Cursos = new CursoCursado();
        for (int i=0;i<cursosRendidos;i++){
            System.out.println("Ingrese Datos: ");
            Cursos.IngresarCurso();
        }
        
        Usuario usuario = new Usuario(nombre, apellido, ubicacion, cargo, rut, telefono);
        Lusuarios.add(usuario);

        System.out.println("CLiente creado!");
    }
    
    public void EliminarUsuario(String Rut) {
            for (int i=0;i<Lusuarios.size();i++){
                if (Rut.equals(Lusuarios.get(i).Rut))
                    Lusuarios.remove(i);
            }
    }
    
    public void ActualizarDatos(){
        
    }
    
    public void MostrarUsuarios() throws IOException{
        
        int size;
        size = Lusuarios.size();
        ArchivoTrabajos trabajos = new ArchivoTrabajos("TrabajosRealizados.csv");
        
        System.out.println("Lista de usuarios:");
        for(int i=0;i<size;i++){
            System.out.println("Nombre: "+Lusuarios.get(i).Nombre+" "+Lusuarios.get(i).Apellido);
            System.out.println("Rut: "+Lusuarios.get(i).Rut);
            System.out.println("Telefono: " +Lusuarios.get(i).Telefono);
            System.out.println("Cargo: " +Lusuarios.get(i).Cargo);
            
            System.out.println("Trabajos Realizados: ");
            for(int k=0;k<Lusuarios.get(i).LTrabajos.size();k++){
                System.out.println("Empresa: "+Lusuarios.get(i).LTrabajos.get(k).getNombreEmpresa());
                System.out.println("Area: "+Lusuarios.get(i).LTrabajos.get(k).getArea());
                System.out.println("Duracion: "+Lusuarios.get(i).LTrabajos.get(k).getDuracion());
                System.out.println("----------");
            }
            String[] header = {"Empresa","Area","Duracion"};
            trabajos.GenerarTrabajos(header, LTrabajos);
            
            System.out.println("Cursos Cursados: ");
            for(int j=0;j<Lusuarios.get(i).LCursos.size();j++){
                System.out.println("Nombre: "+Lusuarios.get(i).LCursos.get(j).getNombre());
                System.out.println("Area: "+Lusuarios.get(i).LCursos.get(j).getArea());
                System.out.println("Duracion: "+Lusuarios.get(i).LCursos.get(j).getDuracion());
                System.out.println("----------");
            }
            System.out.println("Ubicacion: "+Lusuarios.get(i).Ubicacion);
            System.out.println("");
        }
    }
    
    public boolean BuscarTrabajosRealizados(String Nombre){
        
        for (int i=0;i<LTrabajos.size();i++){
            if (Nombre.equals(LTrabajos.get(i).getNombreEmpresa()))
                return true;
        }
        return false;
    }
    
    public boolean BuscarCursosRealizados(String Nombre){
        
        for (int i=0;i<LCursos.size();i++){
            if (Nombre.equals(LCursos.get(i).getNombre()))
                return true;
        }
        return false;
    }
}
