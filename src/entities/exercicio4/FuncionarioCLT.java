package entities.exercicio4;

public class FuncionarioCLT extends Funcionario{

    private double salarioFIxo;

    public FuncionarioCLT(Integer id, String s, String nome, double salarioFixo) {
        super(id, nome);
    }

    public FuncionarioCLT(Integer id, String nome, double salarioFIxo) {
        super(id, nome);
        this.salarioFIxo = salarioFIxo;
    }

    public double getSalarioFIxo() {
        return salarioFIxo;
    }

    public void setSalarioFIxo(double salarioFIxo) {
        this.salarioFIxo = salarioFIxo;
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
