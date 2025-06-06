import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioTest {
    @Test
    public void testIdade() {
        Usuario usuario = new Usuario("Lucas", 25);
        assertEquals(25, usuario.getIdade());

        usuario.setIdade(30);
        assertEquals(30, usuario.getIdade());
    }
}
