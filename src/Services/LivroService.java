package Services;

import java.util.ArrayList;
import java.util.List;

import Class.Livro;
import Class.Usuario;

public class LivroService {

    private List<Livro> livros;

    public LivroService() {
        this.livros = new ArrayList<>();
    }

    public void verificarDisponibilidade(Livro livro) {
        if (livro.getDisponibilidade() == true) {
            System.out.println("Livro esta disponivel para reserva !!!");
        } else {
            System.out.println("Livro nao disponivel para reserva !!!");
            livro.setDisponibilidade(false);
        }
    }

    public void reservar(Usuario usuario, Livro livro, String data) {
        livros.add(livro);
        System.out.println("O usuario de nome " + usuario.getNome() + " reservou o livro " + livro.getTitulo());
    }

    public void emprestar(Usuario usuario, Livro livro) {
        livros.add(livro);
        System.out.println("O usuario de nome " + usuario.getNome() + " reservou o livro " + livro.getTitulo());
    }

    public void devolver(Livro livro) {
        
    }
}
