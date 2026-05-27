public class App {
    public static void main(String[] args) throws Exception {
        Produto[] produtos = new Produto[4];
        double valorFinal = 0;

        produtos[0] = new Produto("produtoTeste", 100);
        produtos[1] = new ProdutoDigital("produtoDigitalTeste", 100);
        produtos[2] = new ProdutoFisico("produtoFisicoTeste", 100,5);
        produtos[3] = new ProdutoPerecivel("produtoPerecivelTeste", 100,5,1);

        for (Produto iproduto : produtos) {
            System.out.println(iproduto.nome + ": " + iproduto.calcularPrecoFinal());
            valorFinal+=iproduto.calcularPrecoFinal();
        }

        System.out.println("Valor final: R$" + valorFinal);
    }
}
