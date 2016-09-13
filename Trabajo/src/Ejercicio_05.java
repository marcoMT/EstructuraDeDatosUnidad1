/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Maximo Comun Divisor
 * 1.- Calcular el Maximo comun divisor
 * */
public class Ejercicio_05 {
	
	static int divisor(int n1,int n2){
		if(n2 == 0){
			return n1;
		} else{
			return divisor(n2, n1 % n2);
		}
		
		
	}
	
	public static void main(String args[]) {
		System.out.println(divisor(8, 12));
	}
}
