public class IngressoVip extends Ingresso{
    public IngressoVip(String iNomeEvento, double iValorBase) {
        super(iNomeEvento, iValorBase);
    }

    @Override
    public double calcularValorFinal(){
        return this.valorBase+120;
    }

    @Override
    public void imprimirTicket() {
        System.out.println(this.nomeEvento + " VIP: " + calcularValorFinal());
        System.out.println("-- ACESSO VIP LIBERADO --");
    }
}
