import static org.junit.Assert.*;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testAdicionarEmprestimoEGetHistorico() {
        Usuario usuario = new Usuario("Gabriel", 21);
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia");
        Emprestimo emprestimo = new Emprestimo(new java.util.Date(), new java.util.Date(), livro, usuario);

        assertTrue(usuario.getHistoricoEmprestimos().contains(emprestimo));
    }
}
