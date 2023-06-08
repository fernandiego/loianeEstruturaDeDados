package labs.pilha;

import java.util.Stack;

public class Exe07 {

    public static void main(String[] args) {
        System.out.println("Binários");
        imprimeResultado(2);
        imprimeResultado(4);
        imprimeResultado(10);
        imprimeResultado(25);
        imprimeResultado(10035);

        System.out.println("\nQualquer base");
        imprimeResultadoQualquerBase(25, 16);
        imprimeResultadoQualquerBase(1035, 8);
        imprimeResultadoQualquerBase(1035, 16);

    }

    public static void imprimeResultado(int numero) {
        System.out.println(numero + " em binário é: " + decimalBinario(numero));
    }

    public static void imprimeResultadoQualquerBase(int numero, int base) {
        System.out.println(numero + " na base " + base + " é: " + decimalParaQualquerBase(numero, base));
    }

    public static String decimalBinario(int numero) {

        Stack<Integer> pilha = new Stack<Integer>();
        String numBinario = "";
        int resto;

        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2;
        }
        while (!pilha.isEmpty()) {
            numBinario += pilha.pop();
        }

        return numBinario;
    }

    public static String decimalParaQualquerBase(int numero, int base) {

        Stack<Integer> pilha = new Stack<Integer>();
        String numBase = "";
        int resto;
        String bases = "0123456789ABCDEF";

        while (numero > 0) {
            resto = numero % base;
            pilha.push(resto);
            numero /= base;
        }
        while (!pilha.isEmpty()) {
            numBase += bases.charAt(pilha.pop());
        }

        return numBase;
    }
}
