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
     * Contrói um resumo.
     *
     * @param tema tema do resumo.
     * @param conteudo conteúdo textual do resumo.
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    // Métodos
    /**
     * Retorna o tema do resumo.
     *
     * @return o tema do objeto Resumo em String.
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna o conteúdo do resumo.
     *
     * @return o conteúdo textual do objeto Resumo em String.
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Retorna a String que representa o resumo. A representação
     * segue o formato "Tema: TEMA \nConteúdo: CONTEÚDO".
     *
     * @return a representação em String de um resumo.
     */
    @Override
    public String toString() {
        return this.tema + ": " +  this.conteudo;
    }
}
