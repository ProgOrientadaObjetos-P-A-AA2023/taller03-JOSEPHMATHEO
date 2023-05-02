package paqueteuno;

import paquetedos.EquivalenteHora;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        // Crear un objeto de tipo EquivalenteHoras
        
        EquivalenteHora eh = new EquivalenteHora();
        
        // Valores de Entrada
        
        int horas = 24;
        double minutos;
        double segundos;
        double dias;
        
        // Metodos establecer para asignarles valores a los atributos del obejto
        
        eh.establecerHoras(horas);
        
        // Se llama a las funciones calcularMinutos,calcularSegundos y calcularDias
        
        eh.calcularMinutos();
        eh.calcularSegundos();
        eh.calcularDias();
        
        //  Presentacion de Valores 
        
        System.out.printf("\nCantidad de horas en:\n"
                + "Horas: %.2f\n" + "Minutos: %2f\n"
                + "Segundos: %.2f\n" + "Dias: %.2f\n", 
                eh.obtenerHoras(),
                eh.obtenerMinutos(), eh.obtenerSegundos(),
                eh.obtenerDias());
        
    }
    
}
