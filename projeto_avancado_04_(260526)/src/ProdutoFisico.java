public class ProdutoFisico  extends Produto{
    protected double pesoKG;
    public ProdutoFisico(String pProdutoDigital, double pPrecoBase, double pPesoKG) {
        super(pProdutoDigital, pPrecoBase);
        this.pesoKG = pPesoKG;
    }

    @Override
    public double calcularPrecoFinal() {
        if (this.pesoKG <= 1){
            return super.calcularPrecoFinal()+(5);
        } else {
            return super.calcularPrecoFinal()+(pesoKG*5);
        }
    }
    
}
