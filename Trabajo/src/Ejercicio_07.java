/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Convertir un numero en cadena utilizando un Método Recursivo
 * */
import java.util.Scanner;


public class Ejercicio_07 {
    static String cadena = "";
    static int i = 0;
    
    
    public static String entroCadena(int n) {
        
        String numero = String.valueOf(n);
        char simple = numero.charAt(i);
        
        switch (simple) {
            case '0':
                cadena = cadena + "cero ";
                break;
            case '1':
                cadena = cadena + "uno ";
                break;

            case '2':
                cadena = cadena + "dos ";

                break;

            case '3':
                cadena = cadena + "tres ";
                break;

            case '4':
                cadena = cadena + "cuatro ";
                break;

            case '5':
                cadena = cadena + "cinco ";
                break;

            case '6':
                cadena = cadena + "seis ";
                break;

            case '7':
                cadena = cadena + "siete ";
                break;

            case '8':
                cadena = cadena + "ocho ";
                break;

            case '9':
                cadena = cadena + "nueve ";
                break;
        }
        i++;
         if(i < numero.length()){
             Ejercicio_07.entroCadena(n);
        }
        
        
        return cadena.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 1 y 9999: ");
        int numero = teclado.nextInt();

        //String cadena = entroCadena(numero);
        if (numero > 0 && numero < 10000) {
            Ejercicio_07 objeto = new Ejercicio_07();
            objeto.entroCadena(numero);
            System.out.println(cadena);
        } else {
            System.out.println("El numero ingresado es invalido");
        }

    }
}

