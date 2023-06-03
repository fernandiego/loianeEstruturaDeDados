package aulas;

import vetor.Contato;
import vetor.VetorObj;

public class Aula10 {
    public static void main(String[] args) throws Exception {
        VetorObj vetorObj = new VetorObj(5);

        Contato c1 = new Contato("Contato 1", "12345-111", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "12345-222", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "12345-333", "contato3@email.com");

        vetorObj.adiciona(3);
        vetorObj.adiciona(4);
        vetorObj.adiciona(5);

        System.out.println("Tamanho = " + vetorObj.tamanho());
        System.out.println(vetorObj);
    }
}
