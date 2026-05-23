import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String tipoQuarto, nomeHospede, cpfHospede, telefoneHospede;
        int numeroQuarto;
        double faturamentoDia;
        
        
        Quarto[] quartos = new Quarto[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Qual o número do quarto?");
            numeroQuarto = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual o tipo do quarto?");
            tipoQuarto = scanner.nextLine();
            quartos[i] = new Quarto(numeroQuarto, tipoQuarto);
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println("Quarto número: " + quartos[i].getQuartoNumero() +
                             "\n Status de ocupação: " + quartos[i].getQuartoOcupado() +
                             "\n Hospede ocupante: " + quartos[i].getHospedeAtual());
            
        }

        
    }
}
