package ejercicios;
/*
Crear la clase FormatoFecha para probar el Polimorfismo. La clase deberá de tener dos métodos
que reciban una fecha sin guiones ni plecas en formato String. Ejemplo 10062012

a) El primer método deberá de imprimir la fecha con guiones. Ejemplo 10-06-2012
b) El segundo método deberá de imprimir la fecha con plecas. Ejemplo 10/06/2012
*/
import java.io.*;

public class Ejercicio6_FormatoFecha {
    public static void main(String[] args) {
        //Crear objeto de lectujra de datos desde  teclado
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Crear objeto de la clase FormatoFecha
        FormatoFecha formatFecha = new FormatoFecha();
        //Atributos
        String fecha;
        
        try{
            System.out.println("Digite la fecha sin guiones ni plecas: ");
            fecha = leer.readLine();
            
            //Llenado de atributos de la clase FormatoFecha
            formatFecha.setFecha(fecha);
            
            //Llamado de métodos de la clase FormatoFecha
            System.out.println("Fecha con plecas   : " + formatFecha.Fecha(fecha));
            System.out.println("Fecha con guiones  : " + formatFecha.Fecha());
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
