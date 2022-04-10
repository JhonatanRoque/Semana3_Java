package clases.y.objetos;

public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registrarEstudiante(){
        System.out.println("Método para registro de estudiante");
    }
    
    public void consultarEstudiante(){
        System.out.println("Método para consultar el Estudiante");
    }
    
    public void eliminarEstudiante(){
        System.out.println("Método para eliminar Estudiante");
    }
    
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //El objeto est es la instancia de la clase Estudiante
        est.carnet = 1234; //Asignar valores a cada uno de los atributos est.carnet objeto mas atributo
        est.nombre = "Francisco";
        est.apellido = "Abarca";
        
        est.registrarEstudiante();
        est.consultarEstudiante();
        est.eliminarEstudiante();
        
        System.out.println("Carnet      : " + est.carnet); //El objeto y el atributo est.carnet
        System.out.println("Nombre      : " + est.nombre);
        System.out.println("Apellido    : " + est.apellido);
    }
}
