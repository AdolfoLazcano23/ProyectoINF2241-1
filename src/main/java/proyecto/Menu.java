
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Scanner;


public class Menu {
    
    public static OfertaTrabajo OfertaLaboral;
    public static Curso Cursos;
    public static Usuario usuarios = new Usuario();
    
    private String usuario;
    private Scanner leer;
    
    Menu(){
        this.usuario = "Usuario";
    }
    
    public static void desplegarMenuPrincipal() {
       Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do {
            OfertaLaboral = new OfertaTrabajo();
            System.out.println("1-  MENU OFERTA DE TRABAJO");
            System.out.println("2-  MENU CURSO");
            System.out.println("3-  MENU USUARIO");
            System.out.println("4-  SALIR");
            System.out.println("Elija una opcion: ");
            System.out.println("");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    menuOfertaTrabajo();
                    break;
                }
                case 2: {
                    menuCurso();
                    break;
                }
                case 3: {
                    menuUsuario();
                    break;
                }
                case 4: {
                    break;
                }
            }
        } while (opcion == 0);
    }

    public static void menuOfertaTrabajo() {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        String Cargo;
        
        do {
            System.out.println("1-  INGRESAR");
            System.out.println("2-  ELIMINAR");
            System.out.println("3-  ACTUALIZAR");
            System.out.println("4-  MOSTRAR LISTA OFERTAS");
            System.out.println("5-  VOLVER");
            opcion = teclado.nextInt();

            switch (opcion) {
                
                case 1:
                    OfertaLaboral.IngresarOferta();
                    break;
                case 2:
                    System.out.println("Ingrese Cargo: ");
                    Cargo = teclado.next();
                    OfertaLaboral.EliminarOferta(Cargo);
                    break;
                case 3:
                    System.out.println("Actualizado");
                    break;
                case 4:
                    int opc,Sueldo;
                    System.out.println("1-  MOSTRAR TODO");
                    System.out.println("2-  MOSTRAR POR SUELDO");
                    opc = teclado.nextInt(); 
                    if (opc==1)
                        OfertaLaboral.MostrarOferta();
                    else{
                        System.out.println("Ingrese Sueldo: ");
                        Sueldo = teclado.nextInt();
                        OfertaLaboral.MostrarOferta(Sueldo);
                    }
                    break;
                case 5:
                    Menu.desplegarMenuPrincipal();
                    break;
            }
        } while (opcion != 5);
    }

    public static void menuCurso() {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("1-  INGRESAR");
        System.out.println("2-  ELIMINAR");
        System.out.println("3-  ACTUALIZAR");
        System.out.println("4-  MOSTRAR LISTA CURSOS");
        System.out.println("5-  VOLVER");
        opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    Cursos.IngresarCurso();
                    break;
                }
                case 2: {
                    String Nombre;
                    System.out.println("Ingrese nombre: ");
                    Nombre = teclado.next();
                    Cursos.EliminarCurso(Nombre);
                    break;
                }
                case 3: {
                    System.out.println("Actualizado");
                    break;
                }
                case 4: {
                    int opc2,costo;
                    System.out.println("1-   MOSTRAR TODOS");
                    System.out.println("2-   MOSTRAR POR SUELDO");
                    opc2 = teclado.nextInt();
                    if (opc2==1)
                        Cursos.MostrarCursos();
                    else{
                        System.out.println("Ingrese costo: ");
                        costo = teclado.nextInt();
                        Cursos.MostrarCursos(costo);
                        }
                    break;
                }
                case 5: {
                    Menu.desplegarMenuPrincipal();
                    break;
                }
            }
        } while (opcion!= 5);
    }

    public static void menuUsuario(){
        
        usuarios.InsertarDatosArchivo();
        Scanner teclado = new Scanner(System.in);
        int opcion, cantidad;
        do {
        System.out.println("1-  NUEVO USUARIO");
        System.out.println("2-  ELIMINAR USUARIO(NoSirve)");
        System.out.println("3-  ACTUALIZAR(NoSirve)");
        System.out.println("4-  MOSTRAR LISTA USUARIOS");
        System.out.println("5-  VOLVER");
        opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    usuarios.AgregarUsuario();
                    break;
                }
                case 2: {
                    String Rut;
                    System.out.println("Ingrese rut de Usuario");
                    Rut = teclado.next();
                    usuarios.EliminarUsuario(Rut);
                    break;
                }
                case 3: {
                    System.out.println("Funcion No disponible");
                    break;
                }
                case 4: {
                    usuarios.MostrarUsuarios();
                    System.out.println();
                    break;
                }
                case 5: {
                    Menu.desplegarMenuPrincipal();
                    break;
                }
            }
            System.out.println("");
        } while ( opcion != 5);
    }
    
}
