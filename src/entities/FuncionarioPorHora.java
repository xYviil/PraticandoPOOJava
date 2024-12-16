package entities;

public class FuncionarioPorHora extends Funcionario {

    private Integer horasTrabalhadas;
    private Double valorPorHora;

    public FuncionarioPorHora(String nome, Integer id, Integer horasTrabalhadas, Double valorPorHora) {
        super(nome, id);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public Double calcularPagamento() {
        return horasTrabalhadas * valorPorHora;
    }
}
