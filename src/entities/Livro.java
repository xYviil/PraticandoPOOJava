package entities;

public class Livro extends MaterialBiblioteca{

    private String genero;

    public Livro(String titulo, String autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Gênero: " + genero);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2;
    }
}
