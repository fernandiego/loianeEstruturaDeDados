package labs.fila;

import fila.Documento;
import fila.Fila;

import javax.print.Doc;

public class Exe01 {
    public static void main(String[] args) {
        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 1));
        filaImpressora.enfileira(new Documento("B", 5));
        filaImpressora.enfileira(new Documento("C", 2));
        filaImpressora.enfileira(new Documento("D", 3));
        filaImpressora.enfileira(new Documento("E", 2));

        while (!filaImpressora.estaVazia()) {
            Documento doc = filaImpressora.desenfileira();
        System.out.println("Imprimindo documento " + doc.getNome());
        try {
            Thread.sleep(200 * doc.getNumFolhas());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
