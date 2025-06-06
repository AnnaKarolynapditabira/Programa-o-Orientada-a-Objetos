import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {
    @Test
    public void testDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);

        assertTrue(livro.isDisponivel());

        livro.setDisponivel(false);
        assertFalse(livro.isDisponivel());
    }
}
