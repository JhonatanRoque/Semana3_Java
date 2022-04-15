package ejercicios;
/*
Crear la clase llamada Empleado utilizando Encapsulamiento con las siguientes características: 


Atributos: (No Nit, Apellidos, Nombres, Dirección, Salario Devengado, Salario con Descuentos, Bandera de Empleado
Activo o Inactivo)

Métodos: 
    a) Crear un método para calcular el salario con descuento que es el salario devengado - descuentos
    b) Descuento del 10% de renta
    c) Crear un método para imprimir el nombre completo del contribuyente
    d) Imprimir todos los atributos
    e) Crear el método para probar el funcionamiento de la clase y realizaar sus pruebas
*/
import java.io.*;

public class Ejercicio4_Empleado {
    public static void main(String[] args) {
        //Crear objeto que leera datos desde teclado
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Objeto Empleado
        Empleado empl = new Empleado();
        long numeronit;
        String nombre, apellido, direccion, estadoEmpleado;
        double salariobruto;
        try{
            //Ingreso de datos
            System.out.println("Ingrese el Número de NIT: ");
            numeronit = Long.parseLong(leer.readLine());
            System.out.println("Nombre: ");
            nombre = leer.readLine();
            System.out.println("Apellido: ");
            apellido = leer.readLine();
            System.out.println("Dirección: ");
            direccion = leer.readLine();
            System.out.println("A contonuación digite el estado del contribuyente: Activo, Inactivo");
            estadoEmpleado = leer.readLine();
            
            System.out.println("Introduzca el salario devengado: ");
            salariobruto = Double.parseDouble(leer.readLine());
            
            //Rellenar nuestros atributos de la clase Empleado
            empl.setNumNIT(numeronit);
            empl.setNombres(nombre);
            empl.setApellidos(apellido);
            empl.setDireccion(direccion);
            empl.setSalarioDevengado(salariobruto);
            empl.setEstadoEmpleado(estadoEmpleado);
            
            //Llamar los metodos de la clase Empleado
            empl.calcRenta(salariobruto);
            empl.calcSalarioConDescuento(salariobruto, empl.getRenta());
            System.out.println("-------------------------------------------------------------");
            System.out.println("Nombre completo del contribuyente: ");
            System.out.println(empl.nombreCompleto(nombre, apellido));
            System.out.println("---Datos completos---");
            System.out.println(empl.datosCompletos());
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
