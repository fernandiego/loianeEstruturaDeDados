package labs.pilha;

import pilha.Pilha;

public class Exe05 {
    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("ABC");
        imprimeResultado("ABCCBA");
    }
    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " É palíndromo? " + testaPalindromo(palavra));

    }
    public static boolean testaPalindromo(String palavra) {
        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }
        String palavraInversa = "";

        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }
        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }

}
