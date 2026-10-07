/**
 * Gerencia o registro de resumos de estudos.
 *
 * @author Júlio Silva
 */
public class RegistroResumos {
    // Atributos
    private String[] temas;
    private String[] conteudos;
    private int capacidade;
    private int quantidade;
    private int proximaPosicao;

    //Construtor
    /**
     * Inicializa o registro de resumos com a capacidade desejada.
     *
     * @param numeroResumos quantidade máxima de resumos armazenados
     */
    public RegistroResumos(int numeroResumos) {
        this.capacidade = numeroResumos;
        this.temas = new String[numeroResumos];
        this.conteudos = new String[numeroResumos];
        this.quantidade = 0;
        this.proximaPosicao = 0;
    }

    // Métodos
    /**
     * Adiciona um novo resumo. Substitui o mais antigo se a capacidade
     * estiver cheia.
     *
     * @param tema tema do resumo.
     * @param conteudo conteúdo textual do resumo.
     */
    public void adiciona(String tema, String conteudo) {
        this.temas[this.proximaPosicao] = tema;
        this.conteudos[this.proximaPosicao] = conteudo;

        if (this.quantidade < this.capacidade) {
            this.quantidade++;
        }

        this.proximaPosicao = (this.proximaPosicao + 1) % this.capacidade;
    }

    /**
     * Retorna um array com os resumos formatados ("Tema: Conteúdo").
     *
     * @return array de Strings dos resumos.
     */
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = this.temas[i] + ": " + this.conteudos[i];
        }
        return resultado;
    }

    /**
     * Retorna uma String com o total e os temas dos resumos cadastrados.
     *
     * @return texto formatado contendo a contagem e os temas.
     */
    public String imprimeResumos() {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(this.quantidade).append("resumo(s) cadastrado(s)\n- ");
        for (int i = 0; i < this.quantidade; i++) {
            sb.append(this.temas[i]);
            if (i < this.quantidade - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    /**
     * Retorna a quantidade atual de resumos armazenados.
     *
     * @return total de resumos.
     */
    public int conta() {
        return this.quantidade;
    }

    /**
     * Adicional para conta(), mantendo compatibilidade
     * com a especificação.
     *
     * @return total de resumos.
     */
    public int contaResumos() {
        return conta();
    }

    /**
     * Verifica se existe algum resumo cadastrado com determinado
     * tema.
     *
     * @param tema tema a ser procurado.
     * @return true se encontrado, false caso contrário.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.quantidade; i++) {
            if (this.temas[i] != null && this.temas[i].equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
