package entities.exercicio2;

public class FuncionarioFixo extends Funcionario {

    private Double salarioMensal;

    public FuncionarioFixo(String nome, Integer id, Double salarioMensal) {
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(Double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }


    @Override
    public Double calcularPagamento() {
        return salarioMensal;
    }
}
