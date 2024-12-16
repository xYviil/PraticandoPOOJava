package exercicios;

import entities.Funcionario;
import entities.FuncionarioFixo;
import entities.FuncionarioPorHora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite o número de funcionários que deseja cadastrar: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o tipo de funcionário (fixo ou por hora): ");
            String tipoFuncionario = sc.nextLine();
            System.out.print("Digite o nome do funcionário: ");
            String nome = sc.nextLine();
            System.out.print("Digite o ID do funcionário: ");
            int id = sc.nextInt();

            if (tipoFuncionario.equals("fixo")) {
                System.out.print("Digite o salário mensal: ");
                double salarioMensal = sc.nextDouble();
                sc.nextLine();
                funcionarios.add(new FuncionarioFixo(nome,id,salarioMensal));
            } else if (tipoFuncionario.equals("por hora")) {
                System.out.print("Digite as horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                System.out.print("Digite o valor por hora:");
                double valorPorHora = sc.nextDouble();
                funcionarios.add(new FuncionarioPorHora(nome, id, horasTrabalhadas, valorPorHora));
                sc.nextLine();
            } else {
                System.out.println("Tipo inválido! Esse funcionário será ignorado!");
            }
        }
        System.out.println("\n <---- FUNCIONÁRIOS CADASTRADOS ----> ");
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarInformacoes();
            System.out.printf("Salário: R$ %.2f", funcionario.calcularPagamento());
            System.out.println();
        }


        sc.close();

    }
}
