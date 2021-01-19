/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author trm
 */
public class EjerciciosBasicosJava {
    /**
     * 
     * @param numBellotas
     * @param finDeSemana
     * @return 
     */
    public boolean fiestaArdillas (int numBellotas, boolean finDeSemana){
        // si es fin de semana da igual cuantas bellotas haya
        if (finDeSemana){
            return true;
        }
        // no es fin de semana
        if (numBellotas >= 40 && numBellotas <= 60){
            return true;
        }
        return false;
    }
    
    // Si la velocidad es 
    public int multa(int velocidad, boolean birthday){
        // si es tu cumple, le resta 5 a la velocidad
        if (birthday){
            velocidad = velocidad - 5; //velocidad -= 5;
        }
        // si vamos a menos de 60 km
        if  (velocidad <= 60){
            return 0;
        }
        // si va entre 61 y 80
        if (velocidad > 60 && velocidad <= 80){
            return 1;
        }
        // en culaquier valor superior devolvemos multa grande
        return 2;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase (Ejercicios basicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        // Ejercicio fiesta de ardillas
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        // Ejercicio de multa
        System.out.println(ejercicio.multa(60, true));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(85, false));


    }
    
}
