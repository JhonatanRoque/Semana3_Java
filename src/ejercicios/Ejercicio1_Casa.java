package ejercicios;
/*
Modelar una clase Casa (DatosDeCasa) con los atributos número de casa, numero de pasaje y nombre de la calle.
El numero de la casa debe ser alfanúmerico para contemplar las casas que tengan números como "27A". Cuando la 
casa se crea se asigna tanto el número de la casa, el núnmero de pasaje y la calle. La calse tiene que tener 
definido un método par imprimir los valores asignados.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio1_Casa {
    public static void main(String[] args) {
        String NumCasa, Calle;
        int NumPasaje;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); //Crear instancia que leera los datos introducidos desde teclado
        
        try{
            System.out.println("Digitar los datos que se piden a continuación: ");
            System.out.println("Número de Casa: ");
            NumCasa = leer.readLine();
            
            System.out.println("Nombre de la Calle: ");
            Calle = leer.readLine();
            
            System.out.println("Número de pasaje: ");
            NumPasaje = leer.read();
            
            DatosDeCasa casa = new DatosDeCasa(NumCasa, Calle, NumPasaje); //Crear objeto Casa 
            
            System.out.println("---------------------");
            //Mostrar los datos ingresados en la clase Casa(DatosDeCasa), desde el método GetDatosDeCasa
            casa.getDatosDeCasa();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
