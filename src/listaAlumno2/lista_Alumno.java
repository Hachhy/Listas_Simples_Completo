package listaAlumno2;

import java.util.Scanner;

public class lista_Alumno {

    private int tamanio;
    private alumno inicio;
    static Scanner sc = new Scanner(System.in);

    public lista_Alumno() {
        this.inicio = null;
        this.tamanio = 0;
    }

    public void ingresar(String nom, String codigo, double nota) {
        alumno nuevo = new alumno();
        nuevo.setNombre(nom);
        nuevo.setCodigo(codigo);
        nuevo.setNota(nota);
        if (isEmpty()) {
            inicio = nuevo;
        } else {
            nuevo.setNext(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }

    public void eliminar() {
        if (isEmpty()) {
            System.out.print("La lista esta vacia");
        } else {
            alumno aux = inicio;
            String auxdata = aux.getNombre();
            aux = aux.getNext();
            inicio = aux;
            System.out.print("El nombre " + auxdata + " se eliminó");
            tamanio--;
        }
    }

    public void eliminarxPosicion() {
        if (!isEmpty()) {
            System.out.print("Ingrese Posicion: ");
            int pos = sc.nextInt();
            alumno aux = inicio;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.getNext();
            }

            alumno temp = aux.getNext();
            alumno temp2 = temp.getNext();
            aux.setNext(temp2);
            System.out.println("Eliminado -- " + temp.getNombre());
            tamanio--;

        } else {
            System.out.println("La lista esta vacia");
        }
    }
    
    public void eliminarxNombre(){
        if(!isEmpty()){
            System.out.print("Ingrese Nombre: ");
            String nom=sc.nextLine();
            alumno aux=inicio;
            alumno aux2=aux;
            if(nom.equals(inicio.getNombre())){
                inicio=aux.getNext();
            }else{
            for(int i=0;i<tamanio && !nom.equals(aux.getNombre());i++){
                aux2=aux;
                aux=aux.getNext();
            }
            alumno temp=aux.getNext();            
            aux2.setNext(temp);}
            System.out.println("Eliminado -- " + aux.getNombre());
            tamanio--;            
            
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void eliminarxCodigo(){
        if(!isEmpty()){
            System.out.print("Ingrese Codigo: ");
            String cod=sc.nextLine();
            
            alumno aux=inicio;
            alumno aux2=aux;
            if(cod.equals(inicio.getNombre())){
                inicio=aux.getNext();
            }else{
            for(int i=0;i<tamanio && !cod.equals(aux.getCodigo());i++){
                aux2=aux;
                aux=aux.getNext();
            }
            alumno temp=aux.getNext();
            aux2.setNext(temp);}
            System.out.println("Eliminado -- "+aux.getCodigo());
            tamanio--;
            
    }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void eliminarxNota(){
        if(!isEmpty()){
            System.out.print("Ingrese Nota: ");
            double not=sc.nextDouble();
            alumno aux=inicio;
            alumno aux2=aux;
            if(not==inicio.getNota()){
                inicio=aux.getNext();
            }else{
            for(int i=0;i<tamanio && not!=aux.getNota() ;i++){
                aux2=aux;
                aux=aux.getNext();
            }
            alumno temp=aux.getNext();
            aux2.setNext(temp);}
            System.out.println("Eliminado -- "+aux.getNota());
            tamanio--;
        }else{
            System.out.println("La lista esta vacia");
        }
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.print("La lista esta vacia");
        } else {
            alumno aux = inicio;
            encabezado();
            int i = 0;
            while (aux != null) {
                System.out.println(i + ".- " + aux.getNombre() + "\t" + aux.getCodigo() + "\t" + aux.getNota());
                aux = aux.getNext();
                i++;
            }
        }
    }

    public void encabezado() {
        System.out.println("\n***************************************\n"
                + "Nombre\t\t Codigo\t Nota         *\n"
                + "***************************************");

    }

    public void buscar() {
        System.out.print("\n*************************\n"
                + "Buscar por:             *\n"
                + "1.- Nombre              *\n"
                + "2.- Codigo              *\n"
                + "3.- Nota                *\n"
                + "0.- Menu                *\n"
                + "*************************\n");
        System.out.print("Ingrese opcion: ");
        int opcion = sc.nextInt();
        if (opcion == 1) {
            sc.nextLine();
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            alumno aux = inicio;
            boolean find = false;
            while (aux != null || find != true) {
                if (aux.getNombre() == null ? nom == null : aux.getNombre().equals(nom)) {
                    System.out.println("Nombre encontrado: " + aux.getNombre());
                    System.out.println("Alumno : " + aux.getNombre() + "\t" + aux.getCodigo() + "\t" + aux.getNota());
                    break;
                } else {
                    aux = aux.getNext();
                }
                if (aux == null) {
                    System.out.println("Nombre no encontrado");
                    break;
                }
            }
        }
        if (opcion == 2) {
            sc.nextLine();
            System.out.print("Codigo: ");
            String cod = sc.nextLine();
            alumno aux = inicio;
            boolean find = false;
            while (aux != null || find != true) {
                if (cod.equals(aux.getCodigo())) {
                    System.out.println("Codigo encontrado: " + aux.getCodigo());
                    System.out.println("Alumno : " + aux.getNombre() + "\t" + aux.getCodigo() + "\t" + aux.getNota());
                    break;
                } else {
                    aux = aux.getNext();
                }
                if (aux == null) {
                    System.out.println("Codigo no encontrado");
                    break;
                }
            }
        }
        if (opcion == 3) {
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            boolean find = false;
            alumno aux = inicio;
            while (aux != null || find != true) {
                if (nota == aux.getNota()) {
                    System.out.println("Nota encontrada: " + aux.getNota());
                    System.out.println("Alumno : " + aux.getNombre() + "\t" + aux.getCodigo() + "\t" + aux.getNota());
                    break;
                } else {
                    aux = aux.getNext();
                }
                if (aux == null) {
                    System.out.println("Nota no encontrada");
                    break;
                }
            }
        }
    }

    public void ordenarxCodigo() {
        if (!isEmpty()) {
            for (int i = 0; i < tamanio; i++) {
                alumno aux = inicio;
                alumno aux2 = aux.getNext();
                String tempNom, tempCod;
                double tempNot;

                while (aux2 != null) {
                    if (aux.getCodigo().compareToIgnoreCase(aux2.getCodigo()) > 0) {

                        tempCod = aux.getCodigo();
                        aux.setCodigo(aux2.getCodigo());
                        aux2.setCodigo(tempCod);

                        tempNom = aux.getNombre();
                        aux.setNombre(aux2.getNombre());
                        aux2.setNombre(tempNom);

                        tempNot = aux.getNota();
                        aux.setNota(aux2.getNota());
                        aux2.setNota(tempNot);
                    }
                    aux = aux2;
                    aux2 = aux2.getNext();
                }
            }
            mostrar();

        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void ordenarxNombre() {
        if (!isEmpty()) {
            for (int i = 0; i < tamanio; i++) {
                alumno aux = inicio;
                alumno aux2 = aux.getNext();
                String tempNom, tempCod;
                double tempNot;

                while (aux2 != null) {
                    if (aux.getNombre().compareToIgnoreCase(aux2.getNombre()) > 0) {
                        tempNom = aux.getNombre();
                        aux.setNombre(aux2.getNombre());
                        aux2.setNombre(tempNom);

                        tempCod = aux.getCodigo();
                        aux.setCodigo(aux2.getCodigo());
                        aux2.setCodigo(tempCod);

                        tempNot = aux.getNota();
                        aux.setNota(aux2.getNota());
                        aux2.setNota(tempNot);
                    }
                    aux = aux2;
                    aux2 = aux2.getNext();
                }

            }
            mostrar();
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void ordenarxNota() {
        if (!isEmpty()) {
            for (int i = 0; i < tamanio; i++) {
                double tempNot;
                String tempNom, tempCod;
                alumno aux = inicio;
                alumno aux2 = aux.getNext();

                while (aux2 != null) {

                    if (aux.getNota() > aux2.getNota()) {

                        tempNot = aux.getNota();
                        aux.setNota(aux2.getNota());
                        aux2.setNota(tempNot);

                        tempNom = aux.getNombre();
                        aux.setNombre(aux2.getNombre());
                        aux2.setNombre(tempNom);

                        tempCod = aux.getCodigo();
                        aux.setCodigo(aux2.getCodigo());
                        aux2.setCodigo(tempCod);
                    }
                    aux = aux2;
                    aux2 = aux2.getNext();

                }
            }
            mostrar();

        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public boolean isEmpty() {
        return inicio == null;
    }
}
