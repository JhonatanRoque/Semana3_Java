package EncapsulamientoHerencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //Objeto de la clase Estudiante
        //Agregar la clase respectiva para la lectura de datos desde teclado
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try{
            //Ingreso de los respectivos valores
            System.out.println("Carnet del Estudiante: ");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombre del Estudiante: ");
            String nombre = leer.readLine();
            System.out.println("Apellidos del Estudiante: ");
            String apellido = leer.readLine();
            
            //Asignando los valores a cada atributo
            est.setCarnetEstudiante(carnet);
            est.setNombreEstudiante(nombre);
            est.setApellidoEstudiante(apellido);
            
            //Recuperación de datos
            System.out.println("<<<<<<<Recuperanndo Valores>>>>>>>");
            System.out.println("Carnet            : " + est.getCarnetEstudiante());
            System.out.println("Nombre            : " + est.getNombreEstudiante());
            System.out.println("Apellido          : " + est.getApellidoEstudiante());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
