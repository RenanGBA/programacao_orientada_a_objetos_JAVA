public class QuartoSimples extends Quarto{
    public QuartoSimples(int qNumero, double qPrecoBase) {
        super(qNumero, qPrecoBase);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase*diarias;
    }
}
