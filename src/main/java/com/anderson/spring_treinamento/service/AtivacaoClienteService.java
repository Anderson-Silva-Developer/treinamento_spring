package com.anderson.spring_treinamento.service;


import com.anderson.spring_treinamento.entities.Cliente;
import com.anderson.spring_treinamento.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.Ativar();
        this.notificador.notificar(cliente,"Seu cadastro no sistema está ativo");

    }
}
