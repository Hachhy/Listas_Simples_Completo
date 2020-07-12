package listaAlumno2;

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
                    + "1.- Ingresa Alumno         *\n"
                    + "2.- eliminar Alumno        *\n"
                    + "3.- Mostrar Alumnos        *\n"
                    + "4.- Ordenar                *\n"
                    + "5.- Buscar                 *\n"
                    + "0.- Salir                  *\n"
                    + "****************************\n");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    setName();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    lista.mostrar();
                    break;
                case 4:
                    ordenar();
                    break;
                case 5:
                    lista.buscar();
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
        System.out.print("Ingrese codigo: ");
        String cod = sc.nextLine();
        double nota = 0;
        do {
            System.out.print("Ingrese nota: ");
            nota = sc.nextDouble();
        } while (nota < 0 || nota > 20);
        lista.ingresar(nom, cod, nota);
    }

    public static void ordenar() {
        System.out.print("\n*************************\n"
                + "Ordenar por:            *\n"
                + "1.- Nombre              *\n"
                + "2.- Codigo              *\n"
                + "3.- Nota                *\n"
                + "0.- Menu                *\n"
                + "*************************\n");
        System.out.print("Ingrese opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                lista.ordenarxNombre();
                break;
            case 2:
                lista.ordenarxCodigo();
                break;
            case 3:
                lista.ordenarxNota();
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static void eliminar() {
        System.out.print("\n*************************\n"
                + "Eliminar por:           *\n"
                + "1.- Nombre              *\n"
                + "2.- Codigo              *\n"
                + "3.- Nota                *\n"
                + "4.- Posicion            *\n"
                + "0.- Menu                *\n"
                + "*************************\n");
        System.out.print("Ingrese opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                lista.eliminarxNombre();
                break;
            case 2:
                lista.eliminarxCodigo();
                break;
            case 3:
                lista.eliminarxNota();
                break;
            case 4:
                lista.eliminarxPosicion();
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
