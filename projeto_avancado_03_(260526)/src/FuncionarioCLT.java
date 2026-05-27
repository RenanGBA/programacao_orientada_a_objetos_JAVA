public class FuncionarioCLT extends Funcionario{
    public FuncionarioCLT(String fNome, double fSalarioBase) {
        super(fNome, fSalarioBase);
    }

    @Override
    public double calcularSalarioLiquido() {
        return this.salarioBase-(salarioBase*.06)-(salarioBase*.08);
    }
}
