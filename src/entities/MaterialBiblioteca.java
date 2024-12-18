package entities;

public abstract class MaterialBiblioteca {

    private String titulo;
    private String autor;

    public MaterialBiblioteca() {
    }

    public MaterialBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public abstract double calcularMulta(int diasAtraso);


}
