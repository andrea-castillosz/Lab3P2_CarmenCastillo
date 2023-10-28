/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_carmencastillo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casti
 */
public class Lab3P2_CarmenCastillo {

    static Scanner leer = new Scanner(System.in, "ISO-8859-1");
    static Scanner leerent = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Aplicaciones> biblioteca = new ArrayList();

    public static void main(String[] args) {

        boolean seguirmenu = true;
        while (seguirmenu) {
            System.out.println("");
            System.out.println("----MENU PRINCIPAL-----");
            System.out.println("1. Adminitrador.");
            System.out.println("2. Usuario.");
            System.out.println("3. Salir.");
            System.out.print("Ingrese su opción: ");
            int opcion = leerent.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    boolean seguiradmin = true;
                    while (seguiradmin) {
                        System.out.println("");
                        System.out.println("----SUB-MENU Administrador-----");
                        System.out.println("1. Agregar Aplicación.");
                        System.out.println("2. Biblioteca.");
                        System.out.println("3. Actualización.");
                        System.out.println("4. Eliminar Aplicación.");
                        System.out.println("5. Estadísticas de Desarrollador.");
                        System.out.println("6. Salir.");
                        System.out.print("Ingrese su opción: ");
                        int opcionadmin = leerent.nextInt();
                        System.out.println("");

                        switch (opcionadmin) {
                            case 1:
                                System.out.println("");
                                System.out.println("Que tipo de aplicación desea agregar?");
                                System.out.println("1. App de Utilidad.");
                                System.out.println("2. App de Juego.");
                                System.out.println("3. Salir.");
                                System.out.print("Ingrese su opción: ");
                                int opcionAgregar = leerent.nextInt();
                                System.out.println("");

                                switch (opcionAgregar) {
                                    case 1:
                                        agregarAppUtilidad(biblioteca);
                                        break;

                                    case 2:
                                        agregarAppJuego(biblioteca);
                                        break;

                                    default:
                                        System.out.println("Opción fuera de rango.");
                                        break;

                                }

                                break;

                            case 2:
                                listarBilbioteca(biblioteca);
                                break;

                            case 3:

                                listarBilbioteca(biblioteca);
                                System.out.print("Identifique que aplicacion desea modificar: ");
                                int resp = leerent.nextInt();
                                while (resp < 0 || resp > biblioteca.size() - 1) {
                                    System.out.print("Opción fuera de rango. \nIntentelo de nuevo: ");
                                    resp = leerent.nextInt();
                                }

                                modApp(biblioteca, resp);

                                break;

                            case 4:

                                listarBilbioteca(biblioteca);
                                System.out.print("Identifique que aplicacion desea eliminar: ");
                                int respEliminar = leerent.nextInt();
                                while (respEliminar < 0 || respEliminar > biblioteca.size() - 1) {
                                    System.out.print("Opción fuera de rango. \nIntentelo de nuevo: ");
                                    respEliminar = leerent.nextInt();
                                }

                                biblioteca.remove(respEliminar);

                                break;

                            case 5:

                                listarBilbioteca(biblioteca);

                                break;

                            default:
                                seguiradmin = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    boolean seguirusuario = true;
                    while (seguirusuario) {
                        System.out.println("");
                        System.out.println("----SUB-MENU Usuario-----");
                        System.out.println("1. Buscar por Nombre.");
                        System.out.println("2. Buscar por Categoría.");
                        System.out.println("3. Biblioteca.");
                        System.out.println("4. Mostrar Descargas.");
                        System.out.println("5. Eliminar Descargas.");
                        System.out.println("6. Calificar Aplicación.");
                        System.out.println("7. Salir.");
                        System.out.print("Ingrese su opción: ");
                        int opcionusuario = leerent.nextInt();
                        System.out.println("");

                        switch (opcionusuario) {
                            case 1:
                                System.out.print("Ingrese el nombre de la aplicación a buscar: ");
                                String app = leer.next();
                                buscarPorNombre(biblioteca, app);
                                break;

                            case 2:
                                for (int i = 0; i < biblioteca.size(); i++) {
                                    if (biblioteca.get(i) instanceof Utilidad) {
                                        System.out.println(biblioteca.indexOf(i) + " -> " + ((Utilidad) biblioteca.get(i)).getCatergoria());
                                        System.out.println("");
                                    }
                                }
                                
                                System.out.print("Ingrese la categoria de la aplicación a buscar: ");
                                String cate = leer.next();
                                buscarPorCategoria(biblioteca, cate);
                                
                                break;

                            case 3:

                                listarBilbioteca(biblioteca);

                                break;

                            case 4:
                                listarDescargas(biblioteca);
                                break;

                            case 5:
                                listarDescargas(biblioteca);
                                System.out.print("Identifique que aplicacion desea eliminar: ");
                                int respEliminar = leerent.nextInt();
                                while (respEliminar < 0 || respEliminar > biblioteca.size() - 1) {
                                    System.out.print("Opción fuera de rango. \nIntentelo de nuevo: ");
                                    respEliminar = leerent.nextInt();
                                }

                                biblioteca.remove(respEliminar);        
                                break;

                            case 6:
                                listarDescargas(biblioteca);
                                System.out.print("Ingrese el indice qué aplicación desea calificar: ");
                                int respCalificar = leerent.nextInt();
                                while (respCalificar < 0 || respCalificar > biblioteca.size() - 1) {
                                    System.out.print("Opción fuera de rango. \nIntentelo de nuevo: ");
                                    respCalificar = leerent.nextInt();
                                }
                                
                                System.out.print("Cuanto desea callificarle [1-10]: ");
                                double rate = leerent.nextInt();
                                while (rate < 0 || rate > 10) {
                                    System.out.print("Opción fuera de rango. \nIntentelo de nuevo: ");
                                    respCalificar = leerent.nextInt();
                                }
                                
                                biblioteca.get(respCalificar).setRating(rate);
                                
                                
                                break;

                            default:
                                seguirusuario = false;
                                break;

                        }
                    }
                    break;

                default:
                    seguirmenu = false;
                    break;

            }

        }

    }

    public static ArrayList<Aplicaciones> agregarAppUtilidad(ArrayList<Aplicaciones> nuevaApp) {
        System.out.print("Ingrese el nombre de su app: ");
        String nombre = leer.next();
        System.out.print("Ingrese la categoria: ");
        String categ = leer.next();
        System.out.print("Ingrese su desarrollador: ");
        String desarrolla = leer.next();
        System.out.print("Ingrese el precio de la app: ");
        double precioN = leerent.nextDouble();
        Utilidad appUtil = new Utilidad(categ, nombre, desarrolla, precioN, false, 0, 0);
        nuevaApp.add(appUtil);
        System.out.println("¡Aplicacion agregada exitosamente!");

        return nuevaApp;
    }

    public static ArrayList<Aplicaciones> agregarAppJuego(ArrayList<Aplicaciones> nuevaApp) {
        System.out.print("Ingrese el nombre de su app: ");
        String nombre = leer.next();
        System.out.print("Ingrese la edad recomendada: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese su desarrolador: ");
        String desarrolla = leer.next();
        System.out.print("Ingrese el precio de la app: ");
        double precioN = leerent.nextDouble();
        Juegos appJuegos = new Juegos(edad, nombre, desarrolla, precioN, false, 0, 0);
        nuevaApp.add(appJuegos);
        System.out.println("¡Aplicacion agregada exitosamente!");

        return nuevaApp;
    }

    public static void listarBilbioteca(ArrayList<Aplicaciones> listBiblioteca) {

        for (Aplicaciones l: listBiblioteca) {
            if (l instanceof Utilidad) {
                System.out.println(listBiblioteca.indexOf(l) + " -> " + ((Utilidad) l));
                System.out.println("");
            } else {
                System.out.println(listBiblioteca.indexOf(l) + " -> " + ((Juegos) l));
                System.out.println("");
            }

        }

    }

    public static void modApp(ArrayList<Aplicaciones> biblioteca, int pos) {
        System.out.println("");
        System.out.println("Que desea modificar de la aplicacion?");
        System.out.println("1. Nombre de la App.");
        System.out.println("2. Desarrollador.");
        System.out.println("3. Precio.");
        System.out.print("Ingrese su opción: ");
        int opcionMod = leerent.nextInt();

//        while (opcionMod < 0 || opcionMod > biblioteca.size() - 1) {
//            System.out.print("Opción fuera de rango. \nIntentelo de nuevo: ");
//            opcionMod = leerent.nextInt();
//        }
        switch (opcionMod) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                String nom = leer.next();
                biblioteca.get(pos).setNombre(nom);
                System.out.println("Modificacion Exitosa.");
                break;

            case 2:
                System.out.println("Ingrese el nuevo desarrollador: ");
                String des = leer.next();
                biblioteca.get(pos).setDesarrollador(des);
                System.out.println("Modificacion Exitosa.");
                break;

            case 3:
                System.out.println("Ingrese el nuevo precio: ");
                double presio = leer.nextDouble();
                biblioteca.get(pos).setPrecio(presio);
                System.out.println("Modificacion Exitosa.");
                break;

            default:
                System.out.println("Opcion ingresada fuera de rango.");
                break;

        }

    }

