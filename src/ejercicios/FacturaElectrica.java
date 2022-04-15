package ejercicios;


public class FacturaElectrica {
    private long numCuenta;
    private int lecturaActualMedidor;
    private int lecturaAnteriorMedidor;
    private int multiplicador;
    private int consumoMensual;
    private double consumoDiario;
    private double valorFactura;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getLecturaActualMedidor() {
        return lecturaActualMedidor;
    }

    public void setLecturaActualMedidor(int lecturaActualMedidor) {
        this.lecturaActualMedidor = lecturaActualMedidor;
    }

    public int getLecturaAnteriorMedidor() {
        return lecturaAnteriorMedidor;
    }

    public void setLecturaAnteriorMedidor(int lecturaAnteriorMedidor) {
        this.lecturaAnteriorMedidor = lecturaAnteriorMedidor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(int consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    
    //Métodos
    //Método para calcular el consumo mensual
    public int calcConsumoMensual(int lecturaActual, int lecturaAnterior, int Multiplicador){
        //consumo = lecturaactual - lecturaAnterior
        int consumo;
        
        consumo = (lecturaActual - lecturaAnterior) * Multiplicador;
        this.setConsumoMensual(consumo);
        
        return consumo;
    }
    //Método para calcular el consumo diario
    public double calcConusmoDiario(int consumoMensual){
        double ConsumoDiario;
        ConsumoDiario = consumoMensual / 30;  
        this.setConsumoDiario(ConsumoDiario);
        return ConsumoDiario;
    }
    //Método para calcular el valor de factura
    public double calcValorFactura(int consumoMensual){
        double valorF;
        valorF = this.getConsumoMensual() * 0.20;
        this.setValorFactura(valorF);
        return valorF;
    }
    //Método para imprimir todos los atributos
    public String datosCompletos(){
        String informacion = "";
        informacion += "Número de cuenta                   : " + this.getNumCuenta() + "\n";
        informacion += "Lectura anterior del medidor       : " + this.getLecturaAnteriorMedidor() + "\n";
        informacion += "Lectura actual del medidor         : " + this.getLecturaActualMedidor() + "\n";
        informacion += "Multiplicador                      : " + this.getMultiplicador() + "\n";
        informacion += "Consumo mensual                    : " + this.getConsumoMensual() + "\n";
        informacion += "Consumo diario                     : " + this.getConsumoDiario() + "\n";
        informacion += "Valor de factura                   : " + this.getValorFactura() + "\n";
        return informacion;
    }
}
