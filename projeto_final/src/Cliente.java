public class Cliente {
    private String nome, CPF;

    public Cliente(String cNome, String cCPF) {
        this.nome = cNome;
        this.CPF = cCPF;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.CPF;
    }
}
