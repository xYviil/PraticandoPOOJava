package entities;

public class Revista extends MaterialBiblioteca{

    private int edicao;

    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Edição: " + edicao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.5;
    }
}
