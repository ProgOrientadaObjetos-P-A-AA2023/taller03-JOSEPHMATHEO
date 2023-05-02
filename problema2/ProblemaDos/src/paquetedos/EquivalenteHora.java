package paquetedos;

public class EquivalenteHora {
    
    private int horas;
    private double minutos;       
    private double segundos;
    private double dias;
    
    public void establecerHoras(int lm){
    
        horas = lm;
    
    }
    
    public void calcularMinutos(){
    
        minutos = horas * 60;
    
    }
     
    public void calcularSegundos(){
    
        segundos = horas *60 *60;
    
    }
     
    public void calcularDias(){
    
        dias = horas / 24;
    
    }
    
    public double obtenerHoras(){
    
        return horas;
    
    }
    
    public double obtenerMinutos(){
    
        return minutos;
    
    }
    
    public double obtenerSegundos(){
    
        return segundos;
    
    }
    
    public  double obtenerDias(){
    
        return dias;
    
    }
    
     
    
}
