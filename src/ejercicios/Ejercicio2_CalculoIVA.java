package ejercicios;
/*
Modelar una clase CalculoIva para realizar el cálcuulo del IVA. La clase deberá de tener dos métodos,
el primero que calcule el IVA al precio de un articulo el cual deberá de recibir como parámetros el 
precio sin IVA y el porcentaje del IVA a aplicar y el segundo que reciba como páramtero el precio del 
artículo con IVA y el porcentaje del IVA y que devuelva el precio del articulo sin IVA.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio2_CalculoIVA {
    public static void main(String[] args) {
        double precio, porcentajeIva;
        int eleccion;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in)); //Crear instancia que leera los datos introducidos desde teclado
        
        try{
            System.out.println("Introduzca los datos que se solicitan a continuación: ");
            System.out.println("Digite el porcentaje de iva (introduzca numeros enteros ejemplo: 5, 10, 15): ");
            porcentajeIva = Double.parseDouble(leer.readLine());
            
                System.out.println("Opciones: Calcular Iva del producto. Digite 1");
                System.out.println("          Calcular precio del producto sin Iva. Digite 2");
                eleccion = Integer.parseInt(leer.readLine());
                if(eleccion == 1){
                    System.out.println("Digite el precio del producto: ");
                    precio = Double.parseDouble(leer.readLine());
                    CalculoIva calcIva = new CalculoIva(porcentajeIva, precio);
                    calcIva.CalcularIva();
                }
                else if(eleccion == 2){
                    System.out.println("Digite el precio del producto: ");
                    precio = Double.parseDouble(leer.readLine());
                    CalculoIva calcIva = new CalculoIva(porcentajeIva, precio);
                    calcIva.precioSinIva();
                }
          
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
 
}
