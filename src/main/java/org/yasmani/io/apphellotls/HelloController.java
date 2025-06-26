package org.yasmani.io.apphellotls;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/saludo")
    public String saludo() {
        return "Hola desde Spring Boot 3!";
    }
    @GetMapping("/ciudades")
    public List<String> ciudades() {
        return List.of("Lima", "Cusco", "Arequipa", "Trujillo", "Piura");
    }
}
