package com.joseandres.springdemo.controlador;

import com.joseandres.springdemo.modelo.Empleado;
import com.joseandres.springdemo.servicio.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class ControladorEmpleadoJSON {

    @Autowired
    private ServicioEmpleado servicioEmpleado;

    @GetMapping
    public List<Empleado> listar() {
        return servicioEmpleado.obtenerEmpleados();
    }

    @PostMapping
    public Empleado crear(@RequestBody Empleado u) {
        return servicioEmpleado.guardar(u);
    }
}
