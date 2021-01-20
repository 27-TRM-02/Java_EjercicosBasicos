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
    
    /**
     * 
     * @param velocidad
     * @param birthday
     * @return 
     */
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
     * 
     * @param n
     * @return 
     */
    public boolean muyVanidoso(int n){
        if ((n % 11) == 0 || ((n % 11) == 1)){
            return true;
        } 
        return false;
    }
    
    /**
     * 
     * @param matinal
     * @param madre
     * @param dormido
     * @return 
     */
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        if (dormido){
            return false;
        }else if (matinal && !madre){
            return false;
        }
        return true;
    }
    
    public boolean menorPor10(int a, int b, int c){
        if (a + 10 == b || b + 10 == a){
            return true;
        }
        if (b + 10 == c || c + 10 == b){
            return true;
        }
        if (c + 10 == a || a + 10 == c){
            return true;
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase (Ejercicios basicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        // Ejercicio fiesta de ardillas
        System.out.println("EJERCICIO 01 - FIESTA DE ARDILLAS");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        // Ejercicio de multa
        System.out.println("EJERCICIO 02 - MULTA");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));   
        
        // Ejercicio muyVanidoso, numero multiplo + 1 de 11
        System.out.println("EJERCICIO 03 - MUY VANIDOSO");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        
        System.out.println("EJERCICIO 04 - CONTESTA AL MOVIL");
        System.out.println(ejercicio.contesta(false, false, false));
        System.out.println(ejercicio.contesta(false, false, true));
        System.out.println(ejercicio.contesta(true, false, false));
        
        System.out.println("EJERCICIO 05 - DIFERENCIA DE 10");
        System.out.println(ejercicio.menorPor10(1, 7, 11));
        System.out.println(ejercicio.menorPor10(1, 7, 10));
        System.out.println(ejercicio.menorPor10(11, 1, 7));
        
    }
    
}
