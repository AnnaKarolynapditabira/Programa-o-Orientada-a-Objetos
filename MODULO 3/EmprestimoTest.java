import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testGetDataRetiradaEGetDataDevolucao() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivroEGetUsuario() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testLivroFicaIndisponivelAposEmprestimo() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);

        new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertFalse(livro.isDisponivel());
    }
}