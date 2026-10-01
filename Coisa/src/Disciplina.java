public class Disciplina {
    // Atributos
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas = {0, 0, 0, 0};
    // Construtor
    public void Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    // Métodos
    public void cadastrarHoras(int horas) {

    }
    public void cadastrarNota(int nota, double valorNota) {

    }
    public boolean aprovado() {

    }
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media + notas[];
    }
}
