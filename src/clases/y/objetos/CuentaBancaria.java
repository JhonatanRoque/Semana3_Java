package clases.y.objetos;


public class CuentaBancaria {
    long numeroCuenta;
    Cliente propietarioCuenta; //Atributo propietarioCuenta del tipo de la clase Cliente
    double saldoCuenta;
    
    public void abonar(double cantidad){
        saldoCuenta += cantidad; //Lógica de negocio
    }
    
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("¡Saldo Insuficiente!");
        }
        else{
         saldoCuenta -= cantidad; //Lógica de negocio   
        }
    }
    
    public String datosPropietarioCuenta(){//Método para retorno de los datos
        String informacion = "";
        informacion += "DUI: " + propietarioCuenta.duiCliente + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombreCliente + "\n";
        informacion += "Teléfono: " + propietarioCuenta.telefonoCliente + "\n";
        return informacion;
    }
}
