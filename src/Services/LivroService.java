package Services;

import java.util.ArrayList;
import java.util.List;

import Class.Livro;
import Class.Usuario;

public class LivroService {

    private List<Livro> livros;
    private Usuario usuario;

    public LivroService() {
        this.livros = new ArrayList<>();
    }

    public void verificarDisponibilidade(Livro livro) {
        if (livro.getDisponibilidade() == true) {
            System.out.println("Livro esta disponivel para reserva !!!");
        } else {
            System.out.println("Livro nao disponivel para reserva !!!");
            // livro.setDisponibilidade(false);
        }
    }

    public void reservar(Usuario usuario, Livro livro, String data) {
        livros.add(livro);
        livro.setDisponibilidade(false);
        System.out.println("O usuario de nome " + usuario.getNome() + " reservou o livro " + livro.getTitulo());
    }

    public void emprestar(Usuario usuario, Livro livro) {
        livros.add(livro);
        livro.setDisponibilidade(false);
        System.out.println("O usuario de nome " + usuario.getNome() + " reservou o livro " + livro.getTitulo());
    }

    public void devolver(Livro livro) {
        for (int i =0; i < livros.size(); i++){
            if (livros.get(i).getDisponibilidade() == false) {
                livro.setDisponibilidade(true);
                System.out.println("Livro " + livro.getTitulo() + "devolvido pelo usuario " + usuario.getNome() + " estar disponivel !!!");
            }
        }
    }
}
