package aulas;

import vetor.Vetor;

//Adiciona elementos no vetor
public class Aula03 {
    public static void main(String[] args) {

        System.out.println("teste");

        Vetor vetor = new Vetor(3);

        try {
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
}