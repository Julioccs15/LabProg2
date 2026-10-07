import java.util.Arrays;

/**
 * Controla o desempenho e as horas dedicadas a uma disciplina.
 *
 * @author Júlio Silva
 */
public class Disciplina {
    // Atributos
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas;

    // Construtor

    /**
     * Constrói a disciplina com o nome informado e inicializa
     * 4 notas com o valor zero.
     *
     * @param nomeDisciplina nome da disciplina.
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[12];
    }

    // Métodos

    /**
     * Cadastra horas de estudo dedicadas à disciplina de forma
     * cumulativa.
     *
     * @param horas número de horas a somar.
     */
    public void cadastraHoras(int horas) {
        horasEstudo += horas;
    }

    /**
     * Cadastra uma nota (de 1 a 4). Caso a nota seja recadastrada,
     * o novo valor substitui o anterior.
     *
     * @param nota      posição da nota (1 a 4).
     * @param valorNota valor da nota.
     */
    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= 4) {
            this.notas[nota - 1] = valorNota;
        }
    }

    /**
     * Calcula a média aritmética das 4 notas.
     *
     * @return valor da média.
     */
    private double calculaMedia() {
        double soma = 0;
        for (double n : this.notas) {
            soma += n;
        }
        return soma / 4.0;
    }

    /**
     * Verifica se o aluno foi aprovado na disciplina
     * (média >= 7.0).
     *
     * @return true se aprovado, false caso contrário.
     */
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    /**
     * Retorna a representação em String da disciplina.
     *
     * @return no formato "NOME_DISCIPLINA horas media
     * [nota1, nota2, nota3, nota4]".
     */
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + calculaMedia() + Arrays.toString(this.notas);
    }
}
