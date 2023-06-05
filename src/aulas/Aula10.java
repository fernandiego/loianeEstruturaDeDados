package aulas;

import vetor.Contato;
import vetor.VetorObj;

public class Aula10 {
    public static void main(String[] args) throws Exception {
        VetorObj vetorObj = new VetorObj(5);

        Contato c1 = new Contato("nome1","12345", "email1");
        Contato c2 = new Contato("nome2","02345", "email2");
        Contato c3 = new Contato("nome3","12346", "email3");

        vetorObj.adiciona(c1);
        vetorObj.adiciona(c2);
        vetorObj.adiciona(c3);

        System.out.println("Tamanho = " + vetorObj.tamanho());
        System.out.println(vetorObj);

        int pos = vetorObj.busca(c3);
        if (pos > -1) {
            System.out.println("Elemento " + c3.getNome() + " existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
        System.out.println(vetorObj);
    }
}
