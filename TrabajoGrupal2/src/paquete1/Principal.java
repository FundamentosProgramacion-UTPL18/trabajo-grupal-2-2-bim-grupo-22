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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [ ] nombres = {"José", "María", "Ana", "Paul", "David"};
        String [ ] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int [ ] edades = {20, 19, 20, 19, 25};
        double [ ] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double [ ] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};
        Estudiante [ ] estudiante = new Estudiante [ nombres.length] ;
        
        for (int contador = 0; contador < nombres.length; contador ++){
            Estudiante est = new Estudiante();
            est.nombres = nombres[contador];
            est.apellidos = apellidos[contador];
            est.edad = edades[contador];
            est.calificacion1 = calificaciones1[contador];
            est.calificacion2 = calificaciones2[contador];
            estudiante[contador] = est;    
            
        }
         for (int contador = 0; contador < estudiante.length; contador ++){
             estudiante[contador].presentar();
         }
        
        
        
    }
    
}
