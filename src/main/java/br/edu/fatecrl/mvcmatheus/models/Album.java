package br.edu.fatecrl.mvcmatheus.models;

import java.time.Year;
import java.util.Date;

public class Album {
    private String nome;
    private String nome_banda;
    private int ano_lancamento;
    private int duracao_minutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_banda() {
        return nome_banda;
    }

    public void setNome_banda(String nome_banda) {
        this.nome_banda = nome_banda;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(int ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public int getDuracao_minutos() {
        return duracao_minutos;
    }

    public void setDuracao_minutos(int duracao_minutos) {
        this.duracao_minutos = duracao_minutos;
    }

    public Album(String nome, String nome_banda, int ano_lancamento, int duracao_minutos){
        this.nome = nome;
        this.nome_banda = nome_banda;
        this.ano_lancamento = ano_lancamento;
        this.duracao_minutos = duracao_minutos;
    }
}
