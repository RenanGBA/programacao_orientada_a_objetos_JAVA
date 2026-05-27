public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String fNome, double fSalarioBase) {
        this.nome = fNome;
        this.salarioBase = fSalarioBase;
    }

    public double calcularSalarioLiquido() {
        return this.salarioBase;
    }
}
