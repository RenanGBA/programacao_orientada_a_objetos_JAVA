public class ProdutoDigital extends Produto{
    public ProdutoDigital(String pNome, double pPrecoBase) {
        super(pNome, pPrecoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        return precoBase;
    }
}
