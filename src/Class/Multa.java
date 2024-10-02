package Class;

import java.util.UUID;

public class Multa {

    private String id = UUID.randomUUID().toString();
    private Usuario usuario;
    private String valor;
    private String dataGeracao;
    private String status;

    public Multa(Usuario usuario, String valor, String dataGeracao, String status) {
        this.usuario = usuario;
        this.valor = valor;
        this.dataGeracao = dataGeracao;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
