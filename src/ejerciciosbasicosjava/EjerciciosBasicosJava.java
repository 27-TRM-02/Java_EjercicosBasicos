
package ejerciciosbasicosjava;

/**
 * @author trm - tomás rodriguez-mata
 * Ejercicios básicos Java
 */
public class EjerciciosBasicosJava {
    /**
     * Función que califica como fiesta de éxito o no, dependiendo
     * cuantas bellotas haya(40 - 60) y si es fin de semana
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
     * Dependiendo de tu velocidad y de si es tu cumpleaños,
     * tu multa puede ser de 0. 1. 2.
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
     * Si numero es multiplo de 11, o si es una de mas de un multiplo,
     * devuelve true
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
     * Funcion que evalua true si debe coger el movildependiendo quien sea,
     * y si es por la mañana o no.
     * @param matinal
     * @param madre
     * @param dormido
     * @return 
     */
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        // si esta dormido no lo coge
        if (dormido){
            return false;
         // si es por la mañana y no es su madre, no lo coge
        }else if (matinal && !madre){
            return false;
        }
        return true;
    }
    
    /**
     * Devuelve true, si la diferencia entre alguno de los 
     * enteros, es exactamente 10
     * @param a
     * @param b
     * @param c
     * @return 
     */
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
     * Devuelve true, si alguno de las cifras de los numeros recibidos,
     * de dos cifras, es igual que el del otro numero
     * @param a
     * @param b
     * @return 
     */
    public boolean digitoIgual(int a, int b){
        if (a / 10 == b / 10 || a / 10 == b % 10){
            return true;
        }
        if (a % 10 == b / 10 || a % 10 == b % 10){
            return true;
        }
        if (b / 10 == a / 10 || b / 10 == a % 10){
            return true;
        }
        if (b % 10 == a / 10 || b % 10 == a % 10){
            return true;
        }
        return false;
    }
    
    /**
     * Devuelve true si el numero es multiplo de 3 y de 5,
     * pero NO de los dos a la vez
     * @param a
     * @return 
     */
    public boolean multiploMultiple(int a){
        if (a % 3 == 0 && a % 5 == 0){
           return  false;
        }
        if (a % 3 == 0 || a % 5 == 0){
           return  true;
        }
        return false;
    }
    
    /**
     * Devuelve true, si el numero es 1 o 2 menos que un multiplo de 20
     * @param a
     * @return 
     */
    public boolean menos20(int a){
        if ((a % 20) - 2 >= 2){
            return true;
        }
        return false;
    }
    
    /**
     * Si son todos de valor 2, devuelve 10
     * Si son iguales, pero dif de 2, devuelve 5
     * Si no devuelve 0
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int loteria(int a, int b, int c){
      if (a == 2 && b == 2 && c == 2){
        return 10;
      }
      if (a == b && b == c){
        return 5;
      }
      return 0;
    }
    
    /**
     * Devuelve el valor sumado de la tirada de los 2 dados
     * Si noDoubles es true, y las dos tiradas tienen el mismo valor,
     * devuelve la suma de los dados + 1.
     * @param dado1
     * @param dado2
     * @param noDoubles
     * @return 
     */
    public int withoutDoubles(int dado1, int dado2, boolean noDoubles){
        if (dado1 == dado2 && noDoubles){
            return dado1 + dado2 + 1;
        }
        return dado1 + dado2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase (Ejercicios basicosJava)
        EjerciciosBasicosJava ejercicio = new EjerciciosBasicosJava();
        
        // Salida por terminal del EJERCICIO 01
        System.out.println("EJERCICIO 01 - FIESTA DE ARDILLAS");
        System.out.println(ejercicio.fiestaArdillas(30, false));
        System.out.println(ejercicio.fiestaArdillas(50, false));
        System.out.println(ejercicio.fiestaArdillas(70, true));
        
        // Salida por terminal del EJERCICIO 02
        System.out.println("EJERCICIO 02 - MULTA");
        System.out.println(ejercicio.multa(60, false));
        System.out.println(ejercicio.multa(65, false));
        System.out.println(ejercicio.multa(65, true));   
        
        // Salida por terminal del EJERCICIO 03
        System.out.println("EJERCICIO 03 - MUY VANIDOSO");
        System.out.println(ejercicio.muyVanidoso(22));
        System.out.println(ejercicio.muyVanidoso(23));
        System.out.println(ejercicio.muyVanidoso(24));
        
        // Salida por terminal del EJERCICIO 04
        System.out.println("EJERCICIO 04 - CONTESTA AL MOVIL");
        System.out.println(ejercicio.contesta(false, false, false));
        System.out.println(ejercicio.contesta(false, false, true));
        System.out.println(ejercicio.contesta(true, false, false));
        
        // Salida por terminal del EJERCICIO 05
        System.out.println("EJERCICIO 05 - DIFERENCIA DE 10");
        System.out.println(ejercicio.menorPor10(1, 7, 11));
        System.out.println(ejercicio.menorPor10(1, 7, 10));
        System.out.println(ejercicio.menorPor10(11, 1, 7));
        
        // Salida por terminal del EJERCICIO 06
        System.out.println("EJERCICIO 06 - DIGITO IGUAL");
        System.out.println(ejercicio.digitoIgual(12, 23));
        System.out.println(ejercicio.digitoIgual(12, 43));
        System.out.println(ejercicio.digitoIgual(12, 44));
        
        // Salida por terminal del EJERCICIO 07
        System.out.println("EJERCICIO 07 - MULTIPLO MULTIPLE");
        System.out.println(ejercicio.multiploMultiple(3));
        System.out.println(ejercicio.multiploMultiple(10));
        System.out.println(ejercicio.multiploMultiple(15));
        
        // Salida por terminal del EJERCICIO 08
        System.out.println("EJERCICIO 08 - MENOS 20");
        System.out.println(ejercicio.menos20(18));
        System.out.println(ejercicio.menos20(19));
        System.out.println(ejercicio.menos20(20));
        
        // Salida por terminal del EJERCICIO 09   
        System.out.println("EJERCICIO 09 - LOTERIA");
        System.out.println(ejercicio.loteria(2, 2, 2));
        System.out.println(ejercicio.loteria(2, 2, 1));
        System.out.println(ejercicio.loteria(0, 0, 0));
        
        // Salida por terminal del EJERCICIO 10
        System.out.println("EJERCICIO 10 - SUMA DADOS");
        System.out.println(ejercicio.withoutDoubles(2, 3, true));
        System.out.println(ejercicio.withoutDoubles(3, 3, true));
        System.out.println(ejercicio.withoutDoubles(3, 3, false));
        System.out.println(ejercicio.withoutDoubles(6, 6, true));
    }
    
}
