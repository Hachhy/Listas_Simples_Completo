
package listaSimple.newpackage;

import listaAlumno.*;


public class alumno {
    private String nombre;
    private alumno next;
    
    public alumno(){
        this.nombre="";
        this.next=null;
    }
    
    public alumno(String nom, alumno next){
        this.nombre=nom;
        this.next=next;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public alumno getNext(){
        return next;
    }
    
    public void setNext(alumno next){
        this.next=next;
    }
    
}
