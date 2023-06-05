package vetor;

import java.lang.reflect.Array;

public class Lista<T> {
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public Object busca(int posicao) {
        if (posicao <= 0 && posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");
        return s.toString();

    }

    public void adiciona(T elemento) throws Exception {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor está cheio, não foi possível adicionar elemento");
        }

    }

    public boolean adiciona(int posicao, T elemento) {
        if (posicao <= 0 && posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        this.aumentaCapacidade();
        //movendo os elementos uma posicão para a direita
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 5];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remover(int posicao) {
        if (posicao <= 0 && posicao > tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i <= this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public boolean contem(T elemento) {
        int pos = busca(elemento);
        if (pos > -1) {
            return true;
        }
        return busca(elemento) > -1;
    }
    
    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho-1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }
}
