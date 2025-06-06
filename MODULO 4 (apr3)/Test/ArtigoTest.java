import static org.junit.Assert.*;
import org.junit.Test;

public class ArtigoTest {
    @Test
    public void testArtigoPublicado() {
        Autor autor = new Autor("Gabriel", "Brasileiro", true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", false);

        assertFalse(artigo.isPublicado());

        artigo.setPublicado(true);
        assertTrue(artigo.isPublicado());
    }
}
