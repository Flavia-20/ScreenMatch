package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Epsodios implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVsiualisacoes;


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVsiualisacoes() {
        return totalVsiualisacoes;
    }

    public void setTotalVsiualisacoes(int totalVsiualisacoes) {
        this.totalVsiualisacoes = totalVsiualisacoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVsiualisacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }



}