    public static void buscarPorNombre(ArrayList<Aplicaciones> applist, String nombre) {
        boolean encontrado = false;
        System.out.println("");
        for (int i = 0; i < applist.size(); i++) {
            if (nombre.equalsIgnoreCase(applist.get(i).getNombre())) {
                System.out.println("App encontrada!");
                System.out.print("Desea descargar la aplicación?[1. SI / 2. NO]: ");
                int resp = leerent.nextInt();
                if (resp == 1) {
                    applist.get(i).setEstado(true);
                    applist.get(i).setDescargas(applist.get(i).getDescargas() + 1);
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("App no encontrada.");
        }
    }

    public static void buscarPorCategoria(ArrayList<Aplicaciones> applist, String cat) {
        boolean encontrado = false;
        System.out.println("");
        for (int i = 0; i < applist.size(); i++) {
            if (cat.equalsIgnoreCase(((Utilidad) biblioteca.get(i)).getCatergoria())) {
                System.out.println("App encontrada!");
                System.out.print("Desea descargar la aplicación?[1. SI / 2. NO]: ");
                int resp = leerent.nextInt();
                if (resp == 1) {
                    applist.get(i).setEstado(true);
                    applist.get(i).setDescargas(applist.get(i).getDescargas() + 1);
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("App no encontrada.");
        }
        
    }
    
    public static void listarDescargas(ArrayList<Aplicaciones> listBiblioteca) {

        for (int i = 0; i < listBiblioteca.size(); i++) {
            if (listBiblioteca.get(i).getEstado() == true) {
                System.out.println(i + ". " +listBiblioteca.get(i));
            }

        }

    }

}
