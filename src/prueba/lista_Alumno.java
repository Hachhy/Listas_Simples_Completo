
package prueba;

import listaAlumno.*;


public class lista_Alumno {
    private int tamanio;
    private alumno inicio;
    
    public lista_Alumno(){        
        this.inicio=null;
        this.tamanio=0;
    }
    
    public void ingresar(String nom){
        alumno nuevo=new alumno();
        nuevo.setNombre(nom);
        if(isEmpty()){
            inicio=nuevo;
        }else{
            nuevo.setNext(inicio);
            inicio=nuevo;            
        }
        tamanio++;        
    }
    
    public void eliminar(){
        if(isEmpty()){
            System.out.print("La lista esta vacia");
        }else{
            alumno aux=inicio;
            String auxdata=aux.getNombre();
            aux=aux.getNext();            
            inicio=aux;
            System.out.print("El nombre "+auxdata+" se eliminó");
            tamanio--;
        }    
    }
    
    public void mostrar(){
        if(isEmpty()){
            System.out.print("La lista esta vacia");
        }else{
            alumno aux=inicio;
            System.out.println("\n*************************\n"
                    +"Lista de Alumnos        *\n"
                    +"*************************\n");
            while(aux!=null){
                System.out.println(aux.getNombre());
                aux=aux.getNext();
            }
        }
    }
    
    public boolean isEmpty(){
        return inicio==null;
    }
}
