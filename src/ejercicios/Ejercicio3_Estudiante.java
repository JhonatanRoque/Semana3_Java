package ejercicios;

import java.util.*;

public class Ejercicio3_Estudiante {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); //Inistancia leer para introducir datos desde teclado
        Estudiante est = new Estudiante(); //Instancia de la clase Estudiante
        //Variables
        long nCarnet, codCarrera;
        String nombre;
        //Ingreso de Datos
        for (int i=1; i<=5; i++){
            System.out.println("Ingrese el Numero de Carnet del Estudiante " + i + ": ");
            nCarnet = leer.nextLong();
            System.out.println("Ingrese el Nombre del Estudiante " + i + ": ");
            nombre = leer.next();
            System.out.println("Ingrese el Codigo de Carrera del Estudiante " + i + ": ");
            codCarrera = leer.nextLong();
            
            est.RegistroEstudiantes(i, nCarnet, nombre, codCarrera);
            
        }
        //Mostrar los datos en pantalla
        System.out.println(est.MostrarDatos());
        
        
    }
}
