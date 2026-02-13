package com.joseandres.springdemo.controlador;

import com.joseandres.springdemo.modelo.Empleado;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empleados")
public class ControladorEmpleadoJSON {

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado){
        return empleado;
    }
}
