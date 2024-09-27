package Class;

import java.util.ArrayList;

import Services.UsuarioService;

public class Usuario {
    
    private String nome;
    private int cpf;
    private String email;
    private String telefone;
    private String endereco;
    private ArrayList<Emprestimo> listaDeEmprestino;

    @SuppressWarnings("unused")
    private UsuarioService usuarioService;
    
    public Usuario(String nome, int cpf, String email, String telefone, String endereco,
            ArrayList<Emprestimo> listaDeEmprestino) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.listaDeEmprestino = listaDeEmprestino;
        this.usuarioService = new UsuarioService();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Emprestimo> getListaDeEmprestino() {
        return listaDeEmprestino;
    }

    public void setListaDeEmprestino(ArrayList<Emprestimo> listaDeEmprestino) {
        this.listaDeEmprestino = listaDeEmprestino;
    }
}
