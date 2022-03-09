package com.dio.primeiroprojeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String mensagem() {
        return "Primeiro projeto Spring Boot Web";
    }
    
}
