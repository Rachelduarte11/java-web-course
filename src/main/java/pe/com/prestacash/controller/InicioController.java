
package pe.com.prestacash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {
    
    //Definir las rutas
    @GetMapping()
    public String MostrarInicio(){
        return "index";
    }
    @GetMapping("/menuprincipal")
    public String MostrarMenu(){
        return "menuprincipal/menuprincipal";
    }
}
