/**
 * Representação do descanso, especificamente , matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
 * por esta matrícula.
 *
 * @author Júlio Silva
 */
public class Descanso {
    // Atributos
    private int horasDescanso;
    private int numeroSemanas;
    //Construtor
    public void Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }
    // Métodos
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

    public String getStatusGeral(){
        double verif = this.horasDescanso / this.numeroSemanas;

        if (verif >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
    @Override
    public String toString() {
        return "Status Geral de Descanso: " + getStatusGeral();
    }

    public int hashCode() {
        return getStatusGeral().hashCode();
    }
}
