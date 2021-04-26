package com.example.recyclerview.model;

public class Filme {
    private String titutloFilme;
    private String genero;
    private String ano;

    public Filme(){

    }
    public Filme(String titutloFilme, String genero, String ano) {
        this.titutloFilme = titutloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTitutloFilme() {
        return titutloFilme;
    }

    public void setTitutloFilme(String titutloFilme) {
        this.titutloFilme = titutloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
