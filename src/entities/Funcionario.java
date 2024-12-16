package entities;

public abstract class Funcionario {

    private String nome;
    private Integer id;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer id) {
        this.nome = nome;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + " ID: " + id);
    }

    public abstract Double calcularPagamento();

}
