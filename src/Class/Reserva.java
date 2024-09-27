package Class;

import Services.ReservaService;

public class Reserva {

    private String id;
    private Usuario usuario;
    private Livro livro;
    private String dataReserva;
    private String dataLimiteRetirada;

    @SuppressWarnings("unused")
    private ReservaService reservasService;

    public Reserva(String id, Usuario usuario, Livro livro, String dataReserva, String dataLimiteRetirada) {
        this.id = id;
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = dataReserva;
        this.dataLimiteRetirada = dataLimiteRetirada;
        this.reservasService = new ReservaService();
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
