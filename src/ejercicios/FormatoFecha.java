package ejercicios;

import java.text.SimpleDateFormat;
import java.util.Date;


public class FormatoFecha {
    private String fecha;
    private String fechaGuiones;
    private String fechaPlecas;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaGuiones() {
        return fechaGuiones;
    }

    public void setFechaGuiones(String fechaGuiones) {
        this.fechaGuiones = fechaGuiones;
    }

    public String getFechaPlecas() {
        return fechaPlecas;
    }

    public void setFechaPlecas(String fechaPlecas) {
        this.fechaPlecas = fechaPlecas;
    }
    
    //Métodos
    //Método para dar fecha con guiones
    public String Fecha(String fecha){
        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formato1 = new SimpleDateFormat("ddMMyyyy");
            Date fechaF = formato1.parse(fecha);
            this.setFechaPlecas(formato.format(fechaF));
        return this.getFechaPlecas();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return this.getFechaPlecas();
    }
    public String Fecha(){
            try{
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat formato1 = new SimpleDateFormat("ddMMyyyy");
            Date fechaF = formato1.parse(this.getFecha());
            this.setFechaGuiones(formato.format(fechaF));
        return this.getFechaGuiones();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return this.getFechaGuiones();
    }

}
