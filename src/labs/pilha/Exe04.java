package labs.pilha;

import base.Livro;

import java.util.Stack;

public class Exe04 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setNome("Learning JavaScript Data Structure");
        livro1.setAutor("Loiane");
        livro1.setAnoLancamento(2016);
        livro1.setIsbn("isbn wsfshjdbfvskijfgd");

        Livro livro2 = new Livro();
        livro2.setNome("Learning bleh");
        livro2.setAutor("Loiane");
        livro2.setAnoLancamento(2016);
        livro2.setIsbn("isbn wsfshjdbfvskijfgd");

        Livro livro3 = new Livro();
        livro3.setNome("Learning t Data Structure");
        livro3.setAutor("Loiane");
        livro3.setAnoLancamento(2016);
        livro3.setIsbn("isbn wsfshjdbfvskijfgd");

        Livro livro4 = new Livro();
        livro4.setNome("Learning  Structure");
        livro4.setAutor("Loiane");
        livro4.setAnoLancamento(2016);
        livro4.setIsbn("isbn wsfshjdbfvskijfgd");

        System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.isEmpty());
        System.out.println("Empilhando livros na pilha");

        pilha.add(livro1);
        pilha.add(livro2);
        pilha.add(livro3);
        pilha.add(livro4);

        System.out.println(pilha.size() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Espiando o topo da pilha: " + pilha.peek());

        System.out.println("Desempilhando livros da pilha");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro: " + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());
    }
}
