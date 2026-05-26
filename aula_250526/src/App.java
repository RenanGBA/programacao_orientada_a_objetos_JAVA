public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Produto Teste", 100);
        ProdutoFisico produtoFisico = new ProdutoFisico("Produto Fisico Teste", 100);
        ProdutoDigital produtoDigital = new ProdutoDigital("Produto Digital Teste", 100);

        System.out.println("O preço final do Produto Teste é: R$" + produto.calcularPrecoFinal());
        System.out.println("O preço final do Produto Fisico Teste é: R$" + produtoFisico.calcularPrecoFinal());
        System.out.println("O preço final do Produto Digital Teste é: R$" + produtoDigital.calcularPrecoFinal());
    }

}
