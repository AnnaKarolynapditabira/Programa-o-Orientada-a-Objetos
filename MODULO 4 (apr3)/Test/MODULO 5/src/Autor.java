public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean isUsuario;
    private PublicavelInterface estrategiaPublicacao;

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

    public void setUsuario(boolean usuario) {
        isUsuario = usuario;
    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}