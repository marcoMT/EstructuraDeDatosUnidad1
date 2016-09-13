/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Uso de un solo ciclo para mostrar informacion
 * */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio_02 {
	static final String DATA_PATH="datos.txt";
	
	public static void main(String[] args){
		Scanner fileReader = null;
			
		try{
			fileReader = new Scanner(new File(DATA_PATH));
			System.out.println("Archivo Encontrado: " + fileReader);
			
		}catch(FileNotFoundException e){
			System.out.println("EL Archivo " + DATA_PATH + " No se encuentra!!!");
			System.out.println("Programa Terminado ");
			System.exit(0);
		}
		
		int contador = 1;
		int datoleido1,datoleido2;
		
		
		while(fileReader.hasNextLine()){
			datoleido1= fileReader.nextInt();
			datoleido2= fileReader.nextInt();
			System.out.println(contador + ":producto: " + datoleido1 + " serie: "+datoleido2);
			contador++;
		}
		
		
		
		
	}

}