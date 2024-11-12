package Services;


import Class.Livro;
import Class.Usuario;

public class UsuarioService {


    public void realizarEmprestimo(Usuario usuario,Livro livro) {
        if (livro.getDisponibilidade() == false) {
            System.out.printf("Usuario %S realizou o emprestino do livro %S concluido %n", usuario.getNome(), livro.getTitulo());
            livro.setDisponibilidade(true);
        }
    }

    public void devolverLivro() {

    }

    public void renovarEmprestimo() {

    }

    public void reservarLivro() {

    }

    public void pagarMulta() {

    }
}
