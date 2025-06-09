public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Lucas", "Brasileiro", true);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();  // Publicando um livro...

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar();  // Publicando um artigo...
    }
}