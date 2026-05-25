import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String tipoQuarto, nomeHospede, cpfHospede, telefoneHospede;
        int numeroQuarto, diasOcupados, escolha;
        double faturamentoDia = 0;

        Quarto[] quartos = new Quarto[1];

        for (int i = 0; i < quartos.length; i++) {
            numeroQuarto = i + 1;
            System.out.println("Informe o tipo de quarto para o número: " + numeroQuarto);
            tipoQuarto = scanner.nextLine();
            quartos[i] = new Quarto(numeroQuarto, tipoQuarto);
        }

        

        do {
            System.out.println(
                    "Por favor, escolha uma da opções: \n1-Verificar o status dos quartos.\n2-Realizar Check-In" +
                            "\n3-Realizar Check-Out\n4-Realizar fechamento de caixa\n5-Sair");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    for (int i = 0; i < quartos.length; i++) {
                        System.out.println("Quarto número: " + quartos[i].getQuartoNumero() +
                                "\n Status de ocupação: " + quartos[i].getQuartoOcupado() +
                                "\n Hospede ocupante: " + quartos[i].getHospedeAtual());
                    }
                    break;

                case 2:
                    System.out.println("Qual o número do quarto?");
                    numeroQuarto = scanner.nextInt();
                    if (quartos[numeroQuarto - 1].getQuartoOcupado() == false) {
                        scanner.nextLine();
                        System.out.println("Qual o nome do hospede");
                        nomeHospede = scanner.nextLine();
                        System.out.println("Qual o CPF do hospede?");
                        cpfHospede = scanner.nextLine();
                        System.out.println("Qual o telefone do hospede?");
                        telefoneHospede = scanner.nextLine();
                        Hospede hospede = new Hospede(nomeHospede, cpfHospede, telefoneHospede);

                        System.out.println("Quantos dias ele ficará hospedado?");
                        diasOcupados = scanner.nextInt();
                        quartos[numeroQuarto - 1].checkIn(hospede, diasOcupados);
                    } else {
                        System.out.println("Quarto atualmente ocupado!");
                    }
                    break;
                
                case 3:
                    System.out.println("Qual o número do quarto?");
                    numeroQuarto = scanner.nextInt();
                    System.out.println("Valor a ser pago: R$" + quartos[numeroQuarto - 1].checkOut());
                    faturamentoDia += quartos[numeroQuarto - 1].checkOut();
                    quartos[numeroQuarto - 1].
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (escolha != 5);
    }
}
