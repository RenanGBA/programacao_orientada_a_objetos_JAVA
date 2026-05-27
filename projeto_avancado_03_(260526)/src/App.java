public class App {
    public static void main(String[] args) throws Exception {
        Funcionario[] funcionario = new Funcionario[4];
        double salarioFinal = 0;

        funcionario[0] = new Funcionario("funcionarioTeste", 1000);
        funcionario[1] = new FuncionarioCLT("funcionarioTesteCLT", 1000);
        funcionario[2] = new FuncionarioPJ("funcionarioTestePJ", 1000);
        funcionario[3] = new Diretor("diretorTeste", 1000,100);
        for (Funcionario iFuncionario : funcionario) {
            System.out.println(iFuncionario.nome + ": " + iFuncionario.calcularSalarioLiquido());
            salarioFinal+=iFuncionario.calcularSalarioLiquido();
        }

        System.out.println("Custo total da folha: R$" + salarioFinal);
    }
}
