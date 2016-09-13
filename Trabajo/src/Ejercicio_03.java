/*
 * Universidad: UTNG
 * Carrera: Sistemas Informaticos
 * Autor: Marco Antonio Mendiola Torres
 * No. Control: 1215100899
 * Objetivo del Programa: Clase que busca los datos mayores y menores de un arreglo
 * */
public class Ejercicio_03 {

    public static void main(String[] args) {
        String[] nombre=new String [10];// Declaracion de arreglo tipo String para saber el nombre de los empleados    
        String nombreMay = null;// Variable que almacena el Nombre con mayor horas trabajadas 
        String nombreMenor = null;// Variable que almacena el nombre de empleados con menor horas 
        
        double mayor=0;
        String []nompro=new String [10];
        double menor=1000;
        double [] hora=new double[10];
        String  categoria = null;
        double [] sueldo=new double[10];
        
        double horaMax=0;
        String nomHoraMax = null;
         double  horaMin=600;
        String nomHoraMin = null;
        
        double p = 0;
         java.util.Scanner leer = new java.util.Scanner(System.in);
         int i;
        for ( i = 0; i < 10; i++) {
           System.out.println("Ingrese el nombre del empleado  ");
	     nombre[i]=leer.next();
             System.out.println("Ingresa la categoria ");
             categoria=leer.next();
             System.out.println("Ingrese las horas del empleado ");
             hora[i]=leer.nextDouble();
             
             if(categoria.equalsIgnoreCase("A")){
                 sueldo[i]=hora[i]*150;
             }
             if(categoria.equalsIgnoreCase("B")){
                  sueldo[i]=hora[i]*250;
             }
             if(categoria.equalsIgnoreCase("C")){
                  sueldo[i]=hora[i]*500;
             }
             
             if(sueldo[i]>=mayor){
                 mayor=sueldo[i];
                 nombreMay=nombre[i];
             }
             if(sueldo[i]<=menor){
                 menor=sueldo[i];
                 nombreMenor=nombre[i];
             }
             if(hora[i]>=horaMax){
                 horaMax=hora[i];
                 nomHoraMax=nombre[i];
             }
             if(hora[i]<=horaMin){
                 horaMin=hora[i];
                 nomHoraMin=nombre[i];
             }
             
            p=p+sueldo[i];
            nompro=nombre;
        }
        double promedio=p/i;
        String nomPromedioMayor=null,nomProMenor=null;
        
        for (int j = 0; j < 2; j++) {
            if(sueldo[j]>=promedio){
                nomPromedioMayor=nompro[j];
            }
             if(sueldo[j]<promedio){
                nomProMenor=nompro[j];
            }
            
        }
      
        System.out.println("El sueldo mayor es "+mayor +"Del empleado "+nombreMay);
        System.out.println("El sueldo menor es "+menor+"Del empleado  "+nombreMenor);
        System.out.println("El promedio del sueldo semanal es "+promedio);
        System.out.println("El nombre del empleado con mas horas trabajadas son "+nomHoraMax +" las horas son "+ horaMax);
        System.out.println("El nombre del empleado con menos horas trabajadas son "+nomHoraMin+"  y las horas son  "+ horaMin);
        System.out.println("Nombre del empleado que gana igual o mas que el promedio "+ nomPromedioMayor);
        System.out.println("Nombre del empleado que gana menos que el promedio "+nomProMenor);
       
    }
    
}
