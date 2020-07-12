package listaAlumno2;

public class alumno {

    private String nombre, codigo;
    private double nota;
    private alumno next;

    public alumno() {
        this.nombre = "";
        this.codigo = "";
        this.nota = 0;
        this.next = null;
    }

    public alumno(String nom, alumno next, String cod, double n) {
        this.nombre = nom;
        this.codigo = cod;
        this.nota = n;
        this.next = next;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String cod) {
        this.codigo = cod;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double n) {
        this.nota = n;
    }

    public alumno getNext() {
        return next;
    }

    public void setNext(alumno next) {
        this.next = next;
    }
}
