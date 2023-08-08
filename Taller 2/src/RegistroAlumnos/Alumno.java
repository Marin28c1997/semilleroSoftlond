package RegistroAlumnos;

public class Alumno {
    private String nombre;
    private int edad;
    private float[] calificacion;
    private String apellido; 
    
    public Alumno(String nombre, int edad, float[] calificacion, String apellido){
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float[] getCalificacion() {
        return calificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCalificacion(float[] calificacion) {
        this.calificacion = calificacion;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}
