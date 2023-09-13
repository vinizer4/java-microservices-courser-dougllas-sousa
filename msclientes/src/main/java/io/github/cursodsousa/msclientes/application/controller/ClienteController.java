package io.github.cursodsousa.msclientes.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @GetMapping
    public String status() {
        return "msclientes online";
    }
}
