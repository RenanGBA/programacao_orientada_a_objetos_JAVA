public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(String fNome, double fSalarioBase) {
        super(fNome, fSalarioBase);
    }

    @Override
    public double calcularSalarioLiquido() {
        return this.salarioBase+500;
    }
    
}
