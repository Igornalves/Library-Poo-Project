package Class;

import Services.MultaService;

public class Multa {

    private String id;
    private Usuario usuario;
    private String valor;
    private String dataGeracao;
    private String status;

    @SuppressWarnings("unused")
    private MultaService multaService;

    public Multa(String id, Usuario usuario, String valor, String dataGeracao, String status) {
        this.id = id;
        this.usuario = usuario;
        this.valor = valor;
        this.dataGeracao = dataGeracao;
        this.status = status;
        this.multaService = new MultaService();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
