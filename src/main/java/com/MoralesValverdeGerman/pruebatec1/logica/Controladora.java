package com.MoralesValverdeGerman.pruebatec1.logica;

import com.MoralesValverdeGerman.pruebatec1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author germa
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearEmpleado(Empleado empleado) {
        controlPersis.crearEmpleado(empleado);
    }

    public void borrarEmpleado(int id) {
        controlPersis.borrarEmpleado(id);
    }

    public void editarEmpleado(Empleado empleado) {
        controlPersis.editarEmpleado(empleado);
    }
    
    public Empleado traerEmpleado(int id){
        return controlPersis.traerEmpleado(id);
    }
    
    public ArrayList<Empleado> traerListaEmpelados(){
        return controlPersis.traerListaEmpleados();
    }
}
