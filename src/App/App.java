package app;

import Class.Livro;
import Class.Usuario;
import Services.UsuarioService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) throws Exception {
        // Cria o JFrame (janela principal de cadastro de usuário)
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Criação dos componentes do formulário de cadastro de usuário
        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        JTextField telefoneField = new JTextField(20);

        JLabel enderecoLabel = new JLabel("Endereço:");
        JTextField enderecoField = new JTextField(20);

        JButton cadastrarButton = new JButton("Cadastrar");

        // Painel para organizar os componentes de cadastro de usuário
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));  // Layout vertical
        panel.add(nomeLabel);
        panel.add(nomeField);

        panel.add(emailLabel);
        panel.add(emailField);

        panel.add(telefoneLabel);
        panel.add(telefoneField);

        panel.add(enderecoLabel);
        panel.add(enderecoField);

        panel.add(cadastrarButton);

        // Adiciona o painel ao frame de cadastro de usuário
        frame.add(panel);
        frame.setVisible(true);

        // Evento de clique no botão "Cadastrar" (Cadastro de Usuário)
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Captura os dados inseridos nos campos de texto
                String nome = nomeField.getText();
                String email = emailField.getText();
                String telefone = telefoneField.getText();
                String endereco = enderecoField.getText();

                // Cria o objeto Usuario com os dados inseridos
                Usuario novoUsuario = new Usuario(nome, email, telefone, endereco);

                // Exibe uma mensagem de confirmação
                JOptionPane.showMessageDialog(frame, "Usuário cadastrado com sucesso:\n"
                        + "Nome: " + novoUsuario.getNome() + "\n"
                        + "Email: " + novoUsuario.getEmail() + "\n"
                        + "Telefone: " + novoUsuario.getTelefone() + "\n"
                        + "Endereço: " + novoUsuario.getEndereco());

                // Fecha a janela de cadastro de usuário
                frame.dispose();

                // Chama o método para abrir a tela de cadastro de livro
                abrirTelaCadastroLivro();
            }
        });
    }

    // Método para abrir a tela de cadastro de livro
    public static void abrirTelaCadastroLivro() {
        // Cria o JFrame (janela de cadastro de livro)
        JFrame frame2 = new JFrame("Cadastro de Livro");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(500, 500);

        // Criação dos componentes do formulário de cadastro de livro
        JLabel tituloLabel = new JLabel("Título:");
        JTextField tituloField = new JTextField(20);

        JLabel autorLabel = new JLabel("Autor:");
        JTextField autorField = new JTextField(20);

        JLabel editoraLabel = new JLabel("Editora:");
        JTextField editoraField = new JTextField(20);

        JLabel anoPublicacaoLabel = new JLabel("Ano de Publicação:");
        JTextField anoPublicacaoField = new JTextField(20);

        JLabel numeroExemplaresLabel = new JLabel("Número de Exemplares:");
        JTextField numeroExemplaresField = new JTextField(20);

        JLabel disponibilidadeLabel = new JLabel("Disponibilidade:");
        JCheckBox disponibilidadeField = new JCheckBox();

        JButton cadastrarButton2 = new JButton("Cadastrar");

        // Painel para organizar os componentes de cadastro de livro
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));
        panel2.add(tituloLabel);
        panel2.add(tituloField);

        panel2.add(autorLabel);
        panel2.add(autorField);

        panel2.add(editoraLabel);
        panel2.add(editoraField);

        panel2.add(anoPublicacaoLabel);
        panel2.add(anoPublicacaoField);

        panel2.add(numeroExemplaresLabel);
        panel2.add(numeroExemplaresField);

        panel2.add(disponibilidadeLabel);
        panel2.add(disponibilidadeField);

        panel2.add(cadastrarButton2);

        // Adiciona o painel ao frame de cadastro de livro
        frame2.add(panel2);
        frame2.setVisible(true);

        // Evento de clique no botão "Cadastrar" (Cadastro de Livro)
        cadastrarButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Captura os dados inseridos nos campos de texto
                String titulo = tituloField.getText();
                String autor = autorField.getText();
                String editora = editoraField.getText();
                String anoPublicacao = anoPublicacaoField.getText();
                String numeroExemplares = numeroExemplaresField.getText();
                boolean disponibilidade = disponibilidadeField.isSelected();

                // Cria o objeto Livro com os dados inseridos
                Livro novoLivro = new Livro(titulo, autor, editora, anoPublicacao, numeroExemplares, disponibilidade);

                // Exibe uma mensagem de confirmação
                JOptionPane.showMessageDialog(frame2, "Livro cadastrado com sucesso:\n"
                        + "Título: " + novoLivro.getTitulo() + "\n"
                        + "Autor: " + novoLivro.getAutor() + "\n"
                        + "Editora: " + novoLivro.getEditora() + "\n"
                        + "Ano de Publicação: " + novoLivro.getAnoPublicacao() + "\n"
                        + "Número de Exemplares: " + novoLivro.getNumeroExemplares() + "\n"
                        + "Disponibilidade: " + (novoLivro.getDisponibilidade() ? "Sim" : "Não"));
            }
        });
    }
}
