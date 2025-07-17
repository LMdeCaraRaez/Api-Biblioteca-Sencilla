package com.example.biblio;

import com.example.domain.Individuo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

        Individuo individuo = new Individuo();
        individuo.setNombre("Lucas");
        individuo.setApellidos("Ruiz");
        individuo.setEdad(33);
        individuo.setTelefono("693592195");
        individuo.setCorreo("lucas@lucas.es");

        model.addAttribute("textoSaludo", textoSaludo); // Con esto mandamos los atributos del controlador a la plantilla
        model.addAttribute("individuo", individuo);


        // En el return si ponemos el nombre de nuestra plantilla, esta será lo que se muestra
        return "indice";
    }

    @GetMapping("/prueba/lista")
    public String lista(Model model) {

        Individuo individuo1 = new Individuo();
        individuo1.setNombre("Lucas");
        individuo1.setApellidos("Ruiz");
        individuo1.setEdad(33);
        individuo1.setTelefono("693592195");
        individuo1.setCorreo("lucas@lucas.es");

        Individuo individuo2 = new Individuo();
        individuo2.setNombre("Jill");
        individuo2.setApellidos("Valentine");
        individuo2.setEdad(24);
        individuo2.setTelefono("684715424");
        individuo2.setCorreo("lolues@chara.es");

        Individuo individuo3 = new Individuo();
        individuo3.setNombre("Juan");
        individuo3.setApellidos("Jil");
        individuo3.setEdad(22);
        individuo3.setTelefono("1");
        individuo3.setCorreo("lucas@lucas.es");

        List<Individuo> individuos = new ArrayList<>();

        individuos.add(individuo1);
        individuos.add(individuo2);
        individuos.add(individuo3);


//        individuos.clear(); Con esto podemos comprobar si la lista está vacía
        model.addAttribute("individuos", individuos);


        return "lista";
    }
}
