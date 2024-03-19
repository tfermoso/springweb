package com.ceica.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/pedirdatos")
    public List<String> prueba(@RequestParam(name = "dat") Integer dat1,@RequestParam String texto){
        List<String> datos=new ArrayList<>();
        datos.add("hola mundo");
        datos.add("adios mundo");
        datos.add("Valor "+dat1);
        datos.add("Texto "+texto);
        return datos;
    }
}
