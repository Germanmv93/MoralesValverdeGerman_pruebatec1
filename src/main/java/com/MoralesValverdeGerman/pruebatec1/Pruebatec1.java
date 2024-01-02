package com.MoralesValverdeGerman.pruebatec1;

import com.MoralesValverdeGerman.pruebatec1.logica.Controladora;
import com.MoralesValverdeGerman.pruebatec1.logica.Empleado;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author germa
 */
public class Pruebatec1 {

    public static void main(String[] args) {

        Controladora control = new Controladora();
        
        
        //Creamos 4 empleados
        Empleado empleado1 = new Empleado(0, "German", "Morales", "Recepcionsita", 1000.0, new Date());
        Empleado empleado2 = new Empleado(0, "Jose", "Morales", "Enfermero", 1800.0, new Date());
        Empleado empleado3 = new Empleado(0, "Isabel", "Valverde", "Cocinera", 2000.0, new Date());
        Empleado empleado4 = new Empleado(0, "Ariadna", "Morales", "Medico", 3000.0, new Date());
        
        control.crearEmpleado(empleado1);
        control.crearEmpleado(empleado2);
        control.crearEmpleado(empleado3);
        control.crearEmpleado(empleado4);
        
        
        //Borramos el empleado con el id 2.
        control.borrarEmpleado(2);

        empleado3.setApellidos("Rueda");
        control.editarEmpleado(empleado3);

        Empleado empleado = control.traerEmpleado(4);
        System.out.println("---------------Buqueda Individual----------");
        System.out.println("El alumno con el id 4 es: " + empleado.toString());
        
        System.out.println("---------------Busqueda de todos-----------");
        ArrayList<Empleado> listaEmpleados = control.traerListaEmpelados();
        for (Empleado emplead : listaEmpleados) {
            System.out.println("El empleado es: " + emplead.toString());
        }
    }
}
