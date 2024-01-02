package com.MoralesValverdeGerman.pruebatec1.persistencia;

import com.MoralesValverdeGerman.pruebatec1.logica.Empleado;
import com.MoralesValverdeGerman.pruebatec1.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author germa
 */
public class ControladoraPersistencia {

    EmpleadoJpaController empleJpa = new EmpleadoJpaController();

    public void crearEmpleado(Empleado empleado) {
        empleJpa.create(empleado);
    }

    public void borrarEmpleado(int id) {
        try {
            empleJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarEmpleado(Empleado empleado) {
        try {
            empleJpa.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado traerEmpleado(int id) {
        return empleJpa.findEmpleado(id);
    }

    public ArrayList<Empleado> traerListaEmpleados() {
        List<Empleado> lista = empleJpa.findEmpleadoEntities();
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(lista);
        return listaEmpleados;
    }
}
