/**
 * Representa um resumo composto por tema e conteúdo textual.
 *
 * @author Júlio Silva
 */
public class Resumo {

    // Atributos
    /** Tema do resumo */
    private String tema;

    /** Conteúdo textual do resumo */
    private String conteudo;

    // Construtor
    /**
     * Cria um resumo.
     *
     * @param tema tema do resumo.
     * @param conteudo conteúdo textual do resumo.
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }
}
