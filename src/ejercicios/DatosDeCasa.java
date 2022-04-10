package ejercicios;


public class DatosDeCasa {
    String numeroCasa, calle;
    int numeroPasaje;
    
    public DatosDeCasa(String nCasa, String calle, int nPasaje){
        this.numeroCasa = nCasa;
        this.calle = calle;
        this.numeroPasaje = nPasaje;
    }
    
    public String getDatosDeCasa(){
        String informacion = "";
        informacion += "Numero de Casa: " + numeroCasa + "\n";
        informacion += "Calle: " + calle + "\n";
        informacion += "Numero de Pasaje: " + numeroPasaje + "\n";
        return informacion;
    }
    
    
}
