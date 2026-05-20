public class ContaBancaria {
   private String titular;
   private double saldo;

   public ContaBancaria(String cTitular) {
      this.titular = cTitular;
      this.saldo = 0.0;
   }

   public String getTitular() {
      return this.titular;
   }

   public void setTitular(String nome) {
      this.titular = nome;
   }

   public double getSaldo() {
      return this.saldo;
   }
}
