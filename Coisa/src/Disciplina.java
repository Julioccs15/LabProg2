public class Disciplina {
    // Atributos
    private String nomeDisciplina;
    private int horasEstudo = 0;
    private double[] notas = {0, 0, 0, 0};
    // Construtor
    public void Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    // Métodos
    public void cadastraHoras(int horas) {
        horasEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota) {
        notas[(nota - 1)] = valorNota;
    }
    public boolean aprovado() {
        if (media(this.notas) >= 7) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return this.nomeDisciplina + " " + this.horasEstudo + " " + media(this.notas) + this.notas;
    }
    private double media(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
    }
}
