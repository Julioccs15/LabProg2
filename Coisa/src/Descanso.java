/**
 * Representa a rotina de descanso de um estudante.
 *
 * @author Júlio Silva
 */
public class Descanso {
    // Atributos
    /** Quantidade acumulada de horas de descanso. */
    private int horasDescanso;

    /** Número de semanas acompanhadas. */
    private int numeroSemanas;

    //Construtor
    /**
     * Constrói a rotina de descanso inicializando as horas de descanso.
     * e o número de semanas com zero.
     */
    public void Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }
    // Métodos
    /** Define a quantidade total de horas de descanso acumuladas pelo aluno.
     *
     * @param valor quantidade de horas de descanso.
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define o número total de semanas decorridas.
     *
     * @param valor número de semanas
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    /**
     * Avalia a situação atual do descanso do aluno.
     * Para ser considerado descansado, o aluno precisa ter uma média de 26
     * horas ou mais de descanso por semana
     *
     * @return "descansodo" se a média semanal for maior ou igual a 26 horas,
     * ou "cansado" caso contrário (inclusive no estado inicial).
     */
    public String getStatusGeral(){
        if (this.numeroSemanas > 0 && (this.horasDescanso / this.numeroSemanas) >= 26) {
            return "descansado";
        }
        return "cansado";
    }

    /**
     * Retorna a representação textual do status geral de descanso.
     *
     * @return String no formato "Status Geral de Descanso: STATUS"
     */
    @Override
    public String toString() {
        return "Status Geral de Descanso: " + getStatusGeral();
    }
}
