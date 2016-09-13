/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Métodos de Recursividad
 * 1.- Contar hasta N numero
 * 2.- Realizar cuenta regresiva desde N número
 * */
public class Ejercicio_04 {
	
	static int factorial (int numero){
		if (numero <= 1){
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}
	
	//Metodo para contar de 1...N
	
	static int inicial = 1;
	static void cuentaHasta(int n){
		if(inicial <= n){
			System.out.println(inicial);
			inicial++;
			cuentaHasta(n);
		}
	}
	//Metodo para una cuenta regresiva a partir de N a 0
	static void cuentaRegresiva(int m){
		if(m >=0){
			System.out.println(m);
			m--;
			cuentaRegresiva(m);
		}
	}
	
	
	public static void main(String args []){
		//System.out.println(factorial(5));
		//cuentaHasta(5);
		cuentaRegresiva(10);
	}
	
}
