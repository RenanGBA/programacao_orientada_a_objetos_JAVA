public class ProdutoDigital extends Produto{
    public ProdutoDigital(String pProdutoDigital, double pPrecoBase) {
        super(pProdutoDigital, pPrecoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal()-(super.calcularPrecoFinal()*0.10);
    }
}
