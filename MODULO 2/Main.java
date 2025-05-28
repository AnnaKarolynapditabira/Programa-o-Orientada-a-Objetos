import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando autor
        Autor autor = new Autor("Jessica Felix", "Brasileira");

        // Criando livro
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        // Criando usuário
        Usuario usuario = new Usuario("Lucas Rafael", 25);

        // Criando datas (pode usar a data atual)
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        // Fazendo empréstimo
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        // Verificar se o livro está disponível depois do empréstimo
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
        }

        // Exibir informações
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println();
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println();
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
