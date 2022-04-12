package ejercicios;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Estudiante {
    //Atributos de la clase
    private long NumeroCarnet, CodCarrera;
    private String Nombre;
    Hashtable <Integer, Estudiante> tablaEstudiantes = new Hashtable <Integer, Estudiante>();
        
    
    //Propiedades de los atributos
    //Introducir datos/atributos
    private void setNumeroCarnet(long nCarnet){
        this.NumeroCarnet = nCarnet;
    }
    private void setNombre(String nombre){
        this.Nombre = nombre;
    }
    private void setCodCarrera(long codCarrera){
        this.CodCarrera = codCarrera;
    }
    //Obtener datos/atributos
    public long getNumeroCarnet(){
        return this.NumeroCarnet;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public long getCodCarrera(){
        return this.CodCarrera;
    }
    //Constructores
    public Estudiante (long numeroCarnet, String nombre, long codCarrera){ 
        //Este constructor se utiliza para llenar los atributos de nuestra clase con los parametros el constructor requiere
        this.setNumeroCarnet(numeroCarnet);
        this.setNombre(nombre);
        this.setCodCarrera(codCarrera);
    }
        
    Estudiante(){ //Constructor vacio por defecto
        
    }
    
    //Metodos
    public void RegistroEstudiantes(int Key, long numeroCarnet, String nombre, long codCarrera){
        //Metodo para registar los datos del estudiante en el hashtable (tablaEstudiantes)
        Estudiante est = new Estudiante(numeroCarnet, nombre, codCarrera); //Creamos un objeto de estudiante en el cual guardamos los parametros necesarios para nuestra clase estdiante
        tablaEstudiantes.put(Key, est); //Subimos los datos a nuestra Hashtable, para ello utilizamos la función put de nuestro Hashtable
        
    }
    
    public String MostrarDatos(){
        String informacion =""; //String utilizado para guardar los datos a mostrar
        Hashtable<Integer, Estudiante> tablaEst = tablaEstudiantes; //Hashtable el cual le colocamos los datos de nuestro Hashtable (tablaEstudiantes)
        
        Enumeration<Estudiante> est = tablaEst.elements(); //
        
        System.out.println("Datos de los Estudiantes ingresados: ");
        System.out.println("Numero de Carnet    Nombre               Cod Carrera ");
        while(est.hasMoreElements()){
            Estudiante miEstudiante = est.nextElement();
            informacion += miEstudiante.getNumeroCarnet() + "                   " + miEstudiante.getNombre() + "                    " + miEstudiante.getCodCarrera() + "\n" ;
            
        }
        
        return informacion;
    }
    
    
    
}
