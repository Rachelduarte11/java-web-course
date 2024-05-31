
package pe.com.prestacash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContratoController {
    
    @GetMapping("/contrato")
    public String MostrarContrato() {
        return "contrato/mostrar_contrato";
    }
    
    @GetMapping("/contrato/registrar")
    public String MostrarRegistrarContrato() {
        return "contrato/registrar_contrato";
    }
    
    @GetMapping("/contrato/actualizar")
    public String MostrarActualizarContrato() {
        return "contrato/actualizar_contrato";
    }
    
    @GetMapping("/contrato/eliminar")
    public String MostrarEliminarContrato() {
        return "contrato/eliminar_contrato";
    }
}