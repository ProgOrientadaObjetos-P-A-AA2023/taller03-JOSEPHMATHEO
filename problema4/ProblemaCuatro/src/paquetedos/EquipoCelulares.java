package paquetedos;

public class EquipoCelulares {
    
    private String sistemaOperativo;  
    private double tamanioPantalla;
    private double costoInicial;
    private int iva;
    private double ivaCostoInicial; 
    private double costoFinal;
    private String direccionMac;
    private String informacionImei;
    
    public void establecerSistemaOperativo(String lm){
    
    sistemaOperativo = lm;
    
    }
    
    public void establecerTamanioPantalla(double lm){
    
    tamanioPantalla = lm;
    
    }
    
    public void establecerCostoInicial(double lm){
    
    costoInicial = lm;
    
    }
    
    public void establecerIva(int lm){
    
    iva = lm;
    
    }
    
    public void establecerIvaCostoInicial(double lm){
    
    ivaCostoInicial = lm;
    
    }
    
    public void calcularCostoFinal(){
    
    costoFinal = costoInicial + ivaCostoInicial;
    
    }
    
  
    public void establecerDireccionMac(String lm){
    
    direccionMac = lm;
    
    }
    public void establecerInformacionImei(String lm){
    
    informacionImei = lm;
    
    }
    
    public String obtenerSistemaOperativo(){
    
    return sistemaOperativo;
    
    }
    
    public double obtenerTamanioPantalla(){
    
    return tamanioPantalla;
    
    }
    
    public double obtenerCostoInicial(){
    
    return costoInicial;
    
    }
    
    public int obtenerIva(){
    
    return iva;
    
    }
    
    public double obtenerIvaCostoInicial(){
    
    return ivaCostoInicial;
    
    }
    
    public double obtenerCostoFinal(){
    
    return costoFinal;
    
    }
    
    public String obtenerDireccionMac(){
    
    return direccionMac;
    
    }
    
    public String obtenerInformacionImei(){
    
    return informacionImei;
    
    }
    
    
}
