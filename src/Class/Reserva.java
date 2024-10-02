package Class;

import java.util.UUID;

public class Reserva {

    private String id = UUID.randomUUID().toString();
    private Usuario usuario;
    private Livro livro;
    private String dataReserva;
    private String dataLimiteRetirada;

    public Reserva(Usuario usuario, Livro livro, String dataReserva, String dataLimiteRetirada) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = dataReserva;
        this.dataLimiteRetirada = dataLimiteRetirada;
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

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getDataLimiteRetirada() {
        return dataLimiteRetirada;
    }

    public void setDataLimiteRetirada(String dataLimiteRetirada) {
        this.dataLimiteRetirada = dataLimiteRetirada;
    }

}
