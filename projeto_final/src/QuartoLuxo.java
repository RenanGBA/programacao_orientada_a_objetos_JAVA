public class QuartoLuxo extends Quarto{
    public QuartoLuxo(int qNumero, double qPrecoBase) {
        super(qNumero, qPrecoBase);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase*diarias*1.20;
    }

}
