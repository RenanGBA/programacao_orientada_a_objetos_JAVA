public class Quarto {
    private int quartoNumero, quartoDiasOcupados;
    private String quartoTipo;
    private double valorDiaria;
    private boolean quartoOcupado;
    private Hospede hospedeAtual = new Hospede(null, null, null);

    public Quarto(int Qnumero, String Qtipo) {
        this.quartoNumero = Qnumero;
        this.quartoTipo = Qtipo;
        this.quartoOcupado = false;
        this.quartoDiasOcupados = 0;
        if (this.quartoTipo.equals("Simples") || this.quartoTipo.equals("simples")) {
            this.valorDiaria = 100.00;
        } else if (this.quartoTipo.equals("Luxo") || this.quartoTipo.equals("luxo")) {
            this.valorDiaria = 250.00;
        }
        this.hospedeAtual = new Hospede(null, null, null);
    }

    public void checkIn(Hospede novoHospede, int diasOcupados) {
        if (quartoOcupado == false) {
            this.quartoOcupado = true;
            this.hospedeAtual = novoHospede;
            this.quartoDiasOcupados = diasOcupados;
            System.out.println("Sucesso!");
        } else {
            System.out.println("Quarto ocupado!");
        }
    }

    public double checkOut() {
        return this.quartoDiasOcupados * this.valorDiaria;
    }

    public int getQuartoNumero() {
        return this.quartoNumero;
    }

    public int getQuartoDiasOcupados() {
        return this.quartoDiasOcupados;
    }

    public String getQuartoTipo() {
        return this.quartoTipo;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public boolean getQuartoOcupado() {
        return this.quartoOcupado;
    }

    public String getHospedeAtual() {
        String status = "Quarto desocupado!";
        if (this.hospedeAtual != null) {
            return this.hospedeAtual.getHospedeNome();
        } else {
            return status;
        }
    }

    public void setQuartoOcupado() {
        this.quartoOcupado = false;
    }

    public void setHospedeAtual() {
        this.hospedeAtual = null;
    }

    public void setQuartoDiasOcupados() {
        this.quartoDiasOcupados = 0;
    }
}
