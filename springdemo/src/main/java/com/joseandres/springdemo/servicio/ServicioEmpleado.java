package com.joseandres.springdemo.servicio;

import com.joseandres.springdemo.modelo.Empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioEmpleado {
    private List<Empleado> lista = new ArrayList<>();

    public List<Empleado> obtenerEmpleados() {
        return lista;
    }

    public Empleado guardar(Empleado u) {
        lista.add(u);
        return u;
    }
}
