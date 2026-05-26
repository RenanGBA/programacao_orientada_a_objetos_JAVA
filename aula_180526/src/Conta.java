public class Conta {
    private String titular;
    private double saldo;
    private boolean confirmacao;

    public Conta(String cTitular){
        this.titular = cTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor){
        this.saldo+=valor;
        System.out.println("Seu saldo é de: R$" + this.saldo);
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo-=valor;
            System.out.println("Sacando R$" + valor);
            System.out.println("Seu saldo é de: R$" + this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void acessarConta(String nome){
        if (nome.equals(this.titular)){
            this.confirmacao = true;
            System.out.println("Acessando conta!");
        } else {
            System.out.println("Conta inexistente!");
        }
    }

    public boolean getConfirmacao() {
        return this.confirmacao;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String nome) {
        this.titular = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
