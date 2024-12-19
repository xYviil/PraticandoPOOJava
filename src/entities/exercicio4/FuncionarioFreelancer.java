package entities.exercicio4;

public class FuncionarioFreelancer extends Funcionario{

    private Integer horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioFreelancer(Integer id, String nome, Integer horasTrabalhadas, double valorPorHora) {
        super(id, nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }
}
