package com.food.food;

import com.food.food.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService atividacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService atividacaoClienteService) {
        this.atividacaoClienteService = atividacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "oi!";
    }
}
