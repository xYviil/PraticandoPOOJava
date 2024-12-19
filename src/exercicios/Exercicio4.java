/* Cadastro e Cálculo de Salários

Crie um programa em Java que gerencie o cadastro de funcionários em uma empresa. O programa deve utilizar herança e polimorfismo para lidar com dois tipos de funcionários:

Funcionários CLT (contratados com salário fixo).
Funcionários Freelancer (pagos por hora trabalhada).
O programa deve permitir:

- Cadastrar funcionários.
- Exibir a lista de todos os funcionários.
- Calcular o salário de um funcionário selecionado com base nas características de seu tipo.*/

package exercicios;

import entities.exercicio4.Funcionario;
import entities.exercicio4.FuncionarioCLT;
import entities.exercicio4.FuncionarioFreelancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> tipoFuncionarios = new ArrayList<>();

        System.out.println("Quantos funcionários serão cadastrados?");
        int n = sc.nextInt();
        sc.nextLine();

        int cadastrados = 0;

        while (cadastrados < n) {
            System.out.println("O funcionário é CLT ou Freelancer?");
            String cltFreelancer = sc.nextLine().toLowerCase();

            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();

            if (cltFreelancer.equals("clt")) {
                System.out.println("Salário fixo: ");
                double salarioFixo = sc.nextDouble();
                sc.nextLine();
                tipoFuncionarios.add(new FuncionarioCLT(cadastrados + 1, nome, cltFreelancer, salarioFixo ));
                cadastrados++;
            } else if (cltFreelancer.equals("freelancer")) {
                System.out.println("Horas trabalhadas: ");
                int horasTrabalhadas = sc.nextInt();
                sc.nextLine();
                System.out.println("Valor por hora: ");
                double valorPorHora = sc.nextDouble();
                sc.nextLine();
                tipoFuncionarios.add(new FuncionarioFreelancer(cadastrados + 1, nome, horasTrabalhadas, valorPorHora));
                cadastrados++;
            } else {
                System.out.println("Tipo de funcionário inválido! Vamos repetir.");
                System.out.println();
            }
        }

        System.out.println("\n <---- Funcionários Cadastrados ---->");
        for (Funcionario funcionario : tipoFuncionarios) {
            String tipo = funcionario instanceof FuncionarioCLT ? "CLT" : "FreeLancer";
            System.out.printf("ID: %d | Nome: %s | Tipo: %s%n", funcionario.getId(), funcionario.getNome(), tipo);
        }

        System.out.println("\n ID do funcionário para calcular o salário: ");
        int id = sc.nextInt();

        Funcionario funcionarioSelecionado = null;
        for (Funcionario func : tipoFuncionarios) {
            if (func.getId() == id) {
                funcionarioSelecionado = func;
                break;
            }
        }

        if (funcionarioSelecionado != null) {
            System.out.printf("\nFuncionário: %s%n", funcionarioSelecionado.getNome());
            System.out.printf("Salário calculado: R$ %.2f%n", funcionarioSelecionado.calcularSalario());
        } else {
            System.out.println("ID inválido.");
        }
        sc.close();
    }
}
