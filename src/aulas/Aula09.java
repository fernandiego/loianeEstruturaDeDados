package aulas;

import vetor.Vetor;

//remover elemento do vetor
public class Aula09 {

    public static void main(String[] args) {

    Vetor vetor = new Vetor(1);

        try

    {
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor);
        vetor.remover(1);
        System.out.println(vetor);

        //remover elemento específico
        int pos = vetor.busca("elemento 3");
        if (pos > -1) {
            vetor.remover(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetor);
    } catch(
    Exception e)

    {
        e.printStackTrace();
    }
    }

}
