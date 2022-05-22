
package proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    
    public static void desplegarMenuPrincipal() throws IOException {
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

    public static void menuOfertaTrabajo() throws IOException {

        Scanner teclado = new Scanner(System.in);
        int opcion,sueldoMin,sueldoMax;
        String Cargo;
        
        do {
            System.out.println("1-  INGRESAR");
            System.out.println("2-  ELIMINAR");
            System.out.println("3-  ACTUALIZAR");
            System.out.println("4-  MOSTRAR LISTA OFERTAS");
            System.out.println("5-  BUSCAR");
            System.out.println("6-  VOLVER");
            opcion = teclado.nextInt();

            switch (opcion) {
                
                case 1:
                    OfertaLaboral.Crear();
                    break;
                case 2:
                    System.out.println("Ingrese Cargo: ");
                    Cargo = teclado.next();
                    OfertaLaboral.Eliminar(Cargo);
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
                        OfertaLaboral.Mostrar();
                    else{
                        System.out.println("Ingrese Sueldo: ");
                        Sueldo = teclado.nextInt();
                        OfertaLaboral.MostrarOferta(Sueldo);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese saldo minimo: ");
                    sueldoMin = teclado.nextInt();
                    System.out.println("Ingrese saldo maximo: ");
                    sueldoMax = teclado.nextInt();
                    OfertaLaboral.Sueldos(sueldoMin, sueldoMax);
                    break;
                case 6:
                    Menu.desplegarMenuPrincipal();
                    break;
            }
        } while (opcion != 6);
    }

    public static void menuCurso() throws IOException {

        Scanner teclado = new Scanner(System.in);
        int opcion,costoMin,costoMax;
        do{
        System.out.println("1-  INGRESAR");
        System.out.println("2-  ELIMINAR");
        System.out.println("3-  ACTUALIZAR");
        System.out.println("4-  MOSTRAR LISTA CURSOS");
        System.out.println("5-  BUSCAR");
        System.out.println("6-  VOLVER");
        opcion = teclado.nextInt();

            switch (opcion) {
                case 1: {
                    Cursos.Crear();
                    break;
                }
                case 2: {
                    String Nombre;
                    System.out.println("Ingrese nombre: ");
                    Nombre = teclado.next();
                    Cursos.Eliminar(Nombre);
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
                        Cursos.Mostrar();
                    else{
                        System.out.println("Ingrese costo: ");
                        costo = teclado.nextInt();
                        Cursos.MostrarCursos(costo);
                        }
                    break;
                }
                case 5:
                    System.out.println("Ingrese costo minimo: ");
                    costoMin = teclado.nextInt();
                    System.out.println("Ingrese costo maximo: ");
                    costoMax = teclado.nextInt();
                    Cursos.Costos(costoMin, costoMax);
                    break;
                case 6: {
                    Menu.desplegarMenuPrincipal();
                    break;
                }
            }
        } while (opcion!= 5);
    }

    public static void menuUsuario() throws IOException{
        
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
                    usuarios.Crear();
                    break;
                }
                case 2: {
                    String Rut;
                    System.out.println("Ingrese rut de Usuario");
                    Rut = teclado.next();
                    usuarios.Eliminar(Rut);
                    break;
                }
                case 3: {
                    System.out.println("Funcion No disponible");
                    break;
                }
                case 4: {
                    usuarios.Mostrar();
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
