public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean isUsuario;

    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario;
    }
}
