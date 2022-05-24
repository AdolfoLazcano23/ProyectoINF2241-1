
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
        String Cargo,tempRut;
        
        do {
            System.out.println("1-  INGRESAR");
            System.out.println("2-  ELIMINAR");
            System.out.println("3-  ACTUALIZAR");
            System.out.println("4-  MOSTRAR LISTA OFERTAS");
            System.out.println("5-  FILTRAR");
            System.out.println("6-  BUSCAR");
            System.out.println("7-  VOLVER");
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
                        OfertaLaboral.Mostrar(Sueldo);
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
                    System.out.println("Digite rut de la empresa: ");
                    tempRut = teclado.next();
                    OfertaLaboral.Buscar(tempRut);
                case 7:
                    Menu.desplegarMenuPrincipal();
                    break;
            }
        } while (opcion != 7);
    }

    public static void menuCurso() throws IOException {

        Scanner teclado = new Scanner(System.in);
        int opcion,costoMin,costoMax;
        String tempNombre;
        do{
        System.out.println("1-  INGRESAR");
        System.out.println("2-  ELIMINAR");
        System.out.println("3-  ACTUALIZAR");
        System.out.println("4-  MOSTRAR LISTA CURSOS");
        System.out.println("5-  FILTRAR");
        System.out.println("6-  BUSCAR");
        System.out.println("7-  VOLVER");
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
                case 4:
                    int opc2,costo;
                    System.out.println("1-   MOSTRAR TODOS");
                    System.out.println("2-   MOSTRAR POR SUELDO");
                    opc2 = teclado.nextInt();
                    if (opc2==1)
                        Cursos.Mostrar();
                    else{
                        System.out.println("Ingrese costo: ");
                        costo = teclado.nextInt();
                        Cursos.Mostrar(costo);
                        }
                    break;
                case 5:
                    System.out.println("Ingrese costo minimo: ");
                    costoMin = teclado.nextInt();
                    System.out.println("Ingrese costo maximo: ");
                    costoMax = teclado.nextInt();
                    Cursos.Costos(costoMin, costoMax);
                    break;
                case 6:
                    System.out.println("Ingrese nombre del curso");
                    tempNombre = teclado.next();
                    Cursos.Buscar(tempNombre);
                case 7: 
                    Menu.desplegarMenuPrincipal();
                    break;
            }
        } while (opcion!= 7);
    }

    public static void menuUsuario() throws IOException{
        
        usuarios.InsertarDatosArchivo();
        Scanner teclado = new Scanner(System.in);
        int opcion, cantidad, opcionDos;
        String codigo;
        
        do {
        System.out.println("1-  NUEVO USUARIO");
        System.out.println("2-  ELIMINAR USUARIO");
        System.out.println("3-  ACTUALIZAR");
        System.out.println("4-  MOSTRAR LISTA USUARIOS");
        System.out.println("5-  EDITAR");
        System.out.println("6-  BUSCAR");
        System.out.println("7-  VOLVER");
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
                case 5:
                    System.out.println("Ingrese Rut del usuario a Editar: ");
                    codigo = teclado.next();
                    System.out.println("1.Nombre - 2.Apellido - 3.Rut - 4.Cargo - 5.Telefono");
                    opcionDos = teclado.nextInt();
                    usuarios.Editar(opcionDos,codigo);
                    break;
                case 6:
                    String tempRut;
                    System.out.println("Ingrese rut del Usuario: ");
                    tempRut = teclado.next();
                    usuarios.MostrarUsuario(tempRut);
                    break;
                case 7: {
                    Menu.desplegarMenuPrincipal();
                    break;
                }
            }
            System.out.println("");
        } while ( opcion != 7);
    }
    
}
