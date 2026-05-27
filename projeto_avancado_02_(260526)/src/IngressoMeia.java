public class IngressoMeia extends Ingresso{
    
    public IngressoMeia(String iNomeEvento, double iValorBase) {
        super(iNomeEvento, iValorBase);
    }

    @Override
    public double calcularValorFinal(){
        return this.valorBase/2;
    }

    @Override
    public void imprimirTicket() {
        System.out.println(this.nomeEvento + " meia entrada: " + calcularValorFinal());
    }
}
