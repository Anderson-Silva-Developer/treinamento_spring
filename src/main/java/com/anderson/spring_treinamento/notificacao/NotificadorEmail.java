package com.anderson.spring_treinamento.notificacao;


import com.anderson.spring_treinamento.entities.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do e-mail %s: %s\n",cliente.getTelefone(),cliente.getEmail(),mensagem);
    }
}
