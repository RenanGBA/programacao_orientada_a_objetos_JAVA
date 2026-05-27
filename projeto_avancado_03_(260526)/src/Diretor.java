public class Diretor extends FuncionarioCLT{
    protected double bonusParticipacao;
    public Diretor(String dNome, double dSalarioBase, double dBonusParticipacao) {
        super(dNome, dSalarioBase);
        this.bonusParticipacao = dBonusParticipacao;
    }

    @Override
    public double calcularSalarioLiquido() {
        return super.calcularSalarioLiquido()+this.bonusParticipacao;
    }
}
