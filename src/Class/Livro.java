package Class;

import java.util.UUID;

public class Livro {

    private String id = UUID.randomUUID().toString();
    private String titulo;
    private String autor;
    private String editora;
    private String anoPublicacao;
    private String numeroExemplares;
    private boolean disponibilidade = false;

    public Livro(String titulo, String autor, String editora, String anoPublicacao, String numeroExemplares,
            boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numeroExemplares = numeroExemplares;
        this.disponibilidade = disponibilidade;
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getNumeroExemplares() {
        return numeroExemplares;
    }

    public void setNumeroExemplares(String numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getId() {
        return id;
    }

}
