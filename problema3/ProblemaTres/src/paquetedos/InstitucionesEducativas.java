package paquetedos;

public class InstitucionesEducativas {
    
    private String nombre;
    private String tipoDeInstitucion;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastosProyectadoEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String lm){
        
        nombre = lm;
    
    }
    
    public void establecerTipoDeInstitucion(String lm){
    
        tipoDeInstitucion = lm;
    
    }
    
    public void establecerNumAlumnos(int lm){
    
        numAlumnos = lm;
        
    }
    
    public void establecerNumDocentes(int lm){
    
        numDocentes = lm;
        
    }
    
    public void establecerNumSedes(int lm){
    
        numSedes = lm;
        
    }
    
    public void establecerGastosProyectadoEstudiante(double lm){
    
        gastosProyectadoEstudiante = lm;
        
    }
    
    public void calcularPresupuesto(){
    
        presupuesto = numAlumnos * gastosProyectadoEstudiante;
    
    }
    
    public String obtenerNombre(){
        
        return nombre;
    
    }
    
    public String obtenerTipoDeInstitucion(){
        
        return tipoDeInstitucion;
    
    }
    
    public int obtenerNumAlumnos(){
    
        return numAlumnos;
    
    }
    
    public int obtenerNumDocentes(){
    
        return numDocentes;
    
    }
    
    public int obtenerNumSedes(){
    
        return numSedes;
    
    }
    
    public double obtenerGastosProyectadoEstudiante(){
    
        return gastosProyectadoEstudiante;
    
    }
    
    public double obtenerPresupuesto(){
    
        return presupuesto;
    
    }
    
} 
