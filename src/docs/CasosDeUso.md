# Requisitos Funcionais e Regras de Negócio - Sistema de Biblioteca

## Requisitos Funcionais

1. **Cadastro de Usuários**
   - A aplicação deve permitir o cadastro de usuários, armazenando informações como nome, CPF, e-mail, telefone e endereço.

2. **Cadastro de Livros**
   - A aplicação deve permitir o cadastro de livros, incluindo informações como título, autor, ISBN, editora, ano de publicação e número de exemplares disponíveis.

3. **Empréstimo de Livros**
   - A aplicação deve permitir que os usuários realizem empréstimos de livros, verificando a disponibilidade do exemplar e registrando a data de retirada e a data prevista de devolução.

4. **Devolução de Livros**
   - A aplicação deve permitir a devolução de livros, atualizando o status do livro no sistema e registrando a data de devolução.

5. **Reserva de Livros**
   - A aplicação deve permitir a reserva de livros caso todos os exemplares estejam emprestados. O usuário será notificado quando o livro estiver disponível para retirada.

6. **Renovação de Empréstimos**
   - A aplicação deve permitir que os usuários renovem seus empréstimos, desde que não haja uma reserva pendente para o mesmo livro.

7. **Consulta de Livros**
   - A aplicação deve permitir a consulta de livros por diversos critérios, como título, autor, gênero, editora ou ISBN.

8. **Histórico de Empréstimos**
   - A aplicação deve manter um histórico de empréstimos para cada usuário, listando todos os livros retirados e devolvidos, bem como atrasos e multas, se aplicáveis.

9. **Geração de Relatórios**
   - A aplicação deve gerar relatórios de livros mais emprestados, usuários que mais retiraram livros e exemplares com maior tempo de espera em reservas.

10. **Controle de Multas**
    - A aplicação deve calcular e controlar multas para livros devolvidos após o prazo estipulado.

## Regras de Negócio

1. **Limite de Empréstimos**
   - Cada usuário pode realizar até 5 empréstimos simultâneos. Caso o limite seja atingido, o usuário deverá devolver um livro antes de fazer um novo empréstimo.

2. **Prazo de Devolução**
   - O prazo padrão para devolução de livros é de 14 dias, podendo ser renovado por mais 14 dias caso não haja reservas para o exemplar.

3. **Multas por Atraso**
   - A multa por atraso na devolução de livros será de R$ 2,00 por dia de atraso. A multa máxima não deve exceder 50% do valor de mercado do livro.

4. **Reserva de Livros**
   - Um usuário pode reservar até 3 livros simultaneamente. Quando o livro reservado estiver disponível, o usuário terá 48 horas para retirá-lo, caso contrário a reserva será cancelada.

5. **Renovação de Empréstimos**
   - O empréstimo pode ser renovado apenas uma vez. Após isso, o livro deve ser devolvido e poderá ser emprestado novamente caso esteja disponível.

6. **Exclusão de Usuários com Multas Pendentes**
   - Usuários com multas superiores a R$ 50,00 não poderão realizar novos empréstimos ou reservas até que as multas sejam pagas.

7. **Empréstimos Especiais**
   - Livros de consulta obrigatória (como enciclopédias e dicionários) não podem ser emprestados para usuários, mas podem ser consultados na biblioteca.

8. **Relatórios Periódicos**
   - O sistema deve gerar relatórios mensais sobre os livros mais emprestados e o status das reservas e multas para acompanhamento pela administração.

9. **Descontos em Multas**
   - Em campanhas de incentivo à leitura, a biblioteca pode aplicar descontos de até 50% nas multas por atraso, a critério da administração.

## Estrutura em POO

Em termos de POO, as seguintes classes podem ser utilizadas:

### Usuário
- **Atributos**: nome, CPF, email, telefone, endereco, listaDeEmprestimos, multas.
- **Métodos**: realizarEmprestimo(), devolverLivro(), renovarEmprestimo(), reservarLivro(), pagarMulta().

### Livro
- **Atributos**: titulo, autor, ISBN, editora, anoPublicacao, numeroExemplares, disponibilidade.
- **Métodos**: verificarDisponibilidade(), reservar(), emprestar(), devolver().

### Emprestimo
- **Atributos**: id, usuario, livro, dataEmprestimo, dataDevolucaoPrevista, dataDevolucaoReal, status.
- **Métodos**: calcularMulta(), renovar(), registrarDevolucao().

### Reserva
- **Atributos**: id, usuario, livro, dataReserva, dataLimiteRetirada.
- **Métodos**: notificarDisponibilidade(), cancelarReserva().

### Multa
- **Atributos**: id, usuario, valor, dataGeracao, status.
- **Métodos**: calcularValor(), pagar(), verificarStatus().

### Relatório
- **Atributos**: periodo, listaDeLivrosEmprestados, listaDeUsuariosComMulta.
- **Métodos**: gerarRelatorioEmprestimos(), gerarRelatorioReservas(), gerarRelatorioMultas().

