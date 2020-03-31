package com.example.escolura.models;

public class Nota {

    private Double valor;

    public Double getValor() {
        return valor;
    }

    public Nota(Double valor) {
        this.valor = valor;
    }

    @Deprecated
    public Nota() {
        //for jpa
    }
}
