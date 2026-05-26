public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String pNome, double pPrecoBase) {
        this.nome = pNome;
        this.precoBase = pPrecoBase;
    }

    public double calcularPrecoFinal(){
        return precoBase + (precoBase*.10);
    }
}
