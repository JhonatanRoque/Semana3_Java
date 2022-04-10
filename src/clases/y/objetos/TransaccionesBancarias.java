package clases.y.objetos;

import java.util.Scanner; //Clase Scanner para el ingreso de datos desde teclado


public class TransaccionesBancarias {
    public static void main(String[] args) {
         //Crear el objeto propietario
        CuentaBancaria cuenta = new CuentaBancaria(); //Crear instancia (objeto) de la clase CuentaBancaria
        Scanner leer = new Scanner(System.in); //Objeto leer de la clase Scanner para ingreso de datos desde teclado
        
        String duiCliente, nombreCliente;
        long telefonoCliente;
        
        double abono, retiro;
        
        try{
            System.out.println("Ingresar los datos que se piden a continuación:");
            System.out.println("Nombre del propietario: ");
            nombreCliente = leer.nextLine(); //Asignar valores a los atributos de la clase
            
            System.out.println("Número de DUI: ");
            duiCliente = leer.nextLine(); //Asignar valores a los atributos de la clase
            
            System.out.println("Télefono: ");
            telefonoCliente = leer.nextLong(); //Asignar valores a los atributos de la clase
            
            Cliente propietario = new Cliente(duiCliente, nombreCliente, telefonoCliente);
            cuenta.propietarioCuenta = propietario; //Asignamos el objeto propietario al objeto cuenta
            
            System.out.println("Ingresar la cantidad a abonar: ");
            cuenta.abonar(abono=leer.nextDouble()); //Envio de parámetros al metodo abonar
        
            System.out.println("Ingresar la cantidad a retirar: ");
            cuenta.retirar(retiro=leer.nextDouble());
        
            System.out.println("-------------------------------------");
            
            System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);
            //Obtener la informacíon del propietario
            System.out.println("Datos del propietario      :\n" + cuenta.datosPropietarioCuenta());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
