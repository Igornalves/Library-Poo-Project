package Class;

import java.util.ArrayList;

import Services.RelatorioService;

public class Relatorio {

    private String periodo;
    private ArrayList<Livro> listaDeLivroEmprestados;
    private ArrayList<Multa> listaDeUsuariosComMulta;

    @SuppressWarnings("unused")
    private RelatorioService relatorioService;

    public Relatorio(String periodo, ArrayList<Livro> listaDeLivroEmprestados,
            ArrayList<Multa> listaDeUsuariosComMulta) {
        this.periodo = periodo;
        this.listaDeLivroEmprestados = listaDeLivroEmprestados;
        this.listaDeUsuariosComMulta = listaDeUsuariosComMulta;
        this.relatorioService = new RelatorioService();
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Livro> getListaDeLivroEmprestados() {
        return listaDeLivroEmprestados;
    }

    public void setListaDeLivroEmprestados(ArrayList<Livro> listaDeLivroEmprestados) {
        this.listaDeLivroEmprestados = listaDeLivroEmprestados;
    }

    public ArrayList<Multa> getListaDeUsuariosComMulta() {
        return listaDeUsuariosComMulta;
    }

    public void setListaDeUsuariosComMulta(ArrayList<Multa> listaDeUsuariosComMulta) {
        this.listaDeUsuariosComMulta = listaDeUsuariosComMulta;
    }
}
