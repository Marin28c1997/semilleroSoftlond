package RegistroAlumnos;

import javax.swing.JOptionPane;

public class SistemaAlumnos extends Alumno{

    public SistemaAlumnos(String nombre, int edad, float[] calificacion, String apellido) {
        super(nombre, edad, calificacion, apellido);

        int nAlumnos;
        String alumnos;
        do {
            alumnos = JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad de alumnos que va a registrar:","Sistema de registro",1);
            nAlumnos = alumnos.isEmpty() ? 0 : Integer.parseInt(alumnos);
        } while (nAlumnos <= 0);
        

        for (int i = 0; i < nAlumnos; i++) { 
            do {
            nombre = JOptionPane.showInputDialog(null, "Por favor ingrese el nombre del alumno " + (i + 1) + ":", "Sistema de registro",1);
        } while (nombre.isEmpty());
this.setNombre(nombre);
     do {
            apellido = JOptionPane.showInputDialog(null, "Por favor ingrese el apellido del alumno " + (i + 1) + ":", "Alumno "+getNombre(),1);
        } while (apellido.isEmpty());
        this.setApellido(apellido);
        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la edad del alumno " + (i + 1) + ":",  "Alumno "+getNombre(),1));
            if (edad < 5 || edad > 90) {
                JOptionPane.showMessageDialog(null, "Edad fuera del rango válido (5 a 90)", "Error de edad", 0);
            }
        } while (edad < 5 || edad > 90);
this.setEdad(edad);

        int nCalificaciones;
        String calificaciones;
        
        do {
            calificaciones = JOptionPane.showInputDialog(null, "Por favor ingrese la cantidad de notas para el alumno " + (i + 1) + ":",  "Alumno "+getNombre(),1);
            nCalificaciones = calificaciones.isEmpty() ? 0 : Integer.parseInt(calificaciones);
        } while (nCalificaciones <= 0);
        
        float[] arregloNotas = new float[nCalificaciones];
        
        for (int j = 0; j < nCalificaciones; j++) {
            String calificacionStr = JOptionPane.showInputDialog(null, "Por favor ingrese la calificación " + (j + 1) +" del alumno " + (i + 1) + ":", "Alumno "+getNombre(),1);
            float califica = Float.parseFloat(calificacionStr);
            if (califica > 5 || califica <= 0) {
                JOptionPane.showMessageDialog(null,"Por favor ingrese una nota entre 1 a 5","Error de nota" ,0111);
                j--;
            } else {
                arregloNotas[j] = califica;     
            }
        }
        

            this.setCalificacion(arregloNotas);

          JOptionPane.showMessageDialog(null, "Nombre:\n"+this.getNombre()+" "+this.getApellido() + "\nEdad:\n"+this.getEdad() +"\nPromedio:\n"+calcularPromedio() + "\nNotas:\n"+this.getCalificacion(),"Información del alumno",1);
        }

    
        
    }
    

    private float calcularPromedio() {
        float suma = 0;
        for (float calificacion : this.getCalificacion()) {
            suma += calificacion;
        }
        return suma / this.getCalificacion().length;
    }
    

}
