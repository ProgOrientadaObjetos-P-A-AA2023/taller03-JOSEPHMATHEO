package paquetedos;

public class Terreno {
    
    private double costo_terreno;
    private int ancho;
    private int largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void calcularCostoTerreno(){
        
        costo_terreno = valorMetroCuadrado * area;
    
    }
    
    public void establecerAncho(int lm){
    
        ancho = lm;
    
    }
    
    public void establecerLargo(int lm){
    
        largo = lm;
    
    }
    
    public void calcularArea(){
    
        area = largo * ancho;
    
    }
            
    public void establecerValorMetroCuadrado(double lm){
    
        valorMetroCuadrado = lm;
    
    }
    
    public double obtenerCosto_Terreno(){
    
        return costo_terreno;
    
    }
    
    public int obtenerAncho(){
    
    return ancho;
    
    }
    
    public int obtenerLargo(){
    
        return largo;
    
    }
    
    public double obtenerArea(){
    
        return area;
    
    }
            
    public double obtenerValorMetroCuadrado(){
    
        return valorMetroCuadrado;
        
    }
}
