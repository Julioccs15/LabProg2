import java.util.Objects;

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
     * @param tema tema do resumo
     * @param conteudo conteúdo textual do resumo
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
     * @return o conteúdo textual do objeto Resumo em String
     */
    public String getConteudo() {
        return this.conteudo;
    }

    /**
     * Retorna a String que representa o resumo. A representação
     * segue o formato "Tema: TEMA \nConteúdo: CONTEÚDO".
     *
     * @return a representação em String de um resumo
     */
    @Override
    public String toString() {
        return this.tema + ": " +  this.conteudo;
    }
    /**
     * Redefine qual (ou quais) atributo(s) que representam o resumo
     * para fins de comparação entre objetos. Nesse caso, o que o
     * define é o tema.
     *
     * @param o é o objeto a ser comparado
     *
     * @return true se os objetos forem iguais pelo tema, ou false
     * caso contrário
     */
    @Override
    public boolean equals(Object o) {
        // verifica se o objeto não é nulo
        if (o == null) {
            return false;
        }

        // verifica se o objeto é do mesmo tipo
        if (!(o instanceof Resumo)) {
            return false;
        }

        // casting para a classe correspondente
        Resumo oResumo = (Resumo) o;

        // comparação de atributos relevantes
        return (this.tema.equals(oResumo.getTema()));
    }

    /**
     * Retorna o inteiro que representa o resumo. Essa representação
     * é definida com base no tema do resumo.
     *
     * @return a representação em inteiro de um resumo
     */
    @Override
    public int hashCode() {
        return this.tema.hashCode();
    }
}
