package com.anderson.spring_treinamento.entities;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private Boolean ativo=false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void Ativar() {
        this.ativo = true;
    }
}
