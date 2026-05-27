public class ProdutoPerecivel extends ProdutoFisico{
    protected int diasParaVencer;
    public ProdutoPerecivel(String pNome, double pPrecoBase, double pPesoKG, int pDiasParaVencer) {
        super(pNome, pPrecoBase, pPesoKG);
        this.diasParaVencer = pDiasParaVencer;
    }

    @Override
    public double calcularPrecoFinal() {
        if (diasParaVencer <= 3){
            if (this.pesoKG <= 1){
                return super.calcularPrecoFinal()+(5)-((super.calcularPrecoFinal()+5)*.3);
            } else {
                return super.calcularPrecoFinal()+(pesoKG*5)-((super.calcularPrecoFinal()+(pesoKG*5))*.3);
            }
        } else {
            if (this.pesoKG <= 1){
                return super.calcularPrecoFinal()+(5);
            } else {
                return super.calcularPrecoFinal()+(pesoKG*5);
            }
        }
    }
}