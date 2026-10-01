public class Descanso {
    // Atributos
    private int horasDescanso;
    private int numeroSemanas;
    // Construtor
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    // Métodos
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

    private String verif() {
    }

    public int hashCode() {
        return getStatusGeral().hashCode();
    }
}
