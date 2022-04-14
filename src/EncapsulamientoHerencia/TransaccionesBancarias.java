package EncapsulamientoHerencia;

import java.io.*;

public class TransaccionesBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        double abonoCuenta, cargoCuenta;
        try{
            //Ingreso de los respectivos valores a los atributos heredados
            System.out.println("Número de DUI: ");
            long numDui = Long.parseLong(leer.readLine());
            System.out.println("Nombre del Cliente: ");
            String nombres = leer.readLine();
            System.out.println("Teléfono del Cliente: ");
            String telefono = leer.readLine();
            
            //Inngresar valores de prueba
            System.out.println("Ingresar el abono a la cuenta: ");
            abonoCuenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el cargo de la cuenta: ");
            cargoCuenta = Double.parseDouble(leer.readLine());
            
            //Asignar los valores a los atributos heredados
            cuenta.setNumDui(numDui);
            cuenta.setNombreCliente(nombres);
            cuenta.setTelCliente(telefono);
            
            //Asignar valores metodos set
            cuenta.setAbonoCuenta(abonoCuenta);
            cuenta.setCargoCuenta(cargoCuenta);
            cuenta.setSaldoCuenta();
            
            System.out.println("---------------------------------------------------------------");
            
            //Retornar valores del método get de la clase heredada
            System.out.println("Número de DUI       : " + cuenta.getNumDui());
            System.out.println("Nombre del Cliente  : " + cuenta.getNombreCliente());
            System.out.println("Teléfono del Cliente: " + cuenta.getTelCliente());
            
            //Retornar valores metodos get
             System.out.println("Abono    : " + cuenta.getAbonoCuenta());
             System.out.println("Cargo    : " + cuenta.getCargoCuenta());
             System.out.println("Saldo    : " + cuenta.getSaldoCuenta());
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
