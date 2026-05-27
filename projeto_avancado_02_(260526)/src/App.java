public class App {
    public static void main(String[] args) throws Exception {
        Ingresso[] ingresso = new Ingresso[3];
        double faturamentoFinal = 0;

        ingresso[0] = new Ingresso("Show de Rock", 100.0);
        ingresso[1] = new IngressoMeia("Show de Rock", 100.0);
        ingresso[2] = new IngressoVip("Show de Rock", 100.0);

        for (int i = 0;i < ingresso.length;i++){
            faturamentoFinal+=ingresso[i].calcularValorFinal();
            ingresso[i].imprimirTicket();
        }

        System.out.println("Faturamento final da bilheteria: R$" + faturamentoFinal);
    }
}
