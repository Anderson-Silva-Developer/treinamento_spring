package com.anderson.spring_treinamento.service;


import com.anderson.spring_treinamento.entities.Cliente;
import com.anderson.spring_treinamento.notificacao.NivelUrgencia;
import com.anderson.spring_treinamento.notificacao.Notificador;
import com.anderson.spring_treinamento.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void ativar(Cliente cliente){
        cliente.Ativar();
        applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));


    }
}
