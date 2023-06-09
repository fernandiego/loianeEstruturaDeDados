package aulas;

import fila.FilaComPrioridade;
import fila.Paciente;

public class Aula24 {
    public static void main(String[] args) {

        FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();

        fila.enfileira(new Paciente("A",1));
        fila.enfileira(new Paciente("C",3));
        fila.enfileira(new Paciente("B",2));

        System.out.println(fila);

        System.out.println(fila.desenfileira());

        System.out.println(fila);
    }
}
