package labs.pilha;

import pilha.Pilha;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Pilha<Integer> pilhaPar = new Pilha<Integer>();
        Pilha<Integer> pilhaImpar = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Entre com um número");
            int num = scan.nextInt();

            if (num == 0) {
                Integer desempilhadoPar = pilhaPar.topo();
                Integer desempilhadoImpar = pilhaImpar.topo();
                if (desempilhadoPar == null) {
                    System.out.println("Pilha par está vazia");
                } else if (desempilhadoImpar == null) {
                    System.out.println("Pilha ímpar está vazoa");
                } else {
                    System.out.println("Desempilhado elementos: " + pilhaPar.topo() + " e " + pilhaImpar.topo() + " das pilhas");
                    pilhaImpar.desempilha();
                    pilhaPar.desempilha();
                }

            }

            if (num % 2 == 0 && num != 0) {
                System.out.println("Empilhando o número par na pilha Par " + num);
                pilhaPar.empilha(num);
            } else if (num % 2 != 0 && num != 0) {
                pilhaImpar.empilha(num);
                System.out.println("Empilhando o número ímpar na pilha Ímpar " + num);

            }
        }
        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilhaPar.estaVazia()) {
            System.out.println("Número par, desempilhando um elemento da pilha par: " + pilhaPar.desempilha());
        }
        while (!pilhaImpar.estaVazia()) {
            System.out.println("Número ímpar, desempilhando um elemento da pilha ímpar: " + pilhaImpar.desempilha());
        }
        System.out.println("\nTodos os elementos foram desempilhados");
    }

}