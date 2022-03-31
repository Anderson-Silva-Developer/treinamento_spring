package com.anderson.spring_treinamento.controllers;

import com.anderson.spring_treinamento.entities.Cliente;
import com.anderson.spring_treinamento.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente joao=new Cliente("João","joao@xyz","12345678");
        Cliente maria=new Cliente("Maria","maria@xyz","098765438");
        this.ativacaoClienteService.ativar(joao);
        return "Hello";
    }
}
