package aulas;

import vetor.Vetor;
public class Aula04 {
    public static void main(String[] args) {


        Vetor vetor = new Vetor(10);

        try {
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        System.out.println("Quantidades de elementos no Array " + vetor.tamanho());
        System.out.println(vetor.toString());
    }
}