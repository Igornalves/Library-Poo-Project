package Class;

import java.util.UUID;

public class Emprestimo {

    private String id = UUID.randomUUID().toString();
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucaoReal;
    private String dataDevolucaoPrevista;
    private boolean status;
    
    public Emprestimo(Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucaoReal,
            String dataDevolucaoPrevista, boolean status) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoReal = dataDevolucaoReal;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(String dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public String getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
