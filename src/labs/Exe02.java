package labs;

import vetor.Lista;

import java.util.ArrayList;

public class Exe02 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList.lastIndexOf("C"));

        Lista<String> lista = new Lista<String>(5);
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        System.out.println(lista.ultimoIndice("B"));
    }
}
