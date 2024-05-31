
package pe.com.prestacash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlmacenController {
    
    @GetMapping("/almacen")
    public String MostrarAlmacen() {
        return "almacen/mostrar_almacen";
    }
    
    @GetMapping("/almacen/registrar")
    public String MostrarRegistrarAlmacen() {
        return "almacen/registrar_almacen";
    }
    
    @GetMapping("/almacen/actualizar")
    public String MostrarActualizarAlmacen() {
        return "almacen/actualizar_almacen";
    }
    
    @GetMapping("/almacen/eliminar")
    public String MostrarEliminarAlmacen() {
        return "almacen/eliminar_almacen";
    }
}
