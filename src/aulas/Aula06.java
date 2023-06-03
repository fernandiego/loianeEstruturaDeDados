package aulas;

import vetor.Vetor;

//busca se elemento está no vetor
public class Aula06 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            System.out.println(vetor.busca("elemento 1"));
            System.out.println(vetor.busca("elemento 4"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
