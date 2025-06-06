import static org.junit.Assert.*;
import org.junit.Test;

public class AutorTest {
    @Test
    public void testIsUsuario() {
        Autor autor = new Autor("Jess", "Brasileira", true);
        assertTrue(autor.isUsuario());

        autor.setUsuario(false);
        assertFalse(autor.isUsuario());
    }
}
