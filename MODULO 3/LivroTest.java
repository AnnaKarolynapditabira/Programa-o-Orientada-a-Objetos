import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertEquals("tecnologia", livro.getGenero());
    }

    @Test
    public void testIsDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia");
        assertTrue(livro1.isDisponivel());
        assertTrue(livro2.isDisponivel());
    }

    @Test
    public void testValidarDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertTrue(livro.isDisponivel());
        livro.validarDisponibilidade();
        assertFalse(livro.isDisponivel());
    }

    @Test
    public void testSetDisponivel() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        livro.validarDisponibilidade();
        assertFalse(livro.isDisponivel());
        livro.setDisponivel(true);
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testEqualsAndHashCode() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia");
        Livro livro2 = new Livro("Java Basico", autor, "tecnologia");
        assertEquals(livro1, livro2);
        assertEquals(livro1.hashCode(), livro2.hashCode());
    }

    @Test
    public void testToString() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        String str = livro.toString();
        assertTrue(str.contains("Java Basico"));
        assertTrue(str.contains("tecnologia"));
        assertTrue(str.contains("Jess"));
    }

    @Test
    public void testLivroIndisponivelNaoPodeSerEmprestado() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        livro.validarDisponibilidade();
        assertFalse(livro.isDisponivel());
        // Supondo que exista um método para emprestar, ele deve lançar exceção ou retornar false
        // Exemplo: assertFalse(livro.emprestar());
    }
}
