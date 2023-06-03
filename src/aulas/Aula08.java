package aulas;

import vetor.Vetor;

public class Aula08 {
    public static void main(String[] args) {

    Vetor vetor = new Vetor(1);

        try

    {
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor);
    } catch(
    Exception e)

    {
        e.printStackTrace();
    }
    }


}
