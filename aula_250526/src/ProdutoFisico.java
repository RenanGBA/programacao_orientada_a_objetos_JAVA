public class ProdutoFisico extends Produto {
    public ProdutoFisico(String pNome, double pPrecoBase) {
        super(pNome, pPrecoBase);
    }

    @Override
    public double calcularPrecoFinal(){
        return precoBase+(precoBase*.10)+50;
    }
}
