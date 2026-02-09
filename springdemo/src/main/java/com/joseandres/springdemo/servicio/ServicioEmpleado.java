package com.joseandres.springdemo.servicio;

import com.joseandres.springdemo.modelo.Empleado;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpleado {
    public Empleado obtenerEmpleado(){
        return new Empleado("1231231F", "Paco Sierra");
    }
}
