package com.example.tutorial_libri;

public class Libro {

    String titolo;
    Float prezzo;

    public Libro(String titolo, Float prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }


    public String getTitolo() {
        return titolo;
    }

    public Float getPrezzo() {
        return prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setPrezzo(Float prezzo) {
        this.prezzo = prezzo;
    }
}
