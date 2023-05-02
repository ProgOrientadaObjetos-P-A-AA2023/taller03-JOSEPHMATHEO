package paqueteuno;

import paquetedos.EquipoCelulares;

public class Ejecutor {

    
    public static void main(String[] args) {
        
        // Crear un Objeto de tipo EquipoCelulares 
        
        EquipoCelulares ec = new EquipoCelulares();
        
        // Ingresamos los valores 
        
        String sistemaOperativo = "Android 12";
        double tamanioPantalla = 6.5;
        double costoInicial = 120;
        int iva = 12;
        double ivaCostoInicial = 14.4; 
        String direccionMac = "d2:5c:dd:8d" ;
        String informacionImei = "3591417958637995";
        
        // Metodos establecer para asignarles valores a los atributos del obejto
        
        ec.establecerSistemaOperativo(sistemaOperativo);
        ec.establecerTamanioPantalla(tamanioPantalla);
        ec.establecerCostoInicial(costoInicial);
        ec.establecerIva(iva);
        ec.establecerIvaCostoInicial(ivaCostoInicial);
        ec.establecerDireccionMac(direccionMac);
        ec.establecerInformacionImei(informacionImei);
        
        // Llamamos a la funcion calcularCostoFinal
        
        ec.calcularCostoFinal();
        
        // Presentacion de los Datos
        
        System.out.printf("\nCaracteristicas de Dispositivos Celulares:\n"
                + "\nSistema Operativo: %s\n" + "Tamanio de la Pantalla: %.2f mpxl \n"
                + "Costo Inicial: %.2f\n" + "Porcentaje del iva: %d \n" + "Iva del Costo Inicial: %.2f\n" 
                + "Costo Final: %.2f\n" + "Direccion Mac: %s\n" + "Inforamcion IMEI %s\n", 
                ec.obtenerSistemaOperativo(),
                ec.obtenerTamanioPantalla(), ec.obtenerCostoInicial(),
                ec.obtenerIva(), ec.obtenerIvaCostoInicial(), 
                ec.obtenerCostoFinal(), ec.obtenerDireccionMac(), ec.obtenerInformacionImei() );
        
        
        
    }
    
}
