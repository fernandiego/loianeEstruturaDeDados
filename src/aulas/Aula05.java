package aulas;

import vetor.Vetor;

//busca elemento na posição informada
public class Aula05 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            System.out.println(vetor.busca(2));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
