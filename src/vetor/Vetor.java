package vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    //    public void adiciona(String elemento) {
//        for (int i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }


    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", Quantidade de elementos no Array = " + tamanho +
                '}';
    }

    public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        else{
            throw new Exception("Vetor está cheio, não foi possível adicionar elemento");
        }

    }
}