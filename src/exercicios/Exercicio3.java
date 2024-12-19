/* Desafio: Sistema de Biblioteca

Você foi encarregado de desenvolver um sistema simples para gerenciar uma biblioteca. O sistema deve ser
capaz de gerenciar diferentes tipos de materiais disponíveis, como livros e revistas. */

package exercicios;

import entities.exercicio3.Livro;
import entities.exercicio3.MaterialBiblioteca;
import entities.exercicio3.Revista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<MaterialBiblioteca> materiais = new ArrayList<>();

        System.out.println("Quantos materiais você deseja cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o tipo de material (livro ou revista):");
            String tipoMaterial = sc.nextLine().toLowerCase();

            System.out.println("Digite o título:");
            String titulo = sc.nextLine();

            System.out.println("Digite o autor:");
            String autor = sc.nextLine();

            if (tipoMaterial.equals("livro")) {
                System.out.println("Digite o gênero:");
                String genero = sc.nextLine();
                materiais.add(new Livro(titulo, autor, genero));
            } else if (tipoMaterial.equals("revista")) {
                System.out.println("Digite a edição:");
                int edicao = sc.nextInt();
                sc.nextLine();
                materiais.add(new Revista(titulo, autor, edicao));
            } else {
                System.out.println("Tipo inválido! Este material será ignorado.");
            }
        }

        System.out.println("\n<---- Materiais cadastrados ---->");
        for (MaterialBiblioteca materialBiblioteca : materiais) {
            System.out.println("Tipo: " + (materialBiblioteca instanceof Livro ? "Livro" : "Revista"));
            materialBiblioteca.mostrarInformacoes();
            System.out.println();
        }

        System.out.println("Digite o índice do material que deseja calcular a multa:");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < materiais.size()) {
            System.out.println("Quantos dias de atraso?");
            int diasDeAtraso = sc.nextInt();
            MaterialBiblioteca materialBiblioteca = materiais.get(indice);
            System.out.printf("\nMaterial: %s%n", materialBiblioteca.getTitulo());
            System.out.printf("Dias de atraso: %d%n", diasDeAtraso);
            System.out.printf("Multa: R$ %.2f%n", materialBiblioteca.calcularMulta(diasDeAtraso));
        } else {
            System.out.println("Índice inválido!");
        }

        sc.close();
    }
}
