import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeTitular;
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(null);

        System.out.println("Insira o nome do titular");
        nomeTitular = scanner.nextLine();

        conta.setTitular(nomeTitular);
        System.out.println("Titular: " + conta.getTitular() + " Saldo: " + conta.getSaldo());
    }
}


