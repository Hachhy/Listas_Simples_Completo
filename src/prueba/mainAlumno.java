package prueba;

import listaAlumno.*;
import java.util.Scanner;

public class mainAlumno {

    static Scanner sc = new Scanner(System.in);
    static lista_Alumno lista = new lista_Alumno();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.print("\n****************************\n"
                    + "Lista - Alumnos AED        *\n"
                    + "****************************\n"
                    + "1.- Ingresa Nombre         *\n"
                    + "2.- eliminar Nombre        *\n"
                    + "3.- Mostrar Nombre         *\n"
                    + "0.- Salir                  *\n"
                    + "****************************\n");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    setName();
                    break;
                case 2:
                    lista.eliminar();
                    break;
                case 3:
                    lista.mostrar();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;

            }
        }
    }

    public static void setName() {
        sc.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nom = sc.nextLine();
        lista.ingresar(nom);
    }
}
