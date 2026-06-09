public abstract class Quarto implements Financeiro{
    protected int numero;
    protected double precoBase;
    protected boolean isOcupado;

    public Quarto(int qNumero, double qPrecoBase) {
        this.numero = qNumero;
        this.precoBase = qPrecoBase;
        this.isOcupado = false;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public boolean getIsOcupado() {
        return this.isOcupado;
    }

    public void setIsOcupado(boolean setOcupacao) {
        this.isOcupado = setOcupacao;
    }
}
