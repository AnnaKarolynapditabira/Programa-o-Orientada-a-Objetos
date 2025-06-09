import org.junit.Test;

public class PublicacaoStrategyTest {

    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("Lucas", "Brasileiro", true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar();
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("Anna", "Brasileira", true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar();
    }

    @Test
    public void testSemEstrategia() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        autor.publicar();
    }
}