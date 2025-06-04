import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class AutorTest {

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testAdicionarObraEGetObrasPublicadas() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");

        List<Livro> obras = autor.getObrasPublicadas();
        assertTrue(obras.contains(livro));
    }

    @Test
    public void testGetObrasPublicadasPorGenero() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia");
        Livro livro3 = new Livro("Receitas", autor, "culinaria");

        List<Livro> livrosTecnologia = autor.getObrasPublicadasPorGenero("tecnologia");
        assertTrue(livrosTecnologia.contains(livro1));
        assertTrue(livrosTecnologia.contains(livro2));
        assertFalse(livrosTecnologia.contains(livro3));
    }
}
