/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Carlos
 */
public class Estudiante {

    String nombres; // Variable para el nombre
    String apellidos; // Variable para el apellido
    int edad; // Variable para la edad
    double calificacion1, calificacion2; // Variable para las calificaciones

    // Metodo que sirva para obtener el promedio
    public double obtener_promedio() {
        double promedio, suma = 0; // Declaro las variables necesarias
        suma = suma + calificacion1 + calificacion2; // Suma las calificaciones
        promedio = suma / 2; // Obtendo el promedio
        return promedio; // Retorna el promedio
    }
    
    // Metodo para presentar
    public void presentar() {
        // Presenta en pantalla los datos
        System.out.printf("%s %s\n"
                + "Edad = %d\n"
                + "Calificacion 1: %.1f\n"
                + "Calificacion 2: %.1f\n"
                + "Promedio: %.2f\n\n",
                nombres, apellidos, 
                edad,
                calificacion1,
                calificacion2,
                obtener_promedio()); // Llamada al metodo de obtener_promedio
    }

}
