package fila;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento) {
        this.adiciona(elemento);
    }
}
