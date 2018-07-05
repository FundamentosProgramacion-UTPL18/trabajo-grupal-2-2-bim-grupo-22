/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
PROGRAMA QUE PERMITE CALCULAR EL PROMEDIO DE CALIFICACIONES.
 */
package paquete1;

/**
 *
 * @authores Carlos Castillo & Renato Balcazar
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglos globales inicializados.
        String[] nombres = {"José", "María", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edades = {20, 19, 20, 19, 25};
        double[] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double[] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};
        //Arreglo global que guarda los objetos.
        Estudiante[] estudiante = new Estudiante[nombres.length];

        //Ciclo que permite recorrer todos los arreglos.
        for (int contador = 0; contador < nombres.length; contador++) {
            Estudiante est = new Estudiante();  //Creamos el objeto de tipo Estudiante.

            //Asiganamos los valores a cada objeto.
            est.nombres = nombres[contador];
            est.apellidos = apellidos[contador];
            est.edad = edades[contador];
            est.calificacion1 = calificaciones1[contador];
            est.calificacion2 = calificaciones2[contador];

            estudiante[contador] = est;    //Llenamos el arreglo 'estudiante' con los objetos.

        }

        //ciclo que permite presentar el reporte de cada estudiante.
        for (int contador = 0; contador < estudiante.length; contador++) {
            estudiante[contador].presentar();
        }

    }

}
