public class Conta {
    String titular;
    double saldo;
    boolean confirmacao = false;
    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public void sacar(double valor){
        if (valor < saldo){
            saldo-=valor;
            System.out.println("Sacando R$" + valor);
            System.out.println("Seu saldo é de: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void acessarConta(String nome){
        if (nome.equals(titular)){
            confirmacao = true;
            System.out.println("Acessando conta!");
        } else {
            System.out.println("Conta inexistente!");
        }
    }

    public void criarConta(String nome){
        titular = nome;
    }
}
