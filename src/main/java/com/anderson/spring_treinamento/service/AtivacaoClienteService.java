package com.anderson.spring_treinamento.service;


import com.anderson.spring_treinamento.entities.Cliente;
import com.anderson.spring_treinamento.notificacao.NivelUrgencia;
import com.anderson.spring_treinamento.notificacao.Notificador;
import com.anderson.spring_treinamento.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.Ativar();
        this.notificador.notificar(cliente,"Seu cadastro no sistema está ativo");

    }
}
