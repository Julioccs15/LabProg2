public class RegistroTempoOnline {
    // Atributos
    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;
    // Construtor
    public void RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }
    public void RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    // Métodos
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnline >= this.tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoOnlineEsperado;
    }
}