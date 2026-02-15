package com.joseandres.springdemo.controlador;

import com.joseandres.springdemo.modelo.Empleado;
import com.joseandres.springdemo.servicio.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController
public class ControladorEmpleado {
    @Autowired
    private ServicioEmpleado servicioEmpleado;

    @GetMapping("/empleado")
    public Empleado obtenerEmpleado(){
        return servicioEmpleado.obtenerEmpleado();
    }

}
*/