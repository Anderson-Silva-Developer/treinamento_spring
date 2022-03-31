package com.anderson.spring_treinamento.configuracao;

import com.anderson.spring_treinamento.notificacao.Notificador;
import com.anderson.spring_treinamento.notificacao.NotificadorEmail;
import com.anderson.spring_treinamento.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador){
        return new AtivacaoClienteService(notificador);
    }
}
