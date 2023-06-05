package labs;

import vetor.Lista;

import java.util.ArrayList;

public class Exe05 {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");

        System.out.println(lista);
        lista.limparLista();
        System.out.println(lista);
    }
}
