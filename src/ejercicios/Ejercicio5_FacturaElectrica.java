package ejercicios;
/*
Crear la clase Factura Electrica utilizando Encapsulamiento con las siguientes características:

Atributos: (No Cuenta, Lectura actual del medidor, Lectura anterior del medidor, Multiplicador,
Consumo mensual, Consumo diario, valor factura)

Métodos: 
    a) Crear un método para calcular el Consumo en el mes
    b) Crear un método para calcular el Consumo diario
    c) Crear un método para calcular el Valor factura
    d) Imprimir todos los atributos
        Ejemplo del cálculo:
        Lectura anterior: 2010      Lectura actual 3025
        Multiplicador: 10           Días de facturación: 30
        Consumo: (lecturaActual - lecturaAnterior) * elMultiplicador
        Consumo: (3025kWh - 2010 kWh) * 10 = 10150kWh
        Valor Factura = Consumo * 0.20
    e)Crear el método main para probar el funcionamiento de la clase y realizar sus pruebas
*/
import java.io.*;
public class Ejercicio5_FacturaElectrica {
    public static void main(String[] args) {
        //Crear objeto de lectura para leer datos desde teclado
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //Instanciar objeto Factura Electrica
        FacturaElectrica facturaE = new FacturaElectrica();
        //Atributos 
        long NCuenta;
        int lecturaActual, lecturaAnterior, multiplicador;
        
        
        try{
            //lectura de datos
            System.out.println("Digite los datos que se le piden a continuación: ");
            System.out.println("Ingrese el número de la cuenta: ");
            NCuenta = Long.parseLong(leer.readLine());
            System.out.println("Ingrese el dato de Lectura Anterior del Medidor: ");
            lecturaAnterior = Integer.parseInt(leer.readLine());
            System.out.println("Ingrese el dato de Lectura Actual del Medidor: ");
            lecturaActual = Integer.parseInt(leer.readLine());
            System.out.println("Digite el multiplicador de su Medidor: ");
            multiplicador = Integer.parseInt(leer.readLine());
            
            //Asignamos los datos a los atributos de la clase factura electrica
            facturaE.setNumCuenta(NCuenta);
            facturaE.setLecturaActualMedidor(lecturaActual);
            facturaE.setLecturaAnteriorMedidor(lecturaAnterior);
            facturaE.setMultiplicador(multiplicador);
            
            //Llamada de métodos de la clase Factura Electrica
            facturaE.calcConsumoMensual(lecturaActual, lecturaAnterior, multiplicador);
            int consumoMensual = facturaE.getConsumoMensual();
            System.out.println("Consumo mensual: " + consumoMensual);
            facturaE.calcConusmoDiario(consumoMensual);
            facturaE.calcValorFactura(facturaE.getConsumoMensual());
            
            //Mostrar datos 
            System.out.println(facturaE.datosCompletos());
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
