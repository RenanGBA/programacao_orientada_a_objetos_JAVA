import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Quarto[] quartos = new Quarto[5];
        int opcao;

        quartos[0] = new QuartoSimples(101, 100);
        quartos[1] = new QuartoLuxo(102, 200);
        quartos[2] = new QuartoSimples(103, 100);
        quartos[3] = new QuartoLuxo(104, 200);
        quartos[4] = new QuartoSimples(105, 100);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Hospedagem> hospedagens = new ArrayList<>();


        do{
            
            System.out.println("=== Mapa de Quartos ===");
            for (Quarto q : quartos) {
                if (q.getIsOcupado()) {
                    System.out.println(q.getNumero() + "- [Ocupado]");
                } else {
                    System.out.println(q.getNumero() + "- [Livre]");
                }
            }
            
            System.out.println("=====================");

            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Check-in");
            System.out.println("3. Check-out");
            System.out.println("4. Realizar balanço de caixa");
            System.out.println("5. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("Digite o nome do cliente");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o CPF do cliente");
                    String cpf = scanner.nextLine();

                    clientes.add(new Cliente(nome, cpf));
                    break;

                case 2:

                    for(int i = 0; i<clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }

                    System.out.println("Digite o indice do cliente");
                    int cID = scanner.nextInt();

                    System.out.println("Digite o número do quarto");
                    int nQuarto = scanner.nextInt();

                    System.out.println("Digite o número de diárias");
                    int nDiarias = scanner.nextInt();

                    for (Quarto q : quartos) {
                        if(!q.getIsOcupado() && q.getNumero() == nQuarto) {
                            q.setIsOcupado(true);
                            hospedagens.add(new Hospedagem(q, clientes.get(cID), nDiarias));
                            break;
                        }
                        
                    }
                    break;

                case 3:
                    
                    System.out.println("Digite o número do quarto para checkout");
                    int nOut = scanner.nextInt();
                    
                    for(Hospedagem h: hospedagens) {
                        if (h.getQuarto().getNumero() == nOut && h.getIsAtiva()) {
                            double total = h.getQuarto().calcularTotal(h.getDiarias());
                            System.out.println("Total a pagar: R$" + total);
                            h.getQuarto().setIsOcupado(false);
                            h.setIsAtiva(false);
                            h.setValorTotal(total);
                            System.out.println("Check-out realizado!");
                        }
                    }
                    break;
                case 4:
                    
                    double totalCaixa = 0;
                    for(Hospedagem h: hospedagens) {
                        if (!h.getIsAtiva()) {
                            totalCaixa += h.getValorTotal();
                        }
                    }

                    System.out.println("Balaço de caixa: R$" + totalCaixa);
                    break;
                case 5:
                    System.out.println("Encerrando programa!");
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        } while (opcao!=5);






        scanner.close();
    }
}
