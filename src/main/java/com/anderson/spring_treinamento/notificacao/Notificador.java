package com.anderson.spring_treinamento.notificacao;

import com.anderson.spring_treinamento.entities.Cliente;

public interface Notificador {
    void notificar(Cliente cliente,String mensagem);
}
