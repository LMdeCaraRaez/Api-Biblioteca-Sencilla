package com.example.biblio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController
//public class ControladorRest {
//
//
//    @GetMapping("/")
//    public String inicio() {
//
//
//        return "indice";
//    }
//}

@Controller // Se usa para que las plantillas funcionen
public class ControladorRest {


    @GetMapping("/")
    public String inicio(Model model) {
        String textoSaludo = "Buenas Tardes, bienvenido a mi proyecto";

        model.addAttribute("textoSaludo", textoSaludo); // Con esto mandamos los atributos del controlador a la plantilla

        // En el return si ponemos el nombre de nuestra plantilla, esta será lo que se muestra
        return "indice";
    }
}
