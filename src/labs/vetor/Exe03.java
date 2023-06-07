package labs.vetor;

import vetor.Lista;

public class Exe03 {
    public static void main(String[] args) throws Exception {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println(lista);
        lista.remove("B");
        System.out.println(lista);
        lista.remove("D");
        System.out.println(lista);
        lista.remove("A");
        System.out.println(lista);

    }
}
