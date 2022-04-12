package ejercicios;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class CalculoIva {
    NumberFormat formato = new DecimalFormat("#,###.##");
    
    double iva, precioProducto;
    
    public CalculoIva(double iva, double precProducto){
        this.iva = iva;
        this.precioProducto = precProducto;
    }
    
    //Método para calcular el IVA
    public void CalcularIva(){ //No tiene parametros el metodo, ya que los recibe directamente de la clase
        double precioConIva, Iva, porcentajeIva, precProducto;
        
        porcentajeIva = (this.iva / 100);
        precProducto = this.precioProducto;
        
        Iva = (precProducto * porcentajeIva);
        precioConIva = precProducto + Iva;
        
        System.out.println("-------------------------------------------------------");
        System.out.println("IVA                 : " + Iva);
        System.out.println("Precio de Producto  : " + precProducto);
        System.out.println("Precio con IVA      : " + formato.format(precioConIva));
        
    }
    
    //Método para calcular el precio sin iva de un producto con iva
    public void precioSinIva(){ //No tiene parametros el metodo, ya que los recibe directamente de la clase
        double precioSiniva, porcentajeIva, Iva, precioConIva;
        
        
        porcentajeIva = (this.iva / 100);
        precioConIva = this.precioProducto;
        
        precioSiniva = (precioConIva / (1 + porcentajeIva));
        Iva = (precioSiniva * porcentajeIva);
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Precio con IVA              : " + precioConIva);
        System.out.println("IVA                         : " + Iva);
        System.out.println("Precio sin IVA              : " + formato.format(precioSiniva));
        
        
    }
}
