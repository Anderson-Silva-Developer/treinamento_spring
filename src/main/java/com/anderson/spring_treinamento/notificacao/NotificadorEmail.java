package com.anderson.spring_treinamento.notificacao;


import com.anderson.spring_treinamento.entities.Cliente;


public class NotificadorEmail implements Notificador{
    private boolean caixaaAlta;
    private  String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;

    }

    public void setCaixaaAlta(boolean caixaaAlta) {
        this.caixaaAlta = caixaaAlta;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if(this.caixaaAlta){
         mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n",cliente.getTelefone(),cliente.getEmail(),this.hostServidorSmtp,mensagem);
    }
}
