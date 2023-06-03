package aulas;

import vetor.Lista;
import vetor.VetorObj;

public class Aula11 {
    public static void main(String[] args) throws Exception {
        Lista<String> vetor = new Lista<String>(1);
        vetor.adiciona("Elemento 0");
        System.out.println(vetor);
    }
}