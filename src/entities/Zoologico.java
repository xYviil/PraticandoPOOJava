package entities;

import java.util.List;

public class Zoologico {

    public static void exibirAnimais(List<Animal> animais) {

        for (Animal animal : animais) {
            animal.mostrarInformacoes();
            animal.emitirSom();
            System.out.println();
        }
    }
}
