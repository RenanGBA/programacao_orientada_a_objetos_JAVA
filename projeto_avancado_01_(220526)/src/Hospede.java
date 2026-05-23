public class Hospede {
    private String hospedeNnome, hospedeCpf, hospedeTelefone;

    public Hospede(String HNome, String HCpf, String HTelefone) {
        this.hospedeNnome = HNome;
        this.hospedeCpf = HCpf;
        this.hospedeTelefone = HTelefone;
    }

    public String getHospedeNome(){
        return this.hospedeNnome;
    }

    public String getHospedeCpf(){
        return this.hospedeCpf;
    }

    public String getHospedeTelefone(){
        return this.hospedeTelefone;
    }

    
}
