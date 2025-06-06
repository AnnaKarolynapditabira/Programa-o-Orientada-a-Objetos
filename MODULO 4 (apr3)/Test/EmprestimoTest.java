import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class EmprestimoTest {
    @Test
    public void testEmprestimo() {
        Date data = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês", false), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario, data, data);

        assertEquals("Gabriel", emprestimo.getUsuario().getNome());
        assertFalse(livro.isDisponivel());
    }
}
