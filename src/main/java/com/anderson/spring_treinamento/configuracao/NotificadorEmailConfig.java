package com.anderson.spring_treinamento.configuracao;

import com.anderson.spring_treinamento.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificadorEmailConfig {
    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificadorEmail=new NotificadorEmail("smtp.springmail.com.br.");
        notificadorEmail.setCaixaaAlta(true);
        return notificadorEmail;
    }
}
