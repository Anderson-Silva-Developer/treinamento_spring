package com.anderson.spring_treinamento.service;


import com.anderson.spring_treinamento.entities.Cliente;
import com.anderson.spring_treinamento.notificacao.Notificador;
import com.anderson.spring_treinamento.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;


public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.Ativar();
        this.notificador.notificar(cliente,"Seu cadastro no sistema está ativo");

    }
}
