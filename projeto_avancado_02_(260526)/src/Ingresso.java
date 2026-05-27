public class Ingresso {
    protected String nomeEvento;
    protected double valorBase;

    public Ingresso (String iNomeEvento, double iValorBase) {
        this.nomeEvento = iNomeEvento;
        this.valorBase = iValorBase;
    }

    public double calcularValorFinal(){
        return this.valorBase;
    }

    public void imprimirTicket() {
        System.out.println(this.nomeEvento + ": " + calcularValorFinal());
    }
}