public class Hospedagem {
    private Quarto quarto;
    private Cliente hospede;
    private int diarias;
    private boolean isAtiva;
    private double valorTotal;

    public Hospedagem(Quarto hQuarto, Cliente hHospede, int hDiarias) {
        this.quarto = hQuarto;
        this.hospede = hHospede;
        this.diarias = hDiarias;
        this.isAtiva = true;
        this.valorTotal = 0;
    }

    public Quarto getQuarto() {
        return this.quarto;
    }

    public Cliente getHospede() {
        return this.hospede;
    }

    public int getDiarias() {
        return this.diarias;
    }

    public boolean getIsAtiva() {
        return this.isAtiva;
    }

    public void setIsAtiva(boolean status) {
        this.isAtiva = status;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valor) {
        this.valorTotal = valor;
    }
}
