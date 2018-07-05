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

    String nombres;
    String apellidos;
    int edad;
    double calificacion1, calificacion2;

    public double obtener_promedio() {
        double promedio, suma = 0;
        suma = suma + calificacion1 + calificacion2;
        promedio = suma / 2;
        return promedio;
    }

    public void presentar() {
        System.out.printf("%s %s\n"
                + "Edad = %d\n"
                + "Calificacion 1: %.1f\n"
                + "Calificacion 2: %.1f\n"
                + "Promedio: %.2f\n\n",
                nombres, apellidos,
                edad,
                calificacion1,
                calificacion2,
                obtener_promedio());
    }

}
