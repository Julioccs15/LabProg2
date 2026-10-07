/**
 * Mantém o registro do tempo de internet que o aluno tem dedicado a uma determinada
 * disciplina em relação ao tempo esperado.
 *
 * @author Júlio Silva
 */
public class RegistroTempoOnline {
    // Atributos
    /** Nome da disciplina monitorada. */
    private String nomeDisciplina;

    /** Tempo acumulado online em horas. */
    private int tempoOnline;

    /** Tempo online esperado para a disciplina em horas. */
    private int tempoOnlineEsperado;
    //Construtores
    /**
     * Constrói o registro definindo o nome da disciplina e assumindo
     * o tempo esperado padrão de 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }
    /**
     * Constrói o registro definindo o nome da disciplina e o tempo esperado.
     *
     * @param nomeDisciplina o nome da disciplina.
     * @param tempoOnlineEsperado a quantidade de horas online esperada.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    // Métodos
    /**
     * Adiciona horas de estudo online ao total acumulado.
     *
     * @param tempo quantidade de horas a adicionar.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /**
     * Verifica se o aluno atingiu a meta de tempo online esperada.
     *
     * @return true se o tempo acumulado for maior ou igual ao esperado,
     * false caso contrário.
     */
    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnline >= this.tempoOnlineEsperado;
    }

    /**
     * Retorna a representação em String do registro de tempo online.
     *
     * @return texto no formato "NOME_DISCIPLINA tempoOnline/tempoOnlineEsperado".
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}