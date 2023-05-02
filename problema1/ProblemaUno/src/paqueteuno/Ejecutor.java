package paqueteuno;

import paquetedos.Terreno;


public class Ejecutor {
    
    public static void main(String[] args) {
        
        // Crear 2 Objetos de tipo Terreno
        
        Terreno tr = new Terreno();
        
        // Valores de entrada
        
        double costo_terreno;
        int ancho = 100;
        int largo = 120;
        double area;
        double valorMetroCuadrado = 20.00;               
        
        
        // Metodos establecer para asignarles valores a los atributos del obejto
        
        tr.establecerAncho(ancho);
        tr.establecerLargo(largo);
        tr.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        // Llamamos al metodo calcularCostoTerreno y calcularArea
        
        tr.calcularArea();
        tr.calcularCostoTerreno();
        
        
        // Se presentan los datos
        
        System.out.printf("Costo de un Terreno\n\nCosto del Terreno: %.2f\n"
                + "Ancho del Terreno: %d\nLargo del Terreno: %d\n"
                + "Area del Terreno: %.2f\n" + "Valor Metro Cuadrado: %.2f\n", 
                tr.obtenerCosto_Terreno(),
                tr.obtenerAncho(), tr.obtenerLargo(),
                tr.obtenerArea(), tr.obtenerValorMetroCuadrado());
        
    }
    
}