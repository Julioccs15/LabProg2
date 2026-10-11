/**
 * Gerencia uma coleção de resumos.
 *
 * @author Júlio Silva
 */
public class RegistroResumos {
    // Atributos
    /**
     * Array de resumos onde ficarão registrados os objetos do
     * tipo Resumo.
     */
    private Resumo[] resumos;

    /**
     * Capacidade do armazenamento dos resumos.
     */
    private int capacidade;

    /**
     * Quantidade de resumos.
     */
    private int quantidade;

    /**
     * Posição posterior a última na qual foi armazenado o último resumo.
     */
    private int proximaPosicao;

    //Construtor

    /**
     * Inicializa o registro de resumos com a capacidade desejada.
     *
     * @param numeroResumos quantidade máxima de resumos armazenados.
     */
    public RegistroResumos(int numeroResumos) {
        this.capacidade = numeroResumos;
        this.resumos = new Resumo[numeroResumos];
        this.quantidade = 0;
        this.proximaPosicao = 0;
    }

    // Métodos

    /**
     * Adiciona um novo resumo apenas se não houver outro resumo com o
     * mesmo tema e substitui o mais antigo se a capacidade estiver cheia.
     *
     * @param tema tema do resumo a ser adicionado
     * @param conteudo conteúdo textual do resumo a ser adicionado
     */
    public void adiciona(String tema, String conteudo) {
        Resumo resumoNovo = new Resumo(tema, conteudo);
        if (!(temResumo(tema))) {
            this.resumos[this.proximaPosicao] = resumoNovo;
        }

        if (this.quantidade < this.capacidade) {
            this.quantidade++;
        }

        if (this.proximaPosicao == this.capacidade - 1) {
            this.proximaPosicao = 0;
        } else {
            this.proximaPosicao++;
        }
    }

    /**
     * Retorna um array com os resumos formatados ("Tema: Conteúdo").
     *
     * @return array de Strings dos resumos.
     */
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

    /**
     * Retorna uma String com o total e os temas dos resumos cadastrados.
     *
     * @return texto formatado contendo a contagem e os temas.
     */
    public String imprimeResumos() {
        String resultado = "- " + this.quantidade + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < this.quantidade; i++) {
            resultado += resumos[i].getTema();
            if (i < this.quantidade - 1) {
                resultado += " | ";
            }
        }
        return resultado;
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
     * Verifica se existe algum resumo cadastrado com determinado
     * tema.
     *
     * @param tema string tema que irá ser procurado no array de resumos
     *
     * @return true se houver, false caso contrário
     */
    public boolean temResumo(String tema) {
        for (Resumo resumo : this.resumos) {
            if (resumo != null && resumo.getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
}
