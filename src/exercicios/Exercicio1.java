/* Sistema de Controle de Animais
Você foi contratado para desenvolver um sistema que gerencia diferentes tipos de animais em um zoológico.
Os animais possuem algumas características e comportamentos em comum, mas cada espécie tem suas particularidades.*/

package exercicios;

import entities.exercicio1.Animal;
import entities.exercicio1.Cachorro;
import entities.exercicio1.Gato;
import entities.exercicio1.Zoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        System.out.println("Quantos animais você deseja cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o tipo de animal (cachorro/gato).:");
            String tipo = sc.next();

            System.out.println("Digite o nome do " + tipo + ": ");
            String nome = sc.next();
            System.out.println("Digite a idade do " + tipo + ": ");
            int idade = sc.nextInt();
            sc.nextLine();
            if (tipo.equals("cachorro")) {
                animais.add(new Cachorro(nome, idade));
            }  else if (tipo.equals("gato")) {
                Gato gato = new Gato(nome, idade);
                animais.add(gato);
            } else {
            System.out.println("Tipo inválido! Esse animal será ignorado.");
            }
        }
        System.out.println("\n--- Animais Cadastrados ---");
        Zoologico.exibirAnimais(animais);
        sc.close();

    }
}
