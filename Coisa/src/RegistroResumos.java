import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

            if (this.quantidade < this.capacidade) {
                this.quantidade++;
            }

            if (this.proximaPosicao == this.capacidade - 1) {
                this.proximaPosicao = 0;
            } else {
                this.proximaPosicao++;
            }
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

    /**
     * Busca uma parte de texto nos conteúdos dos resumos cadastrados e retorna
     * um array de strings contendo os temas dos resumos nos quais foram
     * encontrados o trecho inserido como parâmetro.
     *
     * @param chaveDeBusca é a parte de texto que será procurado nos resumos
     * @return array de strings contendo o(s) tema(s) do(s) resumo(s) que
     * foi(ram) encontrada(s) a(s) semelhança(s)
     */
    public String[] busca(String chaveDeBusca) {
        // Lista temporária para armazenar os temas encontrados
        List<String> temasEncontrados = new ArrayList<>();

        // Se a chave for nula ou vazia, podemos retornar um array vazio
        if (chaveDeBusca == null || chaveDeBusca.isEmpty()) {
            return new String[0];
        }

        // Padroniza a chave de busca para letras minúsculas (ignora maiúsculas/minúsculas)
        String chaveMinuscula = chaveDeBusca.toLowerCase();

        // Percorre o array considerando apenas os elementos válidos/cadastrados (quantidade)
        for (int i = 0; i < this.quantidade; i++) {
            Resumo resumo = this.resumos[i];

            if (resumo != null && resumo.getConteudo() != null) {
                // Padroniza o conteúdo do resumo para minúsculas para a comparação
                String conteudoMinusculo = resumo.getConteudo().toLowerCase();

                // Verifica se a chave faz parte do conteúdo
                if (conteudoMinusculo.contains(chaveMinuscula)) {
                    // Adiciona o tema correspondente à lista
                    temasEncontrados.add(resumo.getTema());
                }
            }
        }

        // Ordena a lista em ordem alfabética/lexicográfica
        Collections.sort(temasEncontrados);

        // Converte a List<String> para um array de String[] e o retorna
        return temasEncontrados.toArray(new String[0]);
    }
}
