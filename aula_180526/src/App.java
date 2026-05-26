import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        double valor;
        String nomeConta;
        Conta conta = new Conta(null);
        do{
            System.out.println("Escolha uma opção: \n1-Acessar conta\n2-Cadastrar conta\n3-Sair");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Qual o nome do titular?");
                    scanner.nextLine();
                    nomeConta = scanner.nextLine();
                    conta.acessarConta(nomeConta);
                    break;
                
                case 2:
                    System.out.println("Qual o nome do titular?");
                    scanner.nextLine();
                    nomeConta = scanner.nextLine();
                    conta.setTitular(nomeConta);
                    break;
                
                case 3:
                    System.out.println("Encerrando programa!");
                    break;
            
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (conta.getConfirmacao() == false && escolha!=3);

        if (conta.getConfirmacao() == true){
                do{
                System.out.println(conta.getTitular() + " escolha uma opção: \n1-Depositar\n2-Sacar\n3-Consultar saldo\n4-Sair");
                escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Digite o valor a ser depositado: ");
                        valor = scanner.nextDouble();
                        conta.depositar(valor);
                        break;
                    
                    case 2:
                        System.out.println("Digite o valor a ser sacado: ");
                        valor = scanner.nextDouble();
                        conta.sacar(valor);
                        break;
                    
                    case 3:
                        System.out.println("Seu saldo é de: R$" + conta.getSaldo());
                        break;
                    
                    case 4:
                        System.out.println("Encerrando programa!");
                        break;
                    
                    default:
                        System.out.println("Opção invalida");
                        break;
                }

            } while(escolha!=4);
        }

        scanner.close();
    }
}
