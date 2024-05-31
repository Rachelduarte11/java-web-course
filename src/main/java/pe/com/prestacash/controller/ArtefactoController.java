
package pe.com.prestacash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArtefactoController {
    @GetMapping("/artefacto")
    public String MostrarArtefacto(){
        return "artefacto/mostrar_artefacto";
    }
    
    @GetMapping("/registrarartefacto")
    public String MostrarRegistrarArtefacto(){
        return "artefacto/registrar_artefacto";
    }
    
    @GetMapping("/actualizarartefacto")
    public String MostrarActualizarArtefacto(){
        return "artefacto/actualizar_artefacto";
    }
   
    @GetMapping("/eliminarartefacto")
    public String MostrarEliminarArtefacto(){
        return "artefacto/eliminar_artefacto";
    }
}
