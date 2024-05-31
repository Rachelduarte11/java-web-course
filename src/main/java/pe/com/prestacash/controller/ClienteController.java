
package pe.com.prestacash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
    
    @GetMapping("/cliente")
    public String MostrarCliente() {
        return "cliente/mostrar_cliente";
    }
    
    @GetMapping("/cliente/registrar")
    public String MostrarRegistrarCliente() {
        return "cliente/registrar_cliente";
    }
    
    @GetMapping("/cliente/actualizar")
    public String MostrarActualizarCliente() {
        return "cliente/actualizar_cliente";
    }
    
    @GetMapping("/cliente/eliminar")
    public String MostrarEliminarCliente() {
        return "cliente/eliminar_cliente";
    }
}