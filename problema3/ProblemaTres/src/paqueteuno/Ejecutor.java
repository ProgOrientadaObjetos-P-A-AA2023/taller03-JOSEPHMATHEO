package paqueteuno;

import paquetedos.InstitucionesEducativas;

public class Ejecutor {

    public static void main(String[] args) {
        
        // Creacion de un Objeto de tipo InstitucionesEducativas
        
        InstitucionesEducativas ie = new InstitucionesEducativas();
        
        // Asignacion de valores
        
        String nombre = "La Salle";
        String tipoDeInstitucion = "Privada";
        int numAlumnos = 300;
        int numDocentes = 100;
        int numSedes = 1;
        double gastosProyectadoEstudiante = 50300.30;
        double presupuesto;
        
        // Metodos establecer para asignarles valores a los atributos del obejto
        
        ie.establecerNombre(nombre);
        ie.establecerTipoDeInstitucion(tipoDeInstitucion);
        ie.establecerNumAlumnos(numAlumnos);
        ie.establecerNumDocentes(numDocentes);
        ie.establecerNumSedes(numSedes);
        ie.establecerGastosProyectadoEstudiante(gastosProyectadoEstudiante);
        
        // Se llama a las funciones calcularPresupuesto
        
        ie.calcularPresupuesto();
        
        // Presentacion de los Datos
        
        System.out.printf("\nAdministracion de Instituciones Educativas:\n"
                + "\nNombre de la Institucion: %s\n" + "Tipo de Institucion: %s\n"
                + "Numero de Alumnos: %d\n" + "Numero de Docentes: %d\n" + "Numero de Sedes: %d\n" 
                + "Gastos Proyectado por Estudiante: %.2f\n" + "Presupuesto: %.2f\n", 
                ie.obtenerNombre(),
                ie.obtenerTipoDeInstitucion(), ie.obtenerNumAlumnos(),
                ie.obtenerNumDocentes(), ie.obtenerNumSedes(), 
                ie.obtenerGastosProyectadoEstudiante(), ie.obtenerPresupuesto());
        
        
       
        
    }
    
}
