public class Conta {
    String titular;
    double saldo;
    boolean confirmacao;

    public void depositar(double valor){
        this.saldo+=valor;
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public void sacar(double valor){
        if (valor < this.saldo){
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

    public void criarConta(String nome){
        this.titular = nome;
    }
}
