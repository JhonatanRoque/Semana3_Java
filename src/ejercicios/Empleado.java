package ejercicios;


public class Empleado {
    private long numNIT;
    private String Nombres;
    private String Apellidos;
    private String Direccion;
    private double salarioDevengado;
    private double salarioConDescuento;
    private String estadoEmpleado;
    private double Renta;

    public long getNumNIT() {
        return numNIT;
    }

    public void setNumNIT(long numNIT) {
        this.numNIT = numNIT;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getSalarioConDescuento() {
        return salarioConDescuento;
    }

    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento = salarioConDescuento;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public double getRenta() {
        return Renta;
    }

    public void setRenta(double Renta) {
        this.Renta = Renta;
    }
    
    
    //Métodos
    //Método para Calcular descuento
    public double calcRenta(double salario){
        double renta;
        renta = salario * 0.10;
        setRenta(renta);
        return renta;
    }
    //Metodo para calcular el salario con descuento/total 
    public double calcSalarioConDescuento(double salarioDevengado, double renta){
        double salarioTotal;
        salarioTotal = salarioDevengado - renta;
        setSalarioConDescuento(salarioTotal);
        return salarioTotal;
    }
    //Método para obtener el nombre completo
    public String nombreCompleto(String nombres, String apellidos){
        String nombre; 
        nombre = nombres + " " + apellidos;
        return nombre;
    }
    //Método para imprimir todos los atributos
    public String datosCompletos(){
        String informacion = "";
        informacion += "Número de NIT                    : " + this.numNIT + "\n";
        informacion += "Nombre                           : " + this.Nombres + "\n";
        informacion += "Apellido                         : " + this.Apellidos + "\n";
        informacion += "Direccion                        : " + this.Direccion + "\n";
        informacion += "Descuentos (Renta)               : " + this.Renta + "\n";
        informacion += "Salario Devengado/Bruto          : " + this.salarioDevengado + "\n";
        informacion += "Salario Total (Bruto-Descuentos) : " + this.salarioConDescuento + "\n";
        informacion += "Estado de Empleado               : " + this.estadoEmpleado + "\n";
        return informacion;
    }
    
    
}
