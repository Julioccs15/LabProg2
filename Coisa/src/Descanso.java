public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;

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
}
