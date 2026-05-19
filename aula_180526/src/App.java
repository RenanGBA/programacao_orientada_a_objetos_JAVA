import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        int escolha;
        double valor;

        do{
            System.out.println("Escolha uma opção: \n1-Acessar conta\n2-Cadastrar conta\n3-Sair");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Qual o nome do titular?");
                    scanner.nextLine();
                    conta.titular = scanner.nextLine();
                    conta.acessarConta(conta.titular);
                    break;
                
                case 2:
                    System.out.println("Qual o nome do titular?");
                    scanner.nextLine();
                    conta.titular = scanner.nextLine();
                    conta.criarConta(conta.titular);
                    break;
                
                case 3:
                    System.out.println("Encerrando programa!");
                    break;
            
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (conta.confirmacao == false && escolha!=3);

        if (conta.confirmacao == true){
                do{
                System.out.println(conta.titular + " escolha uma opção: \n1-Depositar\n2-Sacar\n3-Sair");
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
                        System.out.println("Encerrando programa!");
                        break;
                    
                    default:
                        System.out.println("Opção invalida");
                        break;
                }

            } while(escolha!=3);
        }

        scanner.close();
    }
}
