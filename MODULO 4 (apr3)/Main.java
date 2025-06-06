import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);
        Date data = new Date();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, data, data);
        emprestimo.imprimirResumo();

        // Criando um artigo
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);
        System.out.println("\nArtigo: " + artigo.getTitulo() + " | Autor: " + artigo.getAutor().getNome());
    }
}
