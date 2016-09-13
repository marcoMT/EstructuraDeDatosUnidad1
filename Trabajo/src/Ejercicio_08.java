/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Metodo recursivo que recorre un arreglo para encontrar el dato mayor.
 * */
public class Ejercicio_08 {
	static int [] datos={20,15,10,25,12};
	int i = 0;
	static int mayor= datos[0];
	
	public void datoMayor(int arreglo[]){
		if(i<datos.length){
			if(arreglo[i]>mayor){
				mayor = arreglo[i];	
			}
			i++;
			datoMayor(arreglo);
		}
		
	}
	
	public static void main(String[] args) {
		Ejercicio_08 objeto = new Ejercicio_08();
		objeto.datoMayor(datos);
		System.out.println("El numero mayor es: " + mayor);
	}

}
