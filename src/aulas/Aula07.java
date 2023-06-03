package aulas;

import vetor.Vetor;

//inserir elemento na posição específica do vetor
public class Aula07 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
            System.out.println(vetor);
            vetor.adiciona(0, "elemento 0");
            System.out.println(vetor);
            vetor.adiciona(4, "elemento 4");
            System.out.println(vetor);
            vetor.adiciona(4, "elemento depois do 3");
            System.out.println(vetor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
