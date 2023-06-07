package labs.pilha;

import base.Livro;
import pilha.Pilha;

public class Exe03 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);

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

        System.out.println("Pilha de livros criada, pilha está vazia?" + pilha.estaVazia());
        System.out.println("Empilhando livros na pilha");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " livros foram empilhados");
        System.out.println(pilha);

        System.out.println("Espiando o topo da pilha: " + pilha.topo());

        System.out.println("Desempilhando livros da pilha");

        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
    }
}
