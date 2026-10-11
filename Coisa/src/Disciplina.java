import java.util.Arrays;

/**
 * Controla o desempenho e as horas dedicadas a uma disciplina.
 *
 * @author Júlio Silva
 */
public class Disciplina {
    // Atributos
    /** Nome da Disciplina. */
    private String nomeDisciplina;

    /** Horas de estudo. */
    private int horasEstudo;

    /** Array de double para registrar as notas. */
    private double[] notas;

    /** Array de pesos das notas. */
    private int[] pesos;

    /** Número de notas. */
    private int numeroNotas;

    // Construtores
    /**
     * Constrói a disciplina com o nome informado, inicializa
     * 4 notas com o valor zero e as horas de estudo também como zero.
     *
     * @param disciplina nome da disciplina
     */
    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[]{1, 1, 1, 1};
        this.numeroNotas = 4;
    }

    /**
     * Constrói a disciplina com o nome informado e a quantidade de notas,
     * inicializa as notas com o valor zero e as horas de estudo também
     * como zero.
     *
     * @param disciplina nome da disciplina
     * @param numeroNotas o número de notas
     */
    public Disciplina(String disciplina,int numeroNotas) {
        this.nomeDisciplina = disciplina;
        this.horasEstudo = 0;
        this.notas = new double[numeroNotas];
        this.numeroNotas = numeroNotas;
        this.pesos = new int[numeroNotas];
        for (int i = 0; i < numeroNotas; i++) {
            pesos[i] = 1;
        }
    }

    /**
     * Constrói a disciplina com o nome informado, a quantidade de notas,
     * e os pesos, inicializa as notas com o valor zero e as horas de
     * estudo também como zero.
     *
     * @param disciplina nome da disciplina
     * @param numeroNotas o número de notas
     * @param pesos array de inteiros no qual são registrados os pesos
     * correspondentes às notas
     */
    public Disciplina(String disciplina, int numeroNotas, int[] pesos) {
        this.nomeDisciplina = disciplina;
        this.horasEstudo = 0;
        this.notas = new double[numeroNotas];
        this.pesos = pesos;
        this.numeroNotas = numeroNotas;
    }

    // Métodos
    /**
     * Cadastra horas de estudo dedicadas à disciplina de forma
     * acumulativa.
     *
     * @param horas número de horas a somar
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra uma nota. Caso a nota seja recadastrada,
     * o novo valor substitui o anterior.
     *
     * @param nota posição da nota
     * @param valorNota valor da nota
     */
    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= this.numeroNotas) {
            this.notas[nota - 1] = valorNota;
        }
    }

    /**
     * Calcula a média ponderada das notas.
     *
     * @return valor da média
     */
    private double calculaMedia() {
        if (this.pesos.length == this.numeroNotas) {
            double somaNotas = 0;
            double somaPesos = 0;
            for (int i = 0; i < this.numeroNotas; i++) {
                somaNotas += this.notas[i] * this.pesos[i];
                somaPesos += this.pesos[i];
            }

            if (somaPesos != 0 && somaNotas != 0) {
                return somaNotas / somaPesos;
            }
        }
        return 0.0;
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina
     * (média >= 7.0).
     *
     * @return true se aprovado, false caso contrário
     */
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    /**
     * Retorna a representação em String da disciplina.
     *
     * @return no formato "NOME_DISCIPLINA horas media
     * [nota1, nota2, nota3, nota4]"
     */
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }
}
